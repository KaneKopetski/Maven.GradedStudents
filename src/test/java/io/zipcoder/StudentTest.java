package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Kane";
        String lastName = "Kopetski";

        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(90.0);
        examScores.add(95.0);
        examScores.add(70.0);

        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();
        String expected = "Exam Scores:\n" +
                          "        Exam 1 -> 90.0\n" +
                          "        Exam 2 -> 95.0\n" +
                          "        Exam 3 -> 70.0\n";

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void addExamScoreTest() {
        // : Given
        String firstName = "Kane";
        String lastName = "Kopetski";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);



        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();
        String expected = "Exam Scores:\n" +
                          "        Exam 1 -> 100.0\n";

        // Then
        //
        Assert.assertEquals(expected, output);
    }

    @Test
    public void setExamScore(){
        // : Given
        String firstName = "Kane";
        String lastName = "Kopetski";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        examScores.add(90.0);

        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();
        String expected = "Exam Scores:\n" +
                          "        Exam 1 -> 150.0\n";

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        String firstName = "Kane";
        String lastName = "Kopetski";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(90.0);
        examScores.add(50.0);
        examScores.add(0.0);

        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();
        Double expected = 60.0;

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void toStringTest() {
        String firstName = "Kane";
        String lastName = "Kopetski";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();
        String expected = "Student Name: Kane Kopetski";

        // Then
        Assert.assertEquals(expected, output);
    }

}