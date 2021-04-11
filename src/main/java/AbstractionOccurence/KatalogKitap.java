/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractionOccurence;

import java.util.ArrayList;


/**
 *
 * @author yasir
 */
public class KatalogKitap {
    private String kitapAdi;
    private String yazar;
    private int sayfaSayisi;
    /*KatalogKitap(Abstraction) sınıfı kendisine ait kitap örneklerini gösteriyor.
     *Bu işlemi yapmak için bir koleksiyon kullanmak gerekli. Çünkü bir Abstraction sınıfının çok sayıda örneği(occurunce) olabilir.
    */
    ArrayList<Kitap> kitap = new ArrayList<>();  
    
    public KatalogKitap(String kitapAdi,String yazar,int sayfaSayisi)
    {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }
    
    public KatalogKitap(String kitapAdi,String yazar,int sayfaSayisi,Kitap eklenecekKitap)
    {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.kitap.add(eklenecekKitap);
    }
    
    public void ekle(Kitap eklenecekKitap)
    {
        this.kitap.add(eklenecekKitap);
    }  
    
    public String getKitapAdi()
    {
        return this.kitapAdi;
    }
    
    public String getYazar()
    {
        return this.yazar;
    }
    
    public int getSayfaSayisi()
    {
        return this.sayfaSayisi;
    }
}
