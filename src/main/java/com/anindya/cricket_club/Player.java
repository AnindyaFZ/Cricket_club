package com.anindya.cricket_club;

public class Player {
    String name,dob,doj;
    int age;

    public Player(String name, String dob, String doj, int age) {
        this.name = name;
        this.dob = dob;
        this.doj = doj;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
