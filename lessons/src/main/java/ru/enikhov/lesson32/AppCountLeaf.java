package ru.enikhov.lesson32;

public class AppCountLeaf {

    public static void main(String[] args) {
        int value;
        Tree theTree = new Tree();
        Tree.Node node;

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
        
        System.out.println(theTree.find(50));

        System.out.println("Ноды дерева:");
        node = theTree.getRoot();
        if (node != null) {
            theTree.print(node);
            System.out.println("\nКол-во листьев:");
            System.out.println(theTree.countLeaf(node));
        } else {
            System.out.println("Дерево пустое.");
        }
    }
}
