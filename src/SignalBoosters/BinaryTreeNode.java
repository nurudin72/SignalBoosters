/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignalBoosters;

/**
 *
 * @author nurudin72
 */

public class BinaryTreeNode {
    Object element;
    BinaryTreeNode leftChild, rightChild;

    public BinaryTreeNode() {
    }

    public Object getElement() {
        return element;
    }

    public BinaryTreeNode(Object element, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this.element = element;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    BinaryTreeNode(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }
}