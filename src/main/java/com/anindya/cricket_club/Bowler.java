package com.anindya.cricket_club;

public class Bowler extends Player{
    String pType, eco, wicket,bf;

    public Bowler(String name, String dob, String doj, int age, String pType, String eco, String wicket, String bf,String pass) {
        super(name, dob, doj, age,pass);
        this.pType = pType;
        this.eco = eco;
        this.wicket = wicket;
        this.bf = bf;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getBf() {
        return bf;
    }

    public void setBf(String bf) {
        this.bf = bf;
    }

    public String getWicket() {
        return wicket;
    }

    public void setWicket(String wicket) {
        this.wicket = wicket;
    }

    public String getEco() {
        return eco;
    }

    public void setEco(String eco) {
        this.eco = eco;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\n' +
                "dob='" + dob + '\n' +
                "doj='" + doj + '\n' +
                "age=" + age +'\n'+
                "pType='" + pType + '\n' +
                "eco='" + eco + '\n' +
                "wicket='" + wicket + '\n' +
                "bf='" + bf ;
    }
}
