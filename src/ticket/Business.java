/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 * implements = Class Business ini menggunakan interface Ticket jadi harus ada
 * fungsi yang ada diinterface tersebut
 * - String getName()
 * - int getPrice()
 *
 * @author 4d3h3
 */
public class Business implements Ticket {
    
    String name = "";
    int price = 80000;
    
    Business(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
    
}
