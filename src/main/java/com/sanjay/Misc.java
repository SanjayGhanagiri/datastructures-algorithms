package com.sanjay;

import java.util.ArrayList;
import java.util.List;

public class Misc {

    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        list1.add(1);
        list2 = list1;
        list1.add(12);
        System.out.println(list1);
        System.out.println(list2);
    }
}
