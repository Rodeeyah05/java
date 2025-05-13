package org.example.classwork;

public class Courses {
    private String courseName;
    private String courseCode;
    private String Teacher;

    public Courses(String courseName, String courseCode, String Teacher) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.Teacher = Teacher;

    }

    public void assignTeacher(Teacher teacher) {

        System.out.println("Teacher" +"has been assigned to this course");
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }
}


