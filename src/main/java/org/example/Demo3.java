package org.example;

    public class Demo3{
        protected static String SomeonesName() {
            String name = "Rodeeyah";
            String address = "Ikeja";
            return name + " " + address;
        }
        public static void main(String[] args) {
            Demo3 demo = new Demo3();
            System.out.println(demo.SomeonesName());
        }
}
