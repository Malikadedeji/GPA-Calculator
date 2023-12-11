package com.cgpacalculator.models;

public class CourseDetails {
    private String courseName;
    private String courseCode;
    private int units;
    private double score;

    public CourseDetails(String courseName, String courseCode, int units, double score) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.units = units;
        this.score = score;
    }

    public int getUnits() {
        return units;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public double getScore() {
        return score;
    }
}
