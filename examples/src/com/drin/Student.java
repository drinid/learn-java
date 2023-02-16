package com.drin;

public class Student {
    public String name;
    private Integer money;


    public Integer getMoney(){
        return this.money;
    }

    public void setMoney(Integer money){
        this.money = money;
    }

    public Student(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println("Student");
    }

    public void read() {
    }


}
