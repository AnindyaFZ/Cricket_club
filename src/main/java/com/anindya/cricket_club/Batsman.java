package com.anindya.cricket_club;

public class Batsman extends Player{
    String pType, SR, f_s,HS;



    public Batsman(String name, String dob, String doj, int age, String pType, String SR, String f_s, String HS,String pass) {
        super(name, dob, doj, age,pass);
        this.pType = pType;
        this.SR = SR;
        this.f_s = f_s;
        this.HS = HS;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getSR() {
        return SR;
    }

    public void setSR(String SR) {
        this.SR = SR;
    }

    public String getF_s() {
        return f_s;
    }

    public void setF_s(String f_s) {
        this.f_s = f_s;
    }

    public String getHS() {
        return HS;
    }

    public void setHS(String HS) {
        this.HS = HS;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\n' +
                "dob='" + dob + '\n' +
                "doj='" + doj + '\n' +
                "age=" + age + '\n'+
                "pType='" + pType + '\n' +
                "SR='" + SR + '\n' +
                "f_s='" + f_s + '\n' +
                "HS='" + HS + '\n';

    }
}
