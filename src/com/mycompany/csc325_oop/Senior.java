package com.mycompany.csc325_oop;

class Senior extends Student {
    private static final int MIN_CREDITS = 85;

    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public void setAddress(String address) {

    }

    private String credits;

    public Senior(String name, int age, int credits) {
        super(name, (short) age, credits);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("Senior must have at least " + MIN_CREDITS + " credits.");
        }
    }

    @Override
    public String toString() {
        return "Senior{name=" + getName() + ", age=" + getAge() + ", credits=" + getCredits() + ", GPA=" + getGpa() + "}";
    }

    public String getCredits() {
        return credits;
    }
}

