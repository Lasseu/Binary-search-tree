package com.lasseu;

public class binarySearchTree {

    private class treeNode {
        int count;
        String data;
        treeNode left, right;

        public treeNode(String value) {
            data = value;
            left = right = null;
            count = 1;
        }

        void write() {
            System.out.println(data + " " + count );
        }
    }

    private treeNode root;

    public void binarySearchTree() {
        root = null;

    }

    public boolean isEmpty() {
        return (root == null);
    }

    public void insert (String value) {
        treeNode newNode = new treeNode(value);

        if (isEmpty()) {
            root = newNode;
            return;
        }

        treeNode current = root;
        boolean finished = false;

        while (!finished) {
            if (value.compareTo(current.data)<0) {
                if (current.left == null) {
                    current.left = newNode;
                    finished = true;
                }
                else {
                    current = current.left;
                }
            }
            else if (value.compareTo(current.data) > 0) {
                if (current.right == null) {
                    current.right = newNode;
                    finished = true;
                }
                else {
                    current = current.right;
                }
            }
            else if (value.equals(current.data)){
                finished = true;
                current.count++;
            }
        }
    }


    public void inorder() {
        inorder(root);
    }

    private void inorder(treeNode t) {
        if (t != null) {
            inorder(t.left);
            t.write();
            inorder(t.right);
        }
    }
}
