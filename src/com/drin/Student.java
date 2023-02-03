package com.drin;

public class Student {
    public String name;

    public Student(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println("Student");
    }

    public void read() {
    }


}
