package com.company;

class MyEmployee{
    public Object name;
    public String Name;
    private int id;
   // private String name;

    MyEmployee() {
        String Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        MyEmployee sagar = new MyEmployee();
        sagar.setId(24);
        sagar.Name = "hiiiiii";
        System.out.println("");
    }
}