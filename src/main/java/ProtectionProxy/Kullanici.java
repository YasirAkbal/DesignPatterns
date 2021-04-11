/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectionProxy;

/**
 *
 * @author yasir
 */
public class Kullanici implements IKullanici {
    String kullaniciAdi;
    String sifre;
    
    public Kullanici(String kullaniciAdi,String sifre)
    {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    @Override
    public void yorumYap(String yorum) {
        System.out.println("Yapilan yorum : "+yorum);
    }
    
    
}
