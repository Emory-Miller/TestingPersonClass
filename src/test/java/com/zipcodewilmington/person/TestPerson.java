package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameAndAgeAndRetirementAge() {
        // Given
        Integer expectedAge = 55;
        String expectedName = "Leon";
        Integer expectedRetirementAge = 70;

        // When
        Person person = new Person(expectedName, expectedAge, expectedRetirementAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualRetirementAge = person.getRetirementAge();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedRetirementAge, actualRetirementAge);
    }

    @Test
    public void testConstructorWithNameAndAgeAndRetirementAgeAndAddress() {
        // Given
        Integer expectedAge = 55;
        String expectedName = "Leon";
        Integer expectedRetirementAge = 70;
        String expectedAddress = "11 Croydon Rd";

        // When
        Person person = new Person(expectedName, expectedAge, expectedRetirementAge, expectedAddress);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualRetirementAge = person.getRetirementAge();
        String actualAddress = person.getAddress();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedRetirementAge, actualRetirementAge);
        Assert.assertEquals(expectedAddress, actualAddress);
    }

    @Test
    public void testConstructorWithNameAndAgeAndRetirementAgeAndAddressAndSpouseName() {
        // Given
        Integer expectedAge = 55;
        String expectedName = "Leon";
        Integer expectedRetirementAge = 70;
        String expectedAddress = "11 Croydon Rd";
        String expectedSpouseName = "Mary";

        // When
        Person person = new Person(expectedName, expectedAge, expectedRetirementAge, expectedAddress, expectedSpouseName);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualRetirementAge = person.getRetirementAge();
        String actualAddress = person.getAddress();
        String actualSpouseName = person.getSpouseName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedRetirementAge, actualRetirementAge);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedSpouseName, actualSpouseName);
    }

    @Test
    public void testConstructorWithNameAndAgeAndRetirementAgeAndAddressAndSpouseNameAndPhoneNumeber() {
        // Given
        Integer expectedAge = 55;
        String expectedName = "Leon";
        Integer expectedRetirementAge = 70;
        String expectedAddress = "11 Croydon Rd";
        String expectedSpouseName = "Mary";
        String expectedPhoneNumber = "3025555555";

        // When
        Person person = new Person(expectedName, expectedAge, expectedRetirementAge, expectedAddress, expectedSpouseName, expectedPhoneNumber);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualRetirementAge = person.getRetirementAge();
        String actualAddress = person.getAddress();
        String actualSpouseName = person.getSpouseName();
        String actualPhoneNumber = person.getPhoneNumber();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedRetirementAge, actualRetirementAge);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedSpouseName, actualSpouseName);
        Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);

    }

    @Test
    public void testConstructorWithNameAndAgeAndRetirementAgeAndAddressAndSpouseNameAndPhoneNumeberAndEmployeeID() {
        // Given
        Integer expectedAge = 55;
        String expectedName = "Leon";
        Integer expectedRetirementAge = 70;
        String expectedAddress = "11 Croydon Rd";
        String expectedSpouseName = "Mary";
        String expectedPhoneNumber = "3025555555";
        String expectedEmployeeID = "123456789";


        // When
        Person person = new Person(expectedName, expectedAge, expectedRetirementAge, expectedAddress, expectedSpouseName, expectedPhoneNumber, expectedEmployeeID);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualRetirementAge = person.getRetirementAge();
        String actualAddress = person.getAddress();
        String actualSpouseName = person.getSpouseName();
        String actualPhoneNumber = person.getPhoneNumber();
        String actualEmployeeID = person.getEmployeeID();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedRetirementAge, actualRetirementAge);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedSpouseName, actualSpouseName);
        Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);
        Assert.assertEquals(expectedEmployeeID, actualEmployeeID);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetRetirementAge() {
        // Given
        Person person = new Person();
        Integer expected = 70;

        // When
        person.setRetirementAge(expected);

        // Then
        Integer actual = person.getRetirementAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAddress() {
        // Given
        Person person = new Person();
        String expected = "11 Croydon";

        // When
        person.setAddress(expected);

        // Then
        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetSpouseName() {
        // Given
        Person person = new Person();
        String expected = "Mary";

        // When
        person.setSpouseName(expected);

        // Then
        String actual = person.getSpouseName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "3025555555";

        // When
        person.setPhoneNumber(expected);

        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetEmployeeID() {
        // Given
        Person person = new Person();
        String expected = "123456789";

        // When
        person.setEmployeeID(expected);

        // Then
        String actual = person.getEmployeeID();
        Assert.assertEquals(expected, actual);
    }
}
