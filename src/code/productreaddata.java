/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Aathif
 */
public class productreaddata {
    
    String P_id;
    String P_name;
    int Price;
    String Date;
    int Qty;
    String Region;

    public productreaddata(String P_id, String P_name, int Price, String Date, int Qty, String Region) {
        this.P_id = P_id;
        this.P_name = P_name;
        this.Price = Price;
        this.Date = Date;
        this.Qty = Qty;
        this.Region = Region;
    }

    public String getP_id() {
        return P_id;
    }

    public void setP_id(String P_id) {
        this.P_id = P_id;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }
    
    
    
}
