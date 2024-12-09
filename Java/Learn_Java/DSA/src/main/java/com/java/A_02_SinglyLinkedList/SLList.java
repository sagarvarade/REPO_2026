package com.java.A_02_SinglyLinkedList;

public class SLList {
    public Node head;
    public Node tail;
    public int size;
    public static void main(String[] args) {
        SLList sList=new SLList();
        sList.createSinglyLinkedList(10);
        System.out.println(sList.head.value);
    }

    private Node createSinglyLinkedList(int nodeValue) {
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return  head;
    }
}
