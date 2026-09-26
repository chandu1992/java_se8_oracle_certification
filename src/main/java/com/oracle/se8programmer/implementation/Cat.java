package com.oracle.se8programmer.implementation;

public class Cat extends Dog{

    public static void main(String[] args) {
        
        Dog dog = new Cat();
        //dog.color()// can not access Dog is parent

        Cat c = new Cat();
        c.color();
    }
}
