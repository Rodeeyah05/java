package org.example.classwork;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal("Mr Idris",30);
        Teacher teacher = new Teacher("Mr Fawaz",39);
        Courses Course = new Courses("Mathematics","MTH301","Mr Idris");

        Course.assignTeacher(teacher);
        Students Student = new Students(" Fawaz",10,"Mathematics");

        Student.getEnrolledCourses(Course);
    }
}
