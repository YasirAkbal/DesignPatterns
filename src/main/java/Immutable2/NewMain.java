/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Immutable2;

/**
 *
 * @author yasir
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalisanImmutable calisan = new CalisanImmutable("Yasir",31);
        
        System.out.println("Calisan adi : "+calisan.getIsim());
        System.out.println("Calisan yasi : "+calisan.getYas());
        System.out.println("Nesne hash : " + calisan.hashCode());
        
        calisan = calisan.setYas(25);
        
        System.out.println("---Degerler degistirildikten sonra : ");
        
        System.out.println("Calisan adi : "+calisan.getIsim());
        System.out.println("Calisan yasi: "+calisan.getYas());
        System.out.println("Nesne hash : " + calisan.hashCode());
    }
    
}
