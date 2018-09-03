package ru.gorshckov.human;

public class Human {
    private String name;
    private int age;
    public static int counterPerson;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        counterPerson++;
    }
    public void countPerson(){
        System.out.println("количество создаваемых обьектов = "+counterPerson);
    }
}
