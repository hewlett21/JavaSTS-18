package ru.enikhov.lesson32;

class Node {
    public int iData;
    public Node leftChild;
    public Node rightChild;

    public Node(int iData) {
        this.iData = iData;
        leftChild = null;
        rightChild = null;
    }

    public void displayNode() {
        System.out.print('{');
        System.out.print(iData);
        System.out.print("} ");
    }
}

class Tree {
    private Node root;
    private int cntLeaf;

    public int getCntLeaf() {
        return cntLeaf;
    }

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (current.iData < key) {
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
            startNode.displayNode();    //печатаем ноду
            print(startNode.rightChild);//вызов правых
        }
    }


    public int countLeaf(Node startNode) {
        if (startNode == null) {
            return 0;
        } else if (startNode.leftChild != null || startNode.rightChild != null) {
            return countLeaf(startNode.leftChild) + countLeaf(startNode.rightChild);
        } else {
            return 1;
        }
    }
}

public class AppCountLeaf {

    public static void main(String[] args) {
        int value;
        Tree theTree = new Tree();

        theTree.insert(50);
        theTree.insert(25);
        theTree.insert(75);
        theTree.insert(12);
        theTree.insert(37);
        theTree.insert(43);
        theTree.insert(30);
        theTree.insert(33);
        theTree.insert(87);
        theTree.insert(93);
        theTree.insert(97);
        theTree.insert(15);
        theTree.insert(10);
        System.out.println("Ноды дерева:");
        theTree.print(theTree.find(50));
        System.out.println("\nКол-во листьев:");
        System.out.println(theTree.countLeaf(theTree.find(50)));
    }
}
