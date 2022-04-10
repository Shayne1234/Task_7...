package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String surnameElton55337;
    String firstnameElton55337;
    String streetElton55337;
    int zipCodeElton55337;
    String cityElton55337;

    void initialize() throws IOException {
        System.out.println("Surname:");
        surnameElton55337 = br.readLine();
        System.out.println("Firstname:");
        firstnameElton55337 = br.readLine();
        System.out.println("Street:");
        streetElton55337 = br.readLine();
        System.out.println("zipCode:");
        zipCodeElton55337 = Integer.parseInt(br.readLine());
        System.out.println("City:");
        cityElton55337 = (br.readLine());

    }

    void PrintData() {
        System.out.println("Surname:" + surnameElton55337);
        System.out.println("Firstname:" + firstnameElton55337);
        System.out.println("Street:" + streetElton55337);
        System.out.println("zipCode:" + zipCodeElton55337);
        System.out.println("City:" + cityElton55337);
    }
}
class staff extends Person {
    String education;
    String position;

    public void initialize1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        education = br.readLine();
        System.out.println("Enter your position");
        position = br.readLine();
    }

    public void print1() {
        PrintData();
        System.out.println("Education:" + education);
        System.out.println("Position:" + position);


    }


    public static void main(String[] args) throws IOException {
        staff employee = new staff();

        employee.initialize1();
        employee.print1();
    }
}













