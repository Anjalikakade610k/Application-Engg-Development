/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anjalikakade
 */
public class Cardetailshistory {
    private ArrayList<Product>history;
    public Cardetailshistory(){
        this.history = new ArrayList<Product>();
        
    }

    public ArrayList<Product> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Product> history) {
        this.history = history;
    }
    
    public Product addNewProduct(){
        Product newP = new Product();
        history.add(newP);
        return newP;
    }
    public void deleteProduct(Product vs){
        history.remove(vs);
    }

    
}
 