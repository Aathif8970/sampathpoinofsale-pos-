/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Aathif
 */
public class cashierreaddata {
    
    String Ca_id;
    String Ca_name;
    String Addresss;
    String Tel_nos;
    String Genders;
    String Dates;

    public cashierreaddata(String Ca_id, String Ca_name, String Addresss, String Tel_nos, String Genders, String Dates) {
        this.Ca_id = Ca_id;
        this.Ca_name = Ca_name;
        this.Addresss = Addresss;
        this.Tel_nos = Tel_nos;
        this.Genders = Genders;
        this.Dates = Dates;
    }

    public String getCa_id() {
        return Ca_id;
    }

    public void setCa_id(String Ca_id) {
        this.Ca_id = Ca_id;
    }

    public String getCa_name() {
        return Ca_name;
    }

    public void setCa_name(String Ca_name) {
        this.Ca_name = Ca_name;
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
