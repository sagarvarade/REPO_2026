package com.java.A_02_SinglyLinkedList;

import java.util.Objects;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private void printList(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }

    private int getLength(){
        ListNode current=head;
        int len=0;
        while(current!=null){
            current=current.next;
            len++;
        }
        return len;
    }

    private void insertFirstInBeginning(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    private void insertAtEnd(int i) {
        ListNode newNode=new ListNode(i);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    private void insertAtPosition(int number, int position) {
        ListNode node=new ListNode(number);
        if(position==1){
            node=head;
            head=node;
        }else{
            ListNode previous=head;
            int count=1;
            while (count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            node.next=current;
            previous.next=node;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
 /*       sll.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        sll.head.next=second;
        second.next=third;
  */
        sll.insertFirstInBeginning(10);
        sll.insertFirstInBeginning(8);
        sll.insertFirstInBeginning(5);
        sll.printList();
        sll.insertAtEnd(55);
        sll.insertAtEnd(56);
        sll.printList();
        sll.insertAtPosition(23,3);
        sll.printList();
        // Delete first node of list
        System.out.println("Node Deleted : "+ Objects.requireNonNull(sll.deleteFirst()).data);
        sll.printList();
        System.out.println("Node Deleted Last : "+sll.deleteLast().data);
        sll.printList();
        System.out.println("List length : "+sll.getLength());

    }

    private ListNode deleteLast() {
        if(head==null || head.next==null){
            return  head;
        }
        ListNode current=head;
        ListNode previous=null;
        while (current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    private ListNode deleteFirst() {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=temp.next;
        temp.next=null;
        return head;
    }


}
