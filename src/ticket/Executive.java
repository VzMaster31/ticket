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
public class Executive implements Ticket {
    
    String name = "";
    int price = 110000;
    
    Executive(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
    
}
