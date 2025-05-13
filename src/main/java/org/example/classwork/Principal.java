package org.example.classwork;

public class Principal {
    private String name;
    private int age;

    public Principal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void admitStudents(Students students) {
        if (Students.getAge() >=10){
            System.out.println("Student"+Students.getName()+"Can be admitted)");
        }else{
            System.out.println("Cannot be admitted");
        }
    }
}
