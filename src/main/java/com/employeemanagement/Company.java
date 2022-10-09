package com.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name = "Fabulous and Sons";

    public List<Staff> staffList = new ArrayList<>();

    public List<Applicant> applicantList = new ArrayList<>();

    public Company(List<Staff> staffList, List<Applicant> applicantList) {
        this.staffList = staffList;
        this.applicantList = applicantList;
    }

    public Company() {

    }

    public String getName() {
        return name;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(List<Applicant> applicantList) {
        this.applicantList = applicantList;
    }

    public void apply(Applicant applicant) {
        applicantList.add(applicant);
    }

    public void hire(Staff staff, Applicant applicant) {
        if (!staff.getRole().equals(Role.CEO)) {
            System.out.println("You cant hire, only CEO's can hire");
        } else {
            if (applicant.getTestScore() < 50) {
                System.out.println("Sorry " + applicant.getName() + " You did not meet the cut off mark, Try again next time");
            } else {
                staffList.add(
                        new Staff(applicant.getName(), applicant.getEmail(), applicant.getAge(), applicant.getAddress(),
                                applicant.getGender(), Role.EMPLOYEE, 0, 50_000, 0, 0)
                );
                applicantList.remove(applicant);
                System.out.println("Congratulations " + applicant.getName() + " you have been hired");
            }
        }

    }

    public void fire(Staff staff1, Staff staff2) {
        if (!staff2.getRole().equals(Role.CEO)) {
            System.out.println("You cant fire, only CEO's can fire");
        } else {
            if (staff1.getStrike() <= 2) {
                System.out.println(staff1.getName() + " has only " + staff1.getStrike() + " and should not be fired");
            } else {
                staffList.remove(staff1);
                System.out.println(staff1.getName() + " ,you have been fired. Goodluck in your future endeavours");
            }
        }

    }

    public void paySalary (Staff staff1, Staff staff2 ) {
        if (!staff1.getRole().equals(Role.ACCOUNTANT)) {
            System.out.println("You cannot pay salaries. Only the accountant can pay salaries");

        } else {
            double walletBalance = staff2.getWallet();
            staff2.setWallet(walletBalance += staff2.getSalary());
            System.out.println("You have been paid for the month");
        }
    }
}



