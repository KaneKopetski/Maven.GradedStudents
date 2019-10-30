package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getClassroomAverageScoresTest() {
        // : Given

        ArrayList<Double> student1ExamScores = new ArrayList<>();
        student1ExamScores.add(90.0);
        student1ExamScores.add(95.0);
        student1ExamScores.add(70.0);

        ArrayList<Double> student2ExamScores = new ArrayList<>();
        student2ExamScores.add(100.0);
        student2ExamScores.add(65.0);
        student2ExamScores.add(75.0);


        Student student1 = new Student("Student", "One", student1ExamScores);
        Student student2 = new Student("Student", "Two", student2ExamScores);

        Student[] students = new Student[]{student1, student2};
        Classroom classroom = new Classroom(students);

        // When
        Double output = classroom.getClassAverage();
        Double expected = 247.5;

        // Then
        Assert.assertEquals(expected, output);

    }

    @Test
    public void addStudentTest() {
        // : Given
        Integer maxNumberOfStudents = 1;

        Classroom classroom = new Classroom(maxNumberOfStudents);

        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(65.0);
        examScores.add(75.0);

        Student student = new Student("Kane", "Kopetski", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();

        classroom.addStudent(student);

        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void removeStudentTest() {
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(65.0);
        examScores.add(75.0);
        ArrayList<Double> examScores2 = new ArrayList<>();
        examScores2.add(100.0);
        examScores2.add(65.0);
        examScores2.add(75.0);

        Student student = new Student("Kane", "Kopetski", examScores);
        Student student2 = new Student("Student", "2", examScores);
        Classroom classroom = new Classroom(student, student2);



        // When
        Student[] preEnrollment = classroom.getStudents();

        classroom.removeStudent("Kane", "Kopetski");

        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void getStudentsByScoreTest() {
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(65.0);
        examScores.add(75.0);

        ArrayList<Double> examScores2 = new ArrayList<>();
        examScores2.add(100.0);
        examScores2.add(15.0);
        examScores2.add(75.0);

        ArrayList<Double> examScores3 = new ArrayList<>();
        examScores3.add(1500.0);
        examScores3.add(65.0);
        examScores3.add(75.0);

        Student student1 = new Student("Student", "1", examScores);
        Student student2 = new Student("Student", "2", examScores2);
        Student student3 = new Student("Student", "3", examScores3);

        Classroom classroom = new Classroom(student1, student2, student3);

        // When


        // Then
        Student[] students = classroom.getStudentsByScore();
        Double[] sortedScores = classroom.studentScores();
        for (Double score : sortedScores) {
            System.out.println(score);
        }
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName);
        }
    }


}
