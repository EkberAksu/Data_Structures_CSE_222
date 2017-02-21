/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmantrees;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 *
 * @author Akbar Aziz
 */
public class PriorityQueueBST< E > extends AbstractQueue < E >{
    
    BinaryTree<E> theQueue;
    /** An optional reference to a Comparator object. */
    private Comparator < E > comparator = null;
    /** Return value from the public add method. */
    protected boolean addReturn;
    /** Return value from the public delete method. */
    protected E deleteReturn;
    /**The size of the queue.*/
    private int size;
    
    //Methods
    public PriorityQueueBST(){
        theQueue= new BinaryTree<E>();
        size =0;
    }
    
    /** Creates a heap-based priority queue with the specified initial
       capacity that orders its elements according to the specified
       comparator.
       @param cap The initial capacity for this priority queue
       @param comp The comparator used to order this priority queue
       @throws IllegalArgumentException if cap is less than 1
   */
    public PriorityQueueBST( Comparator < E > comp) {
        theQueue = new BinaryTree< E > ();
        comparator = comp;
        size=0;
    }
    
    @Override
    public boolean offer(E e) {
        if(e==null) return false;
        
        if(this.addItem(e)){
            ++size;
            return true;
        }
        return false;
    }
    /**
     * adds the element to the proper place.
     * @pre The object to insert must implement the
     *      Comparable interface.
     * @param item The object being inserted
     * @return true if the object is inserted, false
     *         if the object already exists in the tree
     */
    private boolean addItem(E item) {
        theQueue.root = add(theQueue.root, item);
        return addReturn;
    }
    /**
     * Recursive add method.
     * @post The data field addReturn is set true if the item is added to
     *       the tree, false if the item is already in the tree.
     * @param localRoot The local root of the subtree
     * @param item The object to be inserted
     * @return The new local root that now contains the
     *         inserted item
     */
    private BinaryTree.Node<E> add(BinaryTree.Node<E> localRoot, E item) {
        if (localRoot == null) {
            // item is not in the tree � insert it.
            addReturn = true;
            return new BinaryTree.Node<E>(item);
        } else if (compare(item, localRoot.data) == 0) {
            // item is equal to localRoot.data
            addReturn = false;
            return localRoot;
        } else if (compare(item, localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {
            // item is greater than localRoot.data
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }
    @Override
    public E poll() {
        if(theQueue.root==null) return null;
        --size;
        E data=findSmallestChild(theQueue.root);
        return delete(theQueue.root, data).data;
    }
    @Override
    public E peek() {
        if(theQueue.root==null) return null;
        return findSmallestChild(theQueue.root);
    }
    /**
     * Recursive delete method.
     * @post The item is not in the tree;
     *       deleteReturn is equal to the deleted item
     *       as it was stored in the tree or null
     *       if the item was not found.
     * @param localRoot The root of the current subtree
     * @param item The item to be deleted
     * @return The modified local root that does not contain
     *         the item
     */
    private BinaryTree.Node<E> delete(BinaryTree.Node<E> localRoot, E item) {
        if (localRoot == null) {
            // item is not in the tree.
            deleteReturn = null;
            return localRoot;
        }

        // Search for item to delete.
        int compResult = compare(item, localRoot.data);
        if (compResult < 0) {
            // item is smaller than localRoot.data.
            localRoot.left = delete(localRoot.left, item);
            return localRoot;
        } else if (compResult > 0) {
            // item is larger than localRoot.data.
            localRoot.right = delete(localRoot.right, item);
            return localRoot;
        } else {
            // item is at local root.
            deleteReturn = localRoot.data;
            if (localRoot.left == null) {
                // If there is no left child, return right child
                // which can also be null.
                return localRoot.right;
            } else if (localRoot.right == null) {
                // If there is no right child, return left child.
                return localRoot.left;
            } else {
                // Node being deleted has 2 children, replace the data
                // with inorder predecessor.
                if (localRoot.left.right == null) {
                    // The left child has no right child.
                    // Replace the data with the data in the
                    // left child.
                    localRoot.data = localRoot.left.data;
                    // Replace the left child with its left child.
                    localRoot.left = localRoot.left.left;
                    return localRoot;
                } else {
                    // Search for the inorder predecessor (ip) and
                    // replace deleted node's data with ip.
                    localRoot.data = findLargestChild(localRoot.left);
                    return localRoot;
                }
            }
        }
    }
    /**
     * Find the node that is the
     * inorder predecessor and replace it
     * with its right child (if any).
     * @post The inorder predecessor is removed from the tree.
     * @param parent The parent of possible inorder
     *        predecessor (ip)
     * @return The data in the ip
     */
    private E findSmallestChild(BinaryTree.Node<E> parent) {
        // If the right child has no right child, it is
        // the inorder predecessor.
        if (parent.left.left == null) {
            E returnValue = parent.left.data;
            parent.left = parent.left.right;
            return returnValue;
        } else {
            return findSmallestChild(parent.left);
        }
    }
    
    /**
     * Find the node that is the
     * inorder predecessor and replace it
     * with its left child (if any).
     * @post The inorder predecessor is removed from the tree.
     * @param parent The parent of possible inorder
     *        predecessor (ip)
     * @return The data in the ip
     */
    private E findLargestChild(BinaryTree.Node<E> parent) {
        // If the right child has no right child, it is
        // the inorder predecessor.
        if (parent.right.right == null) {
            E returnValue = parent.right.data;
            parent.right = parent.right.left;
            return returnValue;
        } else {
            return findLargestChild(parent.right);
        }
    }
    /**
     * Returns the in-order representation for the given tree.
     * 
     * @return  the iterator for preorder traversal
     */
    @Override
    public Iterator<E> iterator() {
        return new InOrderItr();
    }

    private class TreeNodeDataInOrder {
        BinaryTree.Node<E> treeNode;
        boolean visitedLeftBranch;

        TreeNodeDataInOrder(BinaryTree.Node<E> treeNode, Boolean foo) {
            this.treeNode = treeNode;
            this.visitedLeftBranch = foo;
        }
    }

    private class InOrderItr implements Iterator<E> {
        private final Stack<TreeNodeDataInOrder> stack;

        public InOrderItr() {
            stack = new Stack<TreeNodeDataInOrder>();
            stack.add(new TreeNodeDataInOrder(theQueue.root, false));
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public E next() {
            if (!hasNext()) 
                throw new NoSuchElementException("No more nodes remain to iterate");

            while (hasNext()) {
                final TreeNodeDataInOrder treeNodeData = stack.peek();
                final BinaryTree.Node<E> treeNode = treeNodeData.treeNode;

                if (!treeNodeData.visitedLeftBranch) {
                    if (treeNode.left != null) {
                        stack.add(new TreeNodeDataInOrder(treeNode.left, false));
                    }
                    treeNodeData.visitedLeftBranch = true;
                } else {
                    stack.pop();
                    if (treeNode.right != null) {
                        stack.add(new TreeNodeDataInOrder(treeNode.right, false));
                    }
                    return treeNode.data;
                }
            }
            throw new AssertionError("A node has not been returned when it should have been.");
        }
    }
   

    @Override
    public int size() {
        return size;
    }
    /** Compare two items using either a Comparator object’s compare method
       or their natural ordering using method compareTo.
       pre: If comparator is null, left and right implement Comparable<E>.
       @param left One item
       @param right The other item
       @return Negative int if left less than right,
          0 if left equals right,
          positive int if left > right
       @throws ClassCastException if items are not Comparable
   */
    private int compare(E left, E right) {
      if (comparator != null) { // A Comparator is defined.
        return comparator.compare(left, right);
      }
      else { // Use left’s compareTo method.
        return ( (Comparable < E > ) left).compareTo(right);
      }
    }
    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty(){
        return theQueue.root==null;
    }
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        if(this.isEmpty()) return null;
        Iterator iter= this.iterator();
        while(iter.hasNext()){
            str.append(iter.next());
            if(iter.hasNext()) str.append("<--");
        }
        return str.toString();
    }
}
