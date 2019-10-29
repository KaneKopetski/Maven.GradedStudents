package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
}
