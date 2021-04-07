package com.suraj.training.corejavafundamentals.model;

public class Student implements Comparable<Student> {

    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }
}

