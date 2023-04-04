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
    public String nama;
    public int penumpang;

    public Halte(String nama, int penumpang){
        this.nama = nama;
        this.penumpang = penumpang;
    }
    
    // getter and setter
    public String getNama(){
        return nama;
    }
    public int getPenumpang(){
        return penumpang;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setPenumpang(int penumpang){
        this.penumpang = penumpang;
    }
    
    // method
    public void naikPenumpang(int penumpang){
        this.penumpang += penumpang;
    }
    public void turunPenumpang(int penumpang){
        this.penumpang -= penumpang;
    }
    public void info(){
        System.out.println("Halte " + this.nama + " memiliki " + this.penumpang + " penumpang");
    }


}
