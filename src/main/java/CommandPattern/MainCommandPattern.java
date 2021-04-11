/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author yasir
 */
public class MainCommandPattern {

    /**
     * Tasarım kalibindaki Client burasi
     */
    public static void main(String[] args) {
        Televizyon televizyon = new Televizyon(43,15);
        Kumanda kumanda = new Kumanda();
        
        kumanda.komutEkle(new SesAzaltCommand(televizyon));
        kumanda.komutEkle(new SesAcCommand(televizyon));
        kumanda.komutEkle(new OncekiKanalCommand(televizyon));
        kumanda.komutEkle(new SonrakiKanalCommand(televizyon));
        
        kumanda.menu();
    }
    
}
