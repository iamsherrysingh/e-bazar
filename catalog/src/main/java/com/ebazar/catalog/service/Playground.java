package com.ebazar.catalog.service;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface A{
    void sayHello();
}

@FunctionalInterface
interface B{
    void printList(List<Integer> list);
}

public class Playground {
    public static void main(String[] args) {
        A a = new A() { //Anonymous inner class
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class implementation");
            }
        };
        a.sayHello();

        a = () -> {  //Lambda Expression
                System.out.println("Hello from Lambda Statement implementation");
            };
        a.sayHello();

        //Lambda Expression
        a = () -> System.out.println("Hello from single line Lambda Expression implementation");

        a.sayHello();

        ///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);


        System.out.println("Printing list from Anonymous Class implementation");
        B b = new B() {  //Anonymous inner class
            @Override
            public void printList(List<Integer> list) {
                System.out.println(list);
            }
        };
        b.printList(list);

        System.out.println("Printing list from Lambda Statement implementation");
        b = (l) -> {
            System.out.println(l);
        };
        b.printList(list);

        System.out.println("Printing list from single line Lambda Expression implementation");
        b = (l) -> System.out.println(l);
        b.printList(list);

    }
}
