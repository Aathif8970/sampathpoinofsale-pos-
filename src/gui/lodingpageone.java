/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Aathif
 */
public class lodingpageone {
    
        public static void main(String[] args) {
        lodingpage pf=new lodingpage();
        homenew hm=new homenew();
        pf.setVisible(true);
        
        for (int i=1; 1<=100; i++){
            try{
                
                Thread.sleep(80);
                pf.ProgressBar.setValue(i);
               if(i%2==0){
                   pf.pl.setText("Please Wait..");
                   
               } else{
                   pf.pl.setText("Please Wait..");
               }
               
               if(i==100){
                   pf.setVisible(false);
                   hm.setVisible(true);
                   
                   
                   
               }
            }catch(InterruptedException ex){
                //Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}

    

