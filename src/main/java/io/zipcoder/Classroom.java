package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    Student[] students;

    public Classroom(Integer maxStudents) {
        this.students = new Student[maxStudents];
    }

    public Classroom(Student ... students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getClassAverage() {
        Integer count = 0;
        Double sum = 0.0;
        for (Student student : students) {
            ArrayList<Double> examScores = student.getExamScoresDoubles();
            for (Double score : examScores) {
                sum += score;
            } count++;
        } return sum/count;
    }
}
