package com.company.classwork;

public class Dog
{
    private String name;
    private String bred;
    private String color;
    private int age;

    public Dog(String name, String bred, String color, int age)
    {
        this.name=name;
        this.bred=bred;
        this.color=color;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public String getBred() {
        return bred;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String toString()
    {
        String message="Hi, my name is " +this.name+ ". I am " +this.age+" years old and a " +this.color+" "+this.bred+"." ;
        return message;
    }

}
