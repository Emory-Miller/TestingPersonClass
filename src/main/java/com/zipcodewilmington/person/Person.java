package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private int retirementAge;

    private String address;

    private String spouseName;

    private String phoneNumber;

    private String employeeID;

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

    public Person(String name, int age, int retirementAge) {
        this.name = name;
        this.age = age;
        this.retirementAge = retirementAge;
    }

    public Person(String name, int age, int retirementAge, String address) {
        this.name = name;
        this.age = age;
        this.retirementAge = retirementAge;
        this.address = address;
    }

    public Person(String name, int age, int retirementAge, String address, String spouseName) {
        this.name = name;
        this.age = age;
        this.retirementAge = retirementAge;
        this.address = address;
        this.spouseName = spouseName;
    }

    public Person(String name, int age, int retirementAge, String address, String spouseName, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.retirementAge = retirementAge;
        this.address = address;
        this.spouseName = spouseName;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, int age, int retirementAge, String address, String spouseName, String phoneNumber, String employeeID) {
        this.name = name;
        this.age = age;
        this.retirementAge = retirementAge;
        this.address = address;
        this.spouseName = spouseName;
        this.phoneNumber = phoneNumber;
        this.employeeID = employeeID;
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

    public int getRetirementAge() {
        return retirementAge;
    }

    public void setRetirementAge(int retirementAge) {
        this.retirementAge = retirementAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
