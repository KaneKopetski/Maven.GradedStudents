package io.zipcoder;

import java.util.ArrayList;


public class Classroom {
    Student[] students;

    public Classroom(Integer maxStudents) {
        this.students = new Student[maxStudents];
    }

    public Classroom(Student... students) {
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
            }
            count++;
        }
        return sum / count;
    }

    public void addStudent(Student student) {
        Student[] students2 = new Student[students.length + 1];
        students2[students.length - 1] = student;
        students = students2;
        }

    public void removeStudent(String firstName, String lastName) {
        String studentName = firstName + " " + lastName;
        Student[] students2 = new Student[students.length];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            String studentNameToRemove = students[i].getFirstName() + " " + students[i].getLastName();
            if (!studentName.equals(studentNameToRemove)) {
                students2[i] = students[i];
            }
            else j = i;
            break;
        }
        for (int i = j + 1; i < students.length; i++) {
            students2[i -1] = students[i];
        } students = students2;
    }

    public Double[] studentScores() {
        Double[] studentScores = new Double[students.length];
        for (int i = 0; i < students.length; i++) {
            Double avgScore = students[i].getAverageExamScore();
            studentScores[i] = avgScore;
        } return studentScores;
    }
//TODO Add lexicographic sorting
    public Student[] getStudentsByScore() {
        Double[] studentScores = studentScores();
        for (int i = 0; i < studentScores.length-1; i++)
            for (int j = 0; j < studentScores.length-i-1; j++)
                if (studentScores[j] > studentScores[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    Double temp = studentScores[j];
                    Student tempStudent = students[j];
                    studentScores[j] = studentScores[j+1];
                    students[j] = students[j+1];
                    studentScores[j+1] = temp;
                    students[j+1] = tempStudent;

                }
        return students;
    }
    //Define method getStudentsByScore()
    //The class Classroom should define a method getStudentsByScore() which returns an
    //array representation of Student objects sorted in descending order by score.
    //If two students have the same class average, order them lexigraphically.
}
