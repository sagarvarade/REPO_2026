package com.java.A_02_SinglyLinkedList;

public class SLList {
    public Node head;
    public Node tail;
    public int size;
    public static void main(String[] args) {
        SLList sList=new SLList();
        sList.createSinglyLinkedList(10);
        System.out.println(sList.head.value);
        sList.insertInLinkedList(20,2);
        sList.insertInLinkedList(30,3);
        System.out.println(sList.head.next.value);
        sList.print();
        sList.traverseList();
    }

    private void traverseList() {
        if(head==null){
            System.out.println("SLL does not exist !");
        }else {
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println();
    }

    private void print() {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" => ");
            temp=temp.next;
        }
        System.out.print("null\n");
    }

    private void insertInLinkedList(int nodeValue,int location) {
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if(location==0){
            node.next=head;
            head=node;
        } else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        } else {
            Node tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
        }
        size++;
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
