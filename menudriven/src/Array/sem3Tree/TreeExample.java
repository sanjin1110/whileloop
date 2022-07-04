package Array.sem3Tree;

import Array.sem3LinkedList.DoublyLinkedList;

public class TreeExample {

    public static class Node{
        Node right;
        Node left;
        String data;

        Node(String data){
            this.left=null;
            this.right=null;
            this.data=data;

        }

    }
    Node head = null;
    Node tail = null;

    public void printGraph(Node node){

        Node leftChild = node.left;
        Node rightChild = node.right;

        if(node == null || leftChild == null || rightChild == null){
            return;
        }


        System.out.println(node.data + " : " + leftChild.data + " , " + rightChild.data);



        printGraph(leftChild);
        printGraph(rightChild);

    }
//    public void append(String data){
//        Node newnode = new Node(data);
//        if (head==null){
//            head=tail=newnode;
//        }
//        else {
//            tail.right=newnode;
//            newnode.left=tail;
//            tail=newnode;
//        }
//    }
//    public void print(){  // reverse order
//        Node current = tail;
//        while (current!=null){
//            System.out.println(current.data);
//            current=current.left;
//        }
//    }

    public static void main(String[] args) {
        Node rootNode = new Node("A");
        Node b = rootNode.left = new Node("B");
        Node c = rootNode.right = new Node("C");
        b.left = new Node("D");
        b.right = new Node("E");

        c.left = new Node("F");
        c.right = new Node("G");
        TreeExample tr = new TreeExample();
        tr.printGraph(rootNode);
//        tr.append("A");
//        tr.append("B");
//        tr.append("C");
//        tr.print();

    }
}
