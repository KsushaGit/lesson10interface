package com.company;

public interface C extends A,B {

 int a1=1000;
    int a= 100;
    int b[] = {1,2,3,4,5}; // они по умолчанию являются паблик статик константы
    default void v() {

        System.out.println( " HI from interface ");
    }


    static void n() {
        System.out.println( " hi form static method C ");

    }
}

