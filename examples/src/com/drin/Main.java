package com.drin;

public class Main {
    public static void main(String[] args) {
        Student S = new Student("Drin");
//        S.setName("durim"); kjo metode nuk mundet me u thirre jashta klases Student
        System.out.println(S.getName());

        S.getMoney();
    }
}
