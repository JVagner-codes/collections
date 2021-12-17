package com.collectionslearning.comparators.training;

public class Person implements Comparable<Person> {

    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getName() + " -- " + this.getAge();
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
