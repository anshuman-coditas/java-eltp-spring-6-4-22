package com;

import java.util.List;

public class Batch {
    private String b_name;
    private int b_code;
    private List<Student> students;

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public int getB_code() {
        return b_code;
    }

    public void setB_code(int b_code) {
        this.b_code = b_code;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
     public void display(){
        System.out.println("Batch Name "+getB_name());
        System.out.println("Batch Code "+getB_code());
        List<Student> students1=getStudents();
        for(Student s:students){
            System.out.println(s);
        }
    }
}
