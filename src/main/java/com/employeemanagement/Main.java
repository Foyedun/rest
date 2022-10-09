package com.employeemanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        Applicant applicant1 = new Applicant("paul", "paul@gmail.com",14, "ph", Gender.MALE, Role.APPLICANT, 67, Qualification.BSC);
        Applicant applicant2 = new Applicant("james", "james@gmail.com",20, "lag", Gender.MALE, Role.APPLICANT, 40, Qualification.HND);

        company.apply(applicant1);
        company.apply(applicant2);
       System.out.println(company.getApplicantList());

      Staff staff1 = new Staff("james", "james@gmail.com", 14, "ibadan", Gender.MALE
        ,Role.ACCOUNTANT, 3, 200_000, 0, 0);

        Staff staff2 = new Staff("kemi", "kemi@gmail.com", 25, "kwara", Gender.FEMALE,
                Role.CEO, 4, 500_000, 0, 0);

        company.hire(staff2, applicant1);
        company.hire(staff2, applicant2);

        System.out.println(company.getStaffList());

        Staff staff = company.getStaffList().get(0);
        staff.setStrike(1);
       company.fire(staff, staff2);
        company.paySalary(staff1, staff);
        company.paySalary(staff2, staff);

        System.out.println(staff.getWallet());



        }
    }

