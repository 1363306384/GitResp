package com.java.entity;

public class Student {
    private String name;

    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name="冯鑫辉";
        student.address="文水县";
        System.out.println(student);
    }
}
