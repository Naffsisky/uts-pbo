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
        // rute kantor - porong - surabaya - gresik  
        int maxPenumpang = 20;
        int jumlahPenumpang = 0;

        System.out.println("Bus berangkat dari Kantor menuju Porong");
        Penumpang penKantorPorong = new Penumpang("Porong", "Kantor", 3);
        Penumpang penKantorGresik = new Penumpang("Gresik", "Kantor", 2);
        // penumpang dari halte porong naik ke bus
        Penumpang penPorongSurabaya = new Penumpang("Surabaya", "Porong", 1);
        Penumpang penPorongGresik = new Penumpang("Gresik", "Porong", 1);
        // penumpang dari halte surabaya naik ke bus
        Penumpang penSurabayaGresik = new Penumpang("Gresik", "Surabaya", 5);
        Penumpang penGresikKantor = new Penumpang("Kantor", "Gresik", 0);
        // menaikan penumpang dari halte kantor ke bus
        jumlahPenumpang += penKantorPorong.getJumlah();
        jumlahPenumpang += penKantorGresik.getJumlah();
        // menampilkan jumlah penumpang yang naik di halte kantor
        penKantorPorong.info();
        penKantorGresik.info();
        // memanggil objek untuk menampilkan jumlah penumpang yang menunggu di halte selanjutnya
        int jumlahPenumpangPorong = penPorongSurabaya.getJumlah() + penPorongGresik.getJumlah();
        Halte haltePorong = new Halte(jumlahPenumpangPorong, "Porong", "Surabaya", "Porong");
        // menampilkan jumlah penumpang yang ada di bus
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
        // menampilkan jumlah penumpang yang menunggu di halte selanjutnya
        haltePorong.info();
        System.out.print("\n----------------------------------------");
        System.out.println("\nBus tiba di halte Porong");
        // penumpang dari halte kantor turun di halte porong
        jumlahPenumpang -= penKantorPorong.getJumlah();
        System.out.println("Jumlah penumpang yang turun di halte Porong sebanyak " + penKantorPorong.getJumlah() + " orang");
        // menaikan penumpang dari halte porong ke bus jika jumlah penumpang kurang dari maksimal
        if (jumlahPenumpang + penPorongSurabaya.getJumlah() + penPorongGresik.getJumlah() <= maxPenumpang){
            jumlahPenumpang += penPorongSurabaya.getJumlah();
            jumlahPenumpang += penPorongGresik.getJumlah();
        }
        penPorongSurabaya.info();
        penPorongGresik.info();
        // memanggil objek untuk menampilkan jumlah penumpang yang menunggu di halte selanjutnya
        int jumlahPenumpangSurabaya = penSurabayaGresik.getJumlah();
        Halte halteSurabaya = new Halte(jumlahPenumpangSurabaya, "Surabaya", "Gresik", "Surabaya");
        System.out.println("\nBus berangkat dari halte Porong menuju Surabaya");
        System.out.println("Jumlah penumpang yang naik di halte Porong sebanyak " + (penPorongSurabaya.getJumlah() + penPorongGresik.getJumlah()) + " orang");
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
        // menampilkan jumlah penumpang yang menunggu di halte selanjutnya
        halteSurabaya.info();
        System.out.print("\n----------------------------------------");
        System.out.println("\nBus tiba di halte Surabaya");
        // penumpang dari halte porong turun di halte surabaya
        jumlahPenumpang -= penPorongSurabaya.getJumlah();
        System.out.println("Jumlah penumpang yang turun di halte Surabaya sebanyak " + penPorongSurabaya.getJumlah() + " orang");
        if (jumlahPenumpang + penSurabayaGresik.getJumlah() <= maxPenumpang){
            jumlahPenumpang += penSurabayaGresik.getJumlah();
        }
        penSurabayaGresik.info();
        // memanggil objek untuk menampilkan jumlah penumpang yang menunggu di halte selanjutnya
        int jumlahPenumpangGresik = penGresikKantor.getJumlah();
        Halte halteGresik = new Halte(jumlahPenumpangGresik, "Gresik", "Kantor", "Gresik");

        System.out.println("\nBus berangkat dari halte Surabaya menuju Gresik");
        System.out.println("Jumlah penumpang yang naik di halte Surabaya sebanyak " + penSurabayaGresik.getJumlah() + " orang");
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
        // menampilkan jumlah penumpang yang menunggu di halte selanjutnya
        // bus tiba di halte gresik
        halteGresik.info();
        System.out.print("\n----------------------------------------");
        System.out.println("\nBus tiba di halte Gresik");
        // penumpang dari halte surabaya turun di halte gresik
        jumlahPenumpang -= (penSurabayaGresik.getJumlah() + penPorongGresik.getJumlah() + penKantorGresik.getJumlah());
        System.out.println("Jumlah penumpang yang turun di halte Gresik sebanyak " + (penSurabayaGresik.getJumlah() + penPorongGresik.getJumlah() + penKantorGresik.getJumlah()) + " orang");
        System.out.println("Jumlah penumpang yang ada di bus sebanyak " + jumlahPenumpang + " orang");
    }
}