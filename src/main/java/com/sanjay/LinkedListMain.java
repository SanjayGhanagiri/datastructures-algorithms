package com.sanjay;

public class LinkedListMain {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.printList();

        //linkedList.removeLast();
        //linkedList.removeLastUsingPreTemp();

        //linkedList.prepend(0);
        //linkedList.removeFirst();
/*
        Node myNode = linkedList.get(0);
        System.out.println("My Node:" + myNode.value);*/

        //boolean status = linkedList.set(3, 9);

        /*boolean status = linkedList.insert(2, 9);*/

        /*linkedList.remove(0);*/

        linkedList.reverse();

        /*--------------------------------*/

        linkedList.printList();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

    }
}