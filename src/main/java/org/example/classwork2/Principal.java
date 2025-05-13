package org.example.classwork2;

public class Principal extends Person {
    public Principal(String name, int age, String id) {
        super(name, age, id);
    }

    public Principal() {
    }

    public Students admit(Applicants applicants) {
       if (applicants.getAge() >= 13) {
           return new Students(applicants.getName(), applicants.getAge(), applicants.getId());
       } else {
           System.out.println("You are out of age");
       }
        return null;
    }

    public void expel(Students students) {
        if (students.getMark()<50){
            students.expel();
            System.out.println(students.getName()+"has been expelled by the principal");
        }else{
            System.out.println("You are safe");
        }
    }
}

