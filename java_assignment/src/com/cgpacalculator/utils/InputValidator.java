package com.cgpacalculator.utils;

public class InputValidator {
    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

     public static boolean isValidUnit (int courseUnit) {
        return courseUnit >= 0 && courseUnit <= 20;
    }

    public static boolean isValidCourseName(String courseName) {
        return courseName != null && !courseName.trim().isEmpty();
    }

    public static boolean isValidCourseCode(String courseCode) {
        return courseCode != null && !courseCode.trim().isEmpty();
    }

    public static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
