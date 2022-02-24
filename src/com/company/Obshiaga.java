package com.company;

import java.util.Arrays;

public class Obshiaga implements ArenaAble {
    private  String adress;

    Famly []famlies;

    public Obshiaga(String adress, Famly[] famlies) {
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
        return "Obshiaga{" +
                "adress='" + adress + '\'' +
                ", famlies=" + Arrays.toString(famlies) +
                '}';
    }

    @Override
    public void arendaPlate() {
        System.out.println("  Общежитиядагылар айына 5000толошот ");
    }


}

