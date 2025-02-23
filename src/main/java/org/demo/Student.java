package org.demo;

import java.util.List;

// student builder will have all the parameters that student has , so there is certain code duplicacy
public class Student {
    private int rollNo;
    private String name;
    private String fatherName;
    private String motherName;
    private String phone;
    private List<String> subjects;

    public Student(StudentBuilder studentBuilder){
      this.fatherName = studentBuilder.fatherName;
      this.motherName = studentBuilder.motherName;
      this.rollNo = studentBuilder.rollNo;
      this.subjects = studentBuilder.subjects;
      this.phone = studentBuilder.phone;;
      this.name = studentBuilder.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", phone='" + phone + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
