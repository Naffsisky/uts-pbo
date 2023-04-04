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
        // membuat objek dari class Halte
        Halte halte1 = new Halte("Porong", 0);
        Halte halte2 = new Halte("Surabaya", 5);
        Halte halte3 = new Halte("Gresik", 0);
        Penumpang penumpang1 = new Penumpang("Porong", "Surabaya", 10);
        Penumpang penumpang2 = new Penumpang("Surabaya", "Gresik", 5);
        
        // memanggil method naikPenumpang()
        halte1.naikPenumpang(10);
        halte2.naikPenumpang(5);
        halte3.naikPenumpang(5);

        halte1.info();
        penumpang1.info();
        halte2.info();
        penumpang2.info();
        halte3.info();
        
        

    }
}
