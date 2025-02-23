package org.demo;

import java.util.List;

public abstract class StudentBuilder {

     int rollNo;
     String name;
     String fatherName;
     String motherName;
     String phone;
     List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    abstract public StudentBuilder setSubjects(List<String> subjects);

    abstract Student build();

}
