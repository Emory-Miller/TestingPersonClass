package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this("", Integer.MAX_VALUE);
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Integer setAge(int age) {
        return this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
