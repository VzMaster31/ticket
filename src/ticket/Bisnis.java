/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 * implements = Class Bisnis ini menggunakan interface Ticket jadi harus ada
 fungsi yang ada diinterface tersebut
 - String getName()
 - int getPrice()
 *
 * @author 4d3h3
 */
public class Bisnis implements Tiket {
    
    String nama = "";
    int harga = 150000;
    
    Bisnis(String nama) {
        this.nama = nama;
    }
    
    public String ambilNama() {
        return this.nama;
    }

    public int ambilHarga() {
        return this.harga;
    }
    
    
}
