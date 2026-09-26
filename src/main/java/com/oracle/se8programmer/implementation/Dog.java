package com.oracle.se8programmer.implementation;

import com.oracle.se8programmer.controller.Animal;

public class Dog extends Animal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.color();

        Animal animal = new Dog();
        //animal.color(); // we can not access protected methods based on parent reference
    }
}
