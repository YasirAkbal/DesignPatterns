/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author yasir
 */
public class MainComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Klasor kurslar = new Klasor("Kurslar");
        Klasor yazilim = new Klasor("Yazilim");
        Klasor veriYapilari = new Klasor("Veri Yapilari");  
        kurslar.add(yazilim);
        kurslar.add(veriYapilari);
        
        Klasor cpp = new Klasor("C++");
        Klasor java = new Klasor("Java");
        Klasor python = new Klasor("Python");
        videoEkle("C++",41,cpp);
        videoEkle("Java",34,java);
        videoEkle("Python",25,python);
        yazilim.add(cpp);
        yazilim.add(java);
        yazilim.add(python);
        
        Klasor lineerVeri = new Klasor("Lineer Veri Yapilari");
        Klasor agaclar = new Klasor("Agaclar");
        videoEkle("Lineer Veri Yapilari",21,lineerVeri);
        videoEkle("Agaclar",15,agaclar);
        veriYapilari.add(lineerVeri);
        veriYapilari.add(agaclar);

        kurslar.operation();
    }
    
    static void videoEkle(String kursAdi,int adet,Klasor klasor)
    {
        for(int i=1;i<adet;i++)
        {
            klasor.add(new Dosya(kursAdi+"_Ders_"+i));
        }
    }
}
