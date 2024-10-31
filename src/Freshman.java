package com.mycompany.csc325_oop;

class Freshman extends Student {

    private String credits;

    public Freshman(String name, int age, int credits) {
        super(name, (short) age, credits);
    }

    @Override
    public String toString() {
        return "Freshman{name=" + getName() + ", age=" + getAge() + ", credits=" + getCredits() + ", GPA=" + getGpa() + "}";
    }



    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public void setAddress(String address) {

    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
}