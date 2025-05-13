package org.example.classwork2;

import java.util.ArrayList;
import java.util.List;

public class Students extends Person {
    int mark;
    List<Courses> courses = new ArrayList<>();
    boolean isEnrolled;
    public Students(String name, int age, String id) {
        super(name, age, id);
    }

    public Students(){
    }


    public void takeCourse(Courses course) {
       courses.add(course);
    }
    public List<Courses> getCourses() {
        return courses;
    }
    public void expel(){
        isEnrolled = false;
    }
    public boolean isEnrolled() {
        return isEnrolled;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
