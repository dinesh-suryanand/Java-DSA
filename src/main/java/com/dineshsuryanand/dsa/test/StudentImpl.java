package com.dineshsuryanand.dsa.test;

public class StudentImpl{

    public Student getStudent() {
        Student student = new Student("din","din@gmail.com");

        changeme(student);
        System.out.println(student);
        System.out.println("----------------------------------1");
        System.out.println("----------------------------------2");
        System.out.println("----------------------------------3");
        System.out.println("----------------------------------4");
        Student student1 = new Student("din","din@gmail.com");
        changemeReturn(student1);
        System.out.println(student1);


        return student;
    }

    private Student changemeReturn(Student x) {
        Student resp = new Student();
        x.name = "changed something";
        x.email = "changed@gmi";

        return resp;
    }


    public void changeme(Student x) {
        x.name = "changedwaht";
        x.email = "changed@gmi";
    }
}
