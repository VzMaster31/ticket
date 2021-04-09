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
public class Eksekutif implements Tiket {
    
    String nama = "";
    int price = 300000;
    int seat = 10;
    
    Eksekutif(String nama) {
        this.nama = nama;
    }
    
    public String ambilNama() {
        return this.nama;
    }

    public int ambilHarga() {
        return this.price;
    }
    
}
