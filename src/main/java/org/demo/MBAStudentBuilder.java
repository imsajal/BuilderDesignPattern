package org.demo;

import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    private static final ThreadLocal<MBAStudentBuilder> mbaStudentBuilderThreadLocal =
            ThreadLocal.withInitial(MBAStudentBuilder::new);

    public static MBAStudentBuilder getInstance(){
        return mbaStudentBuilderThreadLocal.get();
    }
    private MBAStudentBuilder(){

    }

  @Override
  public StudentBuilder setSubjects(List<String> subjects) {
      this.subjects = subjects;
      return this;
  }

  @Override
  public Student build(){
        Student student = new Student(this);
        mbaStudentBuilderThreadLocal.remove();
        return student;
    }
}
