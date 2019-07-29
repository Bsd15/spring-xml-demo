package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    /**
     * Empty Constructor to allow the use of getters and setters
     */
    public Actor() {
    }

    /**
     * @param name Name of the actor
     * @param gender Gender of the actor
     * @param age Age of the Actor
     */
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
