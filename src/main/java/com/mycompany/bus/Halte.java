/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bus;

/**
 *
 * @author naffsisky
 */
public class Halte {
    // membuat atribut dari class Halte untuk menampilkan berapa jumlah penumpang yang naik di setiap halte
    public int jumlahPenumpang;
    public String namaHalte;
    public String tujuan;
    public String berangkat;

    public Halte (int jumlahPenumpang, String namaHalte, String tujuan, String berangkat){
        this.jumlahPenumpang = jumlahPenumpang;
        this.namaHalte = namaHalte;
        this.tujuan = tujuan;
    }

    public int getJumlahPenumpang(){
        return jumlahPenumpang;
    }

    public String getNamaHalte(){
        return namaHalte;
    }

    public String getTujuan(){
        return tujuan;
    }

    public void setJumlahPenumpang(int jumlahPenumpang){
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public void setNamaHalte(String namaHalte){
        this.namaHalte = namaHalte;
    }

    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }

    public void info(){
        System.out.println("\nJumlah penumpang menunggu di halte " + this.namaHalte + " sebanyak " + this.jumlahPenumpang + " orang");
    }
}
