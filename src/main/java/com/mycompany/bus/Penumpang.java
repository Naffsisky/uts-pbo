/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bus;

/**
 *
 * @author naffsisky
 */
public class Penumpang {
    public String tujuan;
    public String berangkat;
    public int jumlah;

    public Penumpang (String tujuan, String berangkat, int jumlah){
        this.tujuan = tujuan;
        this.berangkat = berangkat;
        this.jumlah = jumlah;
    }

    public String getTujuan(){
        return tujuan;
    }
    public String getBerangkat(){
        return berangkat;
    }
    public int getJumlah(){
        return jumlah;
    }

    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    public void setBerangkat(String berangkat){
        this.berangkat = berangkat;
    }
    public void setJumlah(int jumlah){
        this.jumlah += jumlah;
    }

    public void info(){
        System.out.println("Penumpang dari " + this.berangkat + " ke " + this.tujuan + " sebanyak " + this.jumlah + " orang");
    }
}