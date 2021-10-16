package com.company.OOPs;

/**
 *
 * Declare the variables of a class as private
 * provide public setter and getter methods that will be used to write and read thses variables values.
 *
 * HELPS in Lose coupling
 * In big big apps components should be separate
 * as much not dependent on eath other
 *
 * These Decoupled component can be developed independenly,
 * debugged and tested independely and concurrently.
 *
 *
 */
public class Encasulation {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
