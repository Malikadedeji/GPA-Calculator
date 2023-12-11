package com.cgpacalculator.main;

import com.cgpacalculator.display.Console;
import com.cgpacalculator.models.CourseDetails;
import com.cgpacalculator.services.GpaCalculationService;

public class GpaCalculator {

    public static void main(String[] args) {
        System.out.println("GPA Calculator");

        int numberOfCourses = Console.retrievePositiveNumber("Enter the number of Courses: ");
        CourseDetails[] courses = new CourseDetails[numberOfCourses];


        for (int i = 0; i < numberOfCourses; i++) {
            CourseDetails course = captureCourseInput(i);
            // Add the course to the array
            courses[i] = course;
        }

        printCourseInfo(courses);

        double gpa = GpaCalculationService.calculateGPA(courses);
        System.out.printf("\nYour GPA is: %.2f\n", gpa);
    }

    private static void printCourseInfo(CourseDetails[] courses) {
        System.out.println("\nCourse details and grades:\n");

        System.out.println("|------------|---------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE     | COURSE CODE   | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|------------|---------------|-----------------------|------------|---------------------|");

        for (CourseDetails course : courses) {
            String grade = GpaCalculationService.convertScoreToGrade(course.getScore());
            int gradePoint = GpaCalculationService.convertGradeToPoint(course.getScore());

            System.out.format("| %-11s| %-13s | %-21s | %-10s | %-19s |\n",
                course.getCourseName(), course.getCourseCode(), course.getUnits(), grade, gradePoint);
        }
        System.out.println("|---------------------------------------------------------------------------------------|");
    }

    private static CourseDetails captureCourseInput(int index) {
        int count = index + 1;
        System.out.println("\nEnter details for Course #" + count);

        String courseName = Console.retrieveCourseName("Course Name: ");
        String courseCode = Console.retrieveCourseCode("Course Code: ");
        int units = Console.retrieveCourseUnit("Units: ");
        double score = Console.retrieveScore("Score: ");

        return new CourseDetails(courseName, courseCode, units, score);
    }
}