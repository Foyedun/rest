package com.employeemanagement;

public class Staff extends Person{
    private int id;
    private double salary;
    private int strike;

    private double wallet;

    public Staff(String name, String email, int age, String address, Gender gender, Role role, int id, double salary, int strike, double wallet) {
        super(name, email, age, address, gender, role);
        this.id = id;
        this.salary = salary;
        this.strike = strike;
        this.wallet = wallet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getStrike() {
        return strike;
    }

    public void setWallet (double wallet) {
        this.wallet = wallet;
    }

    public double getWallet () {
        return wallet;
    }


    @Override
    public String toString() {
        return "Staff{" +
                " id=" + id +
                ", salary=" + salary + ", name="+getName()+ ", age="+ getAge() + ", address="+ getAddress() + ", email="+ getEmail() +
                ", role"+ getRole() + ", gender"+ getGender() +
                '}';
    }
}
