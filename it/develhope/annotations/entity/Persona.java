package it.develhope.annotations.entity;

public class Persona {
    @IsAString
    public String name;
    @IsAString
    public int age;


    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
