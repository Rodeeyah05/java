package org.example.classwork;

public class Students {
    private static String name;
    private static int age;
    private String EnrolledCourses;

    public Students(String name, int age, String Courses) {
        this.name = name;
        this.age = age;
        this.EnrolledCourses = EnrolledCourses;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnrolledCourses(Courses course) {
        return EnrolledCourses;
    }

    public void setEnrolledCourses(String enrolledCourses) {
        EnrolledCourses = enrolledCourses;
    }

    public void StudentsCourse(Courses course) {
        EnrolledCourses.getClass();
        System.out.println(name+" has enrolled the course"+course.getCourseName());


    }
}
