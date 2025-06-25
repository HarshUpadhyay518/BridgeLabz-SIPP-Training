package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }

    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public static void main(String[] args) {
        Person original = new Person("Rohan Mehta",28);
        System.out.println("Original Person:");
        original.display();

        Person copy = new Person(original);
        System.out.println("Copy Person:");
        copy.display();
    }
}
