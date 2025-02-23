package org.demo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 =  MBAStudentBuilder.getInstance().setFatherName("MBAfather").setName("MBAsajal").setRollNo(123456789)
                .setSubjects(Arrays.asList("MBA1", "MBA2")).build();

        Student student2 =  EngineerStudentBuilder.getInstance().setFatherName("ENGfather").setName("ENGsajal").setRollNo(1234)
                .setSubjects(Arrays.asList("ENG1", "ENG2")).build();

        Director director = new Director(EngineerStudentBuilder.getInstance());
        Student engStudent = director.createStudent();

        Director director2 = new Director(MBAStudentBuilder.getInstance());
        Student MBAStudent = director2.createStudent();

        Thread thread = new Thread(() -> {
            Student student = EngineerStudentBuilder.getInstance().setFatherName("T1father").setName("T1sajal").setRollNo(1)
                    .setSubjects(Arrays.asList("T1")).build();
            System.out.println(student);
        });

        Thread thread1 = new Thread(() ->
        {
           Student student = EngineerStudentBuilder.getInstance().setFatherName("T2father").setName("T2sajal").setRollNo(2)
                    .setSubjects(Arrays.asList("T2")).build();
            System.out.println(student);
        });

        thread.start();
        thread1.start();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(engStudent);
        System.out.println(MBAStudent);
    }
}
