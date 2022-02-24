package com.company;

import java.util.Arrays;

public class Kvartira implements Payable{
    private  String adress;


    Famly []famlies;

    public Kvartira(String adress, Famly[] famlies) {
        this.adress = adress;
        this.famlies = famlies;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Famly[] getFamlies() {
        return famlies;
    }

    public void setFamlies(Famly[] famlies) {
        this.famlies = famlies;
    }

    @Override
    public String toString() {
        return "Kvartira{" +
                "adress='" + adress + '\'' +
                ", famlies=" + Arrays.toString(famlies) +
                '}';
    }

    @Override
    public void payAble() {
        System.out.println(" Квартирадагылар айына  30000толошот ");

    }
}

