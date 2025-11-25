/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Aathif
 */
public class salesbranchs {
    
    String Branch_id;
    String Branc_name;
    int sales;

    public salesbranchs(String Branch_id, String Branc_name, int sales) {
        this.Branch_id = Branch_id;
        this.Branc_name = Branc_name;
        this.sales = sales;
    }

    public String getBranch_id() {
        return Branch_id;
    }

    public void setBranch_id(String Branch_id) {
        this.Branch_id = Branch_id;
    }

    public String getBranc_name() {
        return Branc_name;
    }

    public void setBranc_name(String Branc_name) {
        this.Branc_name = Branc_name;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    
    
    
    
}
