package com.cgpacalculator.display;

import java.util.Scanner;

import com.cgpacalculator.utils.InputValidator;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static int retrievePositiveNumber(String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            value = Integer.parseInt(inputValue);
            if (value > 0) break;
        }
        return value;
    }

    public static String retrieveCourseName(String prompt) {
        String courseName;

        while (true) {
            System.out.print(prompt);
            courseName = scanner.nextLine();

            if (InputValidator.isValidCourseName(courseName)) {
                break;
            }

            System.out.println("Invalid course name. Please enter a valid one.");
        }
        return courseName;
    }

    public static String retrieveCourseCode(String prompt) {
        String courseCode;

        while (true) {
            System.out.print(prompt);
            courseCode = scanner.nextLine();

            if (InputValidator.isValidCourseCode(courseCode)) {
                break;
            }

            System.out.println("Invalid course code. Please enter a valid one.");
        }
        return courseCode;
    }

    public static int retrieveScore(String prompt) {
        int score;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid score.");
                continue;
            }

            score = Integer.parseInt(inputValue);
            
            if (!InputValidator.isValidScore(score)) {
                System.out.printf("Score Should be between %d and %d\n", 0, 100);
                continue;
            }
            
            break;
        }
        
        return score;
    }

    public static int retrieveCourseUnit(String prompt) {
        int courseUnit;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Invalid input, Please enter a valid course unit.");
                continue;
            }

            courseUnit = Integer.parseInt(inputValue);

            if (!InputValidator.isValidUnit(courseUnit)) {
                System.out.printf("A course unit should not exceed %d\n", 20);
                continue;
            }

            break;
        }

        return courseUnit;
    }
}
