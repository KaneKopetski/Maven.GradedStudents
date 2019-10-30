package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getExamScores() {
        String intro = "Exam Scores:\n";
        StringBuilder sb = new StringBuilder();
        sb.append(intro);
        for (Double score : examScores) {
            Integer examNumber = examScores.indexOf(score) + 1;
            sb.append("        Exam " + examNumber + " -> " + score + "\n");
        } return sb.toString();
    }

    public ArrayList<Double> getExamScoresDoubles() {
        ArrayList<Double> scores = new ArrayList<>();
        for (Double score : examScores) {
            scores.add(score);
        } return scores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public void addExamScore(Double score) {
        this.examScores.add(score);
    }

    public void setExamScore(Integer examNumber, Double score) {
        this.examScores.set(examNumber-1, score);
    }

    public Double getAverageExamScore() {
        Integer count = 0;
        Double sum = 0.0;
        for (Double score : examScores) {
            count++;
            sum += score;
        } return sum/count;
    }

    @Override
    public String toString() {
        return "Student Name: " + this.firstName + " " + this.lastName;

    }
}
