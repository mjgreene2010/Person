package com.michaelgreene;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setAge(16);
        person.setFirstName("John");
        person.setLastName("Smith");

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    }
}
