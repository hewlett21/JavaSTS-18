package ru.enikhov.lesson32;

class Tree {
    private class Node {
        private int iData;
        private Node leftChild;
        private Node rightChild;

        private Node(int iData) {
            this.iData = iData;
            leftChild = null;
            rightChild = null;
        }

        @Override
        public String toString() {
            return "{" + iData + "}";
        }

        private boolean isLeaf() {
            return leftChild == null && rightChild == null;
        }
    }

    private Node root;

    public Node find(int key) {
        if (root == null) {
            return null;        //Дерево пустое;
        }
        Node current = root;
        while (current.iData != key) {
            if (current.iData > key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void print(Node startNode) {
        if (startNode != null) {        //условие сработает, когда мы достигним конца дерева и потомков не останется
            print(startNode.leftChild); //рекурсивно вызываем левых потомков
            System.out.print(startNode);//печатаем ноду
            print(startNode.rightChild);//вызов правых
        }
    }

    public void print() {
        print(root);
    }


    private int countLeaf(Node node) {
        int cnt = 1;
        if (node == null) {
            return 0;
        }
        if (!node.isLeaf()) {
            cnt = countLeaf(node.leftChild) + countLeaf(node.rightChild);
        }
        return cnt;
    }

    public int countLeaf() {
        return countLeaf(root);
    }
}
