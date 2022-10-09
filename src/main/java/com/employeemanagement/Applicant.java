package com.employeemanagement;

import java.util.List;

public class Applicant extends Person {
    private double testScore;

    private Qualification qualification;

    public Applicant(String name, String email, int age, String address, Gender gender, Role role, double testScore, Qualification qualification) {
        super(name, email, age, address, gender, role);
        this.testScore = testScore;
        this.qualification = qualification;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Applicant{" + "name=" + getName() + " email=" + getEmail() +
            " age=" + getAge() + " address=" + getAddress() + " gender=" + getGender() + " role=" + getRole() +
                " testScore=" + testScore +
                ", qualification=" + qualification +
                '}';
    }
}

