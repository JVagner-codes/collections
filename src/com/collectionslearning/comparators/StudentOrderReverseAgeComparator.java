package com.collectionslearning.comparators;

import java.util.Comparator;

public class StudentOrderReverseAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }
}
