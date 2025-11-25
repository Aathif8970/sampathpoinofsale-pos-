/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Aathif
 */
public class productsales {
    
    int product_ids;
    String prodcut_names;
    int procut_prices;
    int qunatitys;
    int totals;

    public productsales(int product_ids, String prodcut_names, int procut_prices, int qunatitys, int totals) {
        this.product_ids = product_ids;
        this.prodcut_names = prodcut_names;
        this.procut_prices = procut_prices;
        this.qunatitys = qunatitys;
        this.totals = totals;
    }

    public int getProduct_ids() {
        return product_ids;
    }

    public void setProduct_ids(int product_ids) {
        this.product_ids = product_ids;
    }

    public String getProdcut_names() {
        return prodcut_names;
    }

    public void setProdcut_names(String prodcut_names) {
        this.prodcut_names = prodcut_names;
    }

    public int getProcut_prices() {
        return procut_prices;
    }

    public void setProcut_prices(int procut_prices) {
        this.procut_prices = procut_prices;
    }

    public int getQunatitys() {
        return qunatitys;
    }

    public void setQunatitys(int qunatitys) {
        this.qunatitys = qunatitys;
    }

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }
    
    
    
    
    
}
