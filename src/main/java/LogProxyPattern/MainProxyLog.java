/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogProxyPattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author yasir
 */
public class MainProxyLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProxyUrun urun1 = new UrunProxy("Telefon");
        IProxyUrun urun2 = new UrunProxy("Laptop");
        IProxyUrun urun3 = new UrunProxy("Kulaklik");
        
        urun1.urunGiris(13);
        urun2.urunGiris(64);
        urun1.urunCikis(5);
        urun3.urunGiris(51);
        urun2.urunCikis(6);
        urun3.urunCikis(1);
        urun1.urunGiris(5);
        
        Logger.getInstance().loglariGoster();
    }
    
}
