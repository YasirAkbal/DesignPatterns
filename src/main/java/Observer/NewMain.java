/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author yasir
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BilgiKaynagi kaynak = new BilgiKaynagi();
        MobileObserver mobile1 = new MobileObserver();
        WebObserver web1 = new WebObserver();
        
        kaynak.addObserver(mobile1);
        kaynak.addObserver(web1);
        
        System.out.println("Mobile1 son bilgi = " + mobile1.sonBilgi);
        System.out.println("Web1 son bilgi = " + mobile1.sonBilgi);
        
        kaynak.bilgiEkle("selam");
        
        System.out.println("---Kaynaga veri eklendikten sonra:");
        
        System.out.println("Mobile1 son bilgi = " + mobile1.sonBilgi);
        System.out.println("Web1 son bilgi = " + mobile1.sonBilgi);
        
        kaynak.bilgiEkle("aleykum selam");
        
        System.out.println("---Kaynaga veri eklendikten sonra:");
        
        System.out.println("Mobile1 son bilgi = " + mobile1.sonBilgi);
        System.out.println("Web1 son bilgi = " + mobile1.sonBilgi);
    }
    
}
