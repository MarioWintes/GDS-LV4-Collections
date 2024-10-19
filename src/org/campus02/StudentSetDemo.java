package org.campus02;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {

        HashSet<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(1, "max"));
        studentSet.add(new Student(2, "hermann"));
        Student jo = new Student(3, "jo");
        studentSet.add(jo);
        studentSet.add(new Student(4, "dürüm"));
        studentSet.add(new Student(4, "dürüm"));

        for (Student s : studentSet){
            System.out.println("s = " + s);
        }
        System.out.println(studentSet.size());

        studentSet.remove(new Student(1,"max"));
        System.out.println();

        for (Student s : studentSet){
            System.out.println("s = " + s);
        }
        System.out.println(studentSet.size());

        boolean containsJo = studentSet.contains(jo);
        System.out.println("containsJo = " + containsJo);

        boolean containsMax = studentSet.contains(new Student(1, "max"));
        System.out.println("containsMax = " + containsMax);

        for (Student s : studentSet){
            System.out.println("hashCode = " + s.hashCode());
        }
    }
}
