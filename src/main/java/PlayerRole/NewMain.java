/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerRole;

/**
 *
 * @author yasir
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ogrenci ahmet = new Ogrenci("Yasir",2.93f,160);
        Ogrenci veli = new Ogrenci("Veli",2.5f,70);
        
        ahmet.ogrenciDevamTipi = new TamZamanliOgrenci();
        ahmet.ogrenciSeviyesi = new LisansOgrenci();
        
        veli.ogrenciDevamTipi = new TamZamanliOgrenci();
        veli.ogrenciSeviyesi = new LisansUstuOgrenci();
        
        System.out.println("Yasir Mezun olabilir mi = "+ahmet.ogrenciMezunOlabilirMi());
        System.out.println("Veli Mezun olabilir mi = "+veli.ogrenciMezunOlabilirMi());
        
        ahmet.ogrenciSeviyesi = new LisansUstuOgrenci();
        veli.ogrenciDevamTipi = new YariZamanliOgrenci();
        
        System.out.println("Yasir Mezun olabilir mi = "+ahmet.ogrenciMezunOlabilirMi());
        System.out.println("Veli Mezun olabilir mi = "+veli.ogrenciMezunOlabilirMi());
    }
    
}
