package com.sanjay;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public LinkedList() {
    }

    public void getHead() {
        if (this.length > 0) {
            System.out.println("Head:" + this.head.value);
        } else {
            System.out.println("Empty");
        }
    }

    public void getTail() {
        if (this.length > 0) {
            System.out.println("Tail:" + this.tail.value);
        } else {
            System.out.println("Empty");
        }
    }

    public void getLength() {
        System.out.println("Length:" + this.length);
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        length++;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList is Empty!");
        } else if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node newTail = head;
            while (newTail.next.next != null) {
                newTail = newTail.next;
            }
            tail = newTail;
            tail.next = null;
        }
        length--;
    }


    public void removeFirst() {
        if (length == 0) {
            System.out.println("LinkedList is Empty!");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        //tail still points to last item.
        if (length == 0) {
            tail = null;
        }
    }

    public void removeLastUsingPreTemp() {
        if (length == 0) {
            System.out.println("LinkedList is Empty!");
        } else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
        }
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Index is invalid");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        if (length == 0) {
            System.out.println("LinkedList is Empty!");
        } else if (length == 1) {
            System.out.println(this.head.value);
        } else {
            Node newNode = this.head;
            while (newNode != null) {
                System.out.println(newNode.value);
                newNode = newNode.next;
            }
        }
        System.out.println("-------------------------");
    }

    public boolean insert(int index, int value) {
        Node newNode = new Node(value);
        if (index < 0 || index > length + 1) {
            System.out.println("Index is invalid");
            return false;
        }
        if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node tempsNext = temp.next;
            temp.next = newNode;
            newNode.next = tempsNext;
        }

        length++;
        return true;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public void remove(int index) {
        if (index < 0 || index >= length) return;
        else if (index == 0) removeFirst();
        else if (index == length - 1) removeLast();
        else {
            Node prev = get(index - 1);
            Node temp = prev.next;
            prev.next = temp.next;
            temp.next = null;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }
}
