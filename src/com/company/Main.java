package com.company;

public class Main {

    public static void main(String[] args) {

        Famly famly1= new Famly(2);
        Famly famly2= new Famly(3);
        Famly famly3= new Famly(3);

        Famly[]famlies1={famly1};
        Famly[]famlies2={famly2};
        Famly[]famlies3={famly3};

        Kvartira kvartira= new Kvartira("Востое 5 те",famlies1);
        System.out.println(kvartira);
        kvartira.payAble();

        Obshiaga obshiaga=new Obshiaga("Джалда",famlies2);
        System.out.println(obshiaga);
        obshiaga.arendaPlate();

        Gostinisa gostnisa= new Gostinisa("Арча бешикте  ",famlies3);
        System.out.println(gostnisa);
        gostnisa.arendaPlate();
        


    }
}
