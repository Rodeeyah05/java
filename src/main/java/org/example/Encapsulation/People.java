package org.example.Encapsulation;

public class People {
    String Name;
     private int Age;
    String Complexion;
    String Gender;

    @Override
    public String toString() {
        return "People{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Complexion='" + Complexion + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        People p = new People();
        p.Name="Rodeeyah";
        p.Age=30;
        System.out.println(p.Name);
    }
}

