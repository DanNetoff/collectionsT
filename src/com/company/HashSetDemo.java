package com.company;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by uitschool JV on 11/8/2015.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        /*
        LinkedList<String> al = new LinkedList<String>();

        System.out.println("Size " + al.size());

    //    String s=null;

        al.add("B");
        al.add("A");
        al.add("C");
        al.add("Y");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size " + al.size());

        System.out.println("Contains " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("Size " + al.size());

        System.out.println("Contains " + al);


        Queue<String> queue = new LinkedList<String>();

        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        while(queue.size() > 0) {
            System.out.println(queue.remove());
        }



        List<String> myList = Arrays.asList("a1","a2","b1","c2","c1");

        myList.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

        */

        IntStream.range(0,5).forEach(System.out::println);

    }
}
