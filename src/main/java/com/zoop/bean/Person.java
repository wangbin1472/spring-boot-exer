package com.zoop.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="person")
public class Person {

    private int  id;
    private  String name;

    private int age;

    private String email;


    private  Dog  dog;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dog=" + dog +
                '}';
    }
}
