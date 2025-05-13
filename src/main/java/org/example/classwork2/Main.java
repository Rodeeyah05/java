package org.example.classwork2;

import org.example.classwork.Principal;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal("Principal Ade",30);

        Applicants applicants = new Applicants("Ade",4,"2005");
        Applicants applicants2 = new Applicants("Adebimpe",20,"2007");

        Teachers teacher = new Teachers("Uncle Malik",30,"300");

        Courses programming = new Courses();

        teacher.teach(programming);







    }
}
