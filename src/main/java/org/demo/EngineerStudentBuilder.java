package org.demo;

import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{


    private static final ThreadLocal<EngineerStudentBuilder> engineeringStudentBuilder =
            ThreadLocal.withInitial(EngineerStudentBuilder::new);

    public static EngineerStudentBuilder getInstance(){
        return engineeringStudentBuilder.get();
    }
    private EngineerStudentBuilder(){

    }
    @Override
    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        // do some logic here
        return this;
    }

    @Override
    public Student build(){
        Student student = new Student(this);
        engineeringStudentBuilder.remove();
        return student;
    }
}
