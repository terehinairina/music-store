package com.example.demo7;

public class Customer {
    private String name;
    private String kod;
    private int number;

    public Customer(String name, String kod, int number) {
        this.name = name;
        this.kod = kod;
        this.number = number;
    }


    public String getName() {
        return name ;
    }

    public void setName(String name ) {
        this.name = name;
    }

    public String getKod() {
        return kod ;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
