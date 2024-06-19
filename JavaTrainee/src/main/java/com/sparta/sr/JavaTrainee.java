package com.sparta.sr;

public class JavaTrainee extends Trainee implements Trainable {
    private String experience;
    private String[] certifications;
    private String[] projects;
    private String github;

    public JavaTrainee(String name, int age, String email, String phone) {
        super(name, age, email, phone);
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String[] getCertifications() {
        return certifications;
    }

    public void setCertifications(String[] certifications) {
        this.certifications = certifications;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public void train() {
        System.out.println("trains hard");
    }

    @Override
    public void study() {
        System.out.println(super.getName() + "revises for an hour");
    }
}
