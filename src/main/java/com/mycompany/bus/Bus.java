/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bus;

/**
 *
 * @author naffsisky
 */
public class Bus {
    
    public static void main(String[] args) {
        
        // membuat batas maksimal penumpang
        int maxPenumpang = 20;
        // membuat jumlah penumpang dalam bus
        int jumlahPenumpang = 0;
        // rute kantor - porong - surabaya - gresik  
        System.out.println("Bus berangkat dari Kantor menuju Porong");
        // menambahkan penumpang dari halte kantor ke bus, 3 menuju porong dan 2 menuju gresik
        Penumpang penumpang1 = new Penumpang("Porong", "Kantor", 3);
        Penumpang penumpang2 = new Penumpang("Gresik", "Kantor", 2);
        // menaikan penumpang dari halte kantor ke bus
        jumlahPenumpang += penumpang1.getJumlah();
        jumlahPenumpang += penumpang2.getJumlah();
        // menampilkan jumlah penumpang yang naik di halte kantor
        penumpang1.info();
        penumpang2.info();
        // menampilkan jumlah penumpang yang ada di bus
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
        System.out.println("\nBus tiba di halte Porong");
        // penumpang dari halte kantor turun di halte porong
        jumlahPenumpang -= penumpang1.getJumlah();
        // menampilkan jumlah penumpang yang turun di halte porong
        System.out.println("Jumlah penumpang yang turun di halte Porong sebanyak " + penumpang1.getJumlah() + " orang");
        // penumpang dari halte porong naik ke bus
        Penumpang penumpang3 = new Penumpang("Surabaya", "Porong", 1);
        Penumpang penumpang4 = new Penumpang("Gresik", "Porong", 1);
        // menaikan penumpang dari halte porong ke bus jika jumlah penumpang kurang dari maksimal
        if (jumlahPenumpang + penumpang3.getJumlah() + penumpang4.getJumlah() <= maxPenumpang){
            jumlahPenumpang += penumpang3.getJumlah();
            jumlahPenumpang += penumpang4.getJumlah();
        }
        // menampilkan jumlah penumpang yang naik di halte porong
        penumpang3.info();
        penumpang4.info();
        // bus berangkat dari halte porong menuju surabaya
        System.out.println("\nBus berangkat dari halte Porong menuju Surabaya");
        // menjumlahkan penumpang yang naik di halte porong
        System.out.println("Jumlah penumpang yang naik di halte Porong sebanyak " + (penumpang3.getJumlah() + penumpang4.getJumlah()) + " orang");
        // menampilkan jumlah penumpang yang ada di bus
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
        // bus tiba di halte surabaya
        System.out.println("\nBus tiba di halte Surabaya");
        // penumpang dari halte porong turun di halte surabaya
        jumlahPenumpang -= penumpang3.getJumlah();
        // menampilkan jumlah penumpang yang turun di halte surabaya
        System.out.println("Jumlah penumpang yang turun di halte Surabaya sebanyak " + penumpang3.getJumlah() + " orang");
        // penumpang dari halte surabaya naik ke bus
        Penumpang penumpang5 = new Penumpang("Gresik", "Surabaya", 5);
        // menaikan penumpang dari halte surabaya ke bus jika jumlah penumpang kurang dari maksimal
        if (jumlahPenumpang + penumpang5.getJumlah() <= maxPenumpang){
            jumlahPenumpang += penumpang5.getJumlah();
        }
        // menampilkan jumlah penumpang yang naik di halte surabaya
        penumpang5.info();
        // bus berangkat dari halte surabaya menuju gresik
        System.out.println("\nBus berangkat dari halte Surabaya menuju Gresik");
        // menjumlahkan penumpang yang naik di halte surabaya
        System.out.println("Jumlah penumpang yang naik di halte Surabaya sebanyak " + penumpang5.getJumlah() + " orang");
        // menampilkan jumlah penumpang yang ada di bus
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
        // bus tiba di halte gresik
        System.out.println("\nBus tiba di halte Gresik");
        // penumpang dari halte surabaya turun di halte gresik
        jumlahPenumpang -= (penumpang5.getJumlah() + penumpang4.getJumlah() + penumpang2.getJumlah());
        // menampilkan jumlah penumpang yang turun di halte gresik
        System.out.println("Jumlah penumpang yang turun di halte Gresik sebanyak " + (penumpang5.getJumlah() + penumpang4.getJumlah() + penumpang2.getJumlah()) + " orang");
        // menampilkan jumlah penumpang yang ada di bus
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
    }
}