package com.company;

public class Famly {

    private  int number;

    public Famly( int number) {

        this.number = number;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Famly{" +
                "number=" + number +
                '}';
    }
}


