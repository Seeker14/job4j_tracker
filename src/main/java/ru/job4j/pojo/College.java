package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mashkova Elena Yurevna");
        student.setGroup(3);
        student.setAdmission(new Date());
        System.out.println("The student " + student.getName() + " joined the group number " + student.getGroup()
                           + " in " + student.getAdmission());
    }
}
