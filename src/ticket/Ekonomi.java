/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author 4d3h3
 */
public class Ekonomi implements Tiket {
    
    String nama = "";
    int harga = 75000;
    
    Ekonomi(String nama) {
        this.nama = nama;
    }
    
    public String ambilNama() {
        return this.nama;
    }

    public int ambilHarga() {
        return this.harga;
    }
    
    
    
}
