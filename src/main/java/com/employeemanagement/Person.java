package com.employeemanagement;

public abstract class Person {
    private String name;
    private String email;
    private int age;
    private String address;
    private Gender gender;
    private Role role;

    public Person (String name, String email, int age, String address, Gender gender, Role role) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.role = role;
    }


    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
        }
        public void setAddress(String address){
            this.address = address;
        }
    public String getAddress() {
        return address;
    }
        public void setGender(Gender gender){
            this.gender = gender;

        }
    public Gender getGender() {
        return gender;
    }
        public void setRole(Role role) {
            this.role = role;
        }
    public Role getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }
}

