package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University university = new University("1", "MFUA", "MM", 1999, StudyProfile.MEDICINE);

        System.out.println(university.toString());

        Student student = new Student("micke", "1", 3, 5);

        System.out.println(student.toString());
    }
}