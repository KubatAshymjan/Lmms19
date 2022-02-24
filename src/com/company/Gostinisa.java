package com.company;

import java.util.Arrays;

public class Gostinisa implements ArenaAble{
    private  String adress;
    Famly []famlies;

    public Gostinisa(String adress, Famly[] famlies) {
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
        return "Gostnissa{" +
                "adress='" + adress + '\'' +
                ", famlies=" + Arrays.toString(famlies) +
                '}';
    }

    @Override
    public void arendaPlate() {
        System.out.println("  Гостинициядагылар айына 10000толошот ");
    }
}


