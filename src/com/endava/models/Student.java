package com.endava.models;


public class Student {
    private String name;
    private Gender gender;
    private int age;
    private MajorDeg major;

    public Student() {
    }

    public Student(String name, Gender gender, int age, MajorDeg major) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.major=major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MajorDeg getMajor() {
        return major;
    }

    public void setMajor(MajorDeg major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", major=" + major +
                '}';
    }
}
