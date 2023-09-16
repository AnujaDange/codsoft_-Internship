package com.Task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Course {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }
}

class Student {
    String studentID;
    String name;
    List<String> registeredCourses;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        registeredCourses = new ArrayList<>();
    }
}

public class CourseRegistrationSystem {
    Map<String, Course> courseDatabase = new HashMap<>();
    Map<String, Student> studentDatabase = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addCourse(String code, String title, String description, int capacity, String schedule) {
        Course course = new Course(code, title, description, capacity, schedule);
        courseDatabase.put(code, course);
    }

    public void addStudent(String studentID, String name) {
        Student student = new Student(studentID, name);
        studentDatabase.put(studentID, student);
    }

    public void listCourses() {
        System.out.println("Available Courses:");
        for (Course course : courseDatabase.values()) {
            int availableSlots = course.capacity - studentCountInCourse(course.code);
            System.out.println(course.code + " - " + course.title + " (" + availableSlots + " slots available)");
        }
    }

    public void registerStudentForCourse(String studentID, String courseCode) {
        Student student = studentDatabase.get(studentID);
        Course course = courseDatabase.get(courseCode);

        if (student != null && course != null && student.registeredCourses.size() < course.capacity) {
            student.registeredCourses.add(courseCode);
            System.out.println(student.name + " registered for " + course.title);
        } else {
            System.out.println("Registration failed. Student or course not found, or course is full.");
        }
    }

    public void removeCourseFromStudent(String studentID, String courseCode) {
        Student student = studentDatabase.get(studentID);
        if (student != null && student.registeredCourses.contains(courseCode)) {
            student.registeredCourses.remove(courseCode);
            System.out.println(student.name + " removed from " + courseDatabase.get(courseCode).title);
        } else {
            System.out.println("Removal failed. Student is not registered for the course.");
        }
    }

    public int studentCountInCourse(String courseCode) {
        int count = 0;
        for (Student student : studentDatabase.values()) {
            if (student.registeredCourses.contains(courseCode)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CourseRegistrationSystem registrationSystem = new CourseRegistrationSystem();

        registrationSystem.addCourse("CSCI101", "Introduction to Computer Science", "Fundamentals of programming", 30, "MWF 9:00 AM");
        registrationSystem.addCourse("MATH202", "Calculus II", "Advanced calculus topics", 25, "TTH 1:30 PM");

        registrationSystem.addStudent("12345", "Alice");
        registrationSystem.addStudent("67890", "Bob");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. List Courses");
            System.out.println("2. Register Student for Course");
            System.out.println("3. Remove Course from Student");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registrationSystem.listCourses();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.next();
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.next();
                    registrationSystem.registerStudentForCourse(studentID, courseCode);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.next();
                    System.out.print("Enter course code: ");
                    courseCode = scanner.next();
                    registrationSystem.removeCourseFromStudent(studentID, courseCode);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
