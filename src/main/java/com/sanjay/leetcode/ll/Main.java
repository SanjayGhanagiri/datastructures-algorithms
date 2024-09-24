package com.sanjay.leetcode.ll;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");
        FindMiddle findMiddle = new FindMiddle(1);
        findMiddle.append(2);
        findMiddle.append(3);
        findMiddle.append(4);
        findMiddle.append(5);
        findMiddle.append(6);
        findMiddle.printAll();
        FindMiddle.Node middle = findMiddle.findMiddleNode();
        System.out.println("Value" + middle.value);

    }
}
