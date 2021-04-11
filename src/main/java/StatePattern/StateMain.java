/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author yasir
 */
public class StateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Kombi kombi = new Kombi();
        
        kombi.isinmaSuyuSicaklikArttir();
        kombi.kullanmaSuyuSicaklikAzalt();
        kombi.yazModunaGec();
        kombi.kisModunaGec();
        kombi.suyuBosalt();
        kombi.yazModunaGec();
        kombi.suyuBosalt();
        
    }
    
}
