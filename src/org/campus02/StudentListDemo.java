package org.campus02;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student max = new Student(1, "max hermann");
        Student susi = new Student(2, "susi sorgvoll");

        studentList.add(max);
        studentList.add(susi);
        studentList.add(new Student(3, "Kebab Bissischarf"));
        System.out.println(studentList.size());

        for (Student s : studentList){
            System.out.println("s = " + s);
        }

        studentList.remove(max); //max entfernen
        studentList.remove(0); //entferne 1. Element mit index 0

        studentList.add(susi);


        for (int i = 0; i < studentList.size(); i++){
            System.out.println("Student ist mit index " + i +
                    " ist in unserer Liste wie folgt angelegt " + studentList.get(i));
        }

        boolean containsMax = studentList.contains(max);
        System.out.println("containsMax = " + containsMax);

        boolean containsSusi = studentList.contains(susi);
        System.out.println("containsSusi = " + containsSusi);

        for (Student s : studentList){
            System.out.println("s = " + s);
        }
        boolean containsKebab = studentList.contains(new Student(3, "Kebab Bissischarf"));
        //ist false, weil das nur auf die Referenzen verweist und nicht der inhalt verglichen wird bei contains
        System.out.println("containsKebab = " + containsKebab);
    }
}
