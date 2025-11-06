/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Aathif
 */
public class customerreaddata {
    
    String C_id;
    String C_name;
    String Addresss;
    String Tel_nos;
    String Genders;
    String Dates;

    public customerreaddata(String C_id, String C_name, String Addresss, String Tel_nos, String Genders, String Dates) {
        this.C_id = C_id;
        this.C_name = C_name;
        this.Addresss = Addresss;
        this.Tel_nos = Tel_nos;
        this.Genders = Genders;
        this.Dates = Dates;
    }

    public String getC_id() {
        return C_id;
    }

    public void setC_id(String C_id) {
        this.C_id = C_id;
    }

    public String getC_name() {
        return C_name;
    }

    public void setC_name(String C_name) {
        this.C_name = C_name;
    }

    public String getAddresss() {
        return Addresss;
    }

    public void setAddresss(String Addresss) {
        this.Addresss = Addresss;
    }

    public String getTel_nos() {
        return Tel_nos;
    }

    public void setTel_nos(String Tel_nos) {
        this.Tel_nos = Tel_nos;
    }

    public String getGenders() {
        return Genders;
    }

    public void setGenders(String Genders) {
        this.Genders = Genders;
    }

    public String getDates() {
        return Dates;
    }

    public void setDates(String Dates) {
        this.Dates = Dates;
    }
    
    
    
    
    
}
