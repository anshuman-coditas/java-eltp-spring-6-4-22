package com;

public class Student {
    private String s_name;
    private String qualification;
    private double percent;
    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_name='" + s_name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", percent=" + percent +
                '}';
    }
}
