package com.sparta.sr;

public class App {
    public static void main(String[] args) {
      JavaTrainee sam = new JavaTrainee("Sam", 24, "samridsdale1000@gmail.com", "07656902155");
        System.out.println(sam.getName());
        sam.setExperience("Le Wagon Web Development bootcamp");
        System.out.println(sam.getExperience());

        DevOpsTrainee carl = new DevOpsTrainee("Carl", 20, "carl@gmail.com", "07869034657");
        System.out.println(carl.getName());
        System.out.println(sam.train());
    }
}
