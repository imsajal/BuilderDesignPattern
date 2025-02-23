package org.demo;


import java.util.Arrays;

// Director is there to provide some sequencing and have some business logic
// but if so many parameters skip using the director
public class Director {
    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        Student student = null;
        if(studentBuilder instanceof EngineerStudentBuilder){
            student = createEngineeringStudent();
        }
        else {
            student = createMBAStudent();
        }
        return student;
    }

    private Student createMBAStudent() {
        return studentBuilder.setFatherName("MBAfather").setName("MBAsajal").setRollNo(1234)
                .setSubjects(Arrays.asList("MBA1", "MBA2")).build();
    }

    private Student createEngineeringStudent() {

        return studentBuilder.setFatherName("ENGfather").setName("ENGsajal").setRollNo(1234)
                .setSubjects(Arrays.asList("ENG3", "ENG4")).build();
    }
}
