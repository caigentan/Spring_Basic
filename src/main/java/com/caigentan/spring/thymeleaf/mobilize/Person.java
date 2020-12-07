package com.caigentan.spring.thymeleaf.mobilize;

public class Person {
    private String name;
    private int age;
    private String mail;

    public Person(String name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }
}
