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
public class KullaniciProxy implements IKullanici{
 
    Kullanici kullanici;
    
    public KullaniciProxy(String username,String password)
    {
        //Kullanici cok agir kaynak kullanima sahip degil varsayiminda bulunup: Real Subjecti, Proxy ilk oluşturulduğunda init etmede sorun görmedim.
        kullanici = new Kullanici(username,password);
    }
    
    @Override
    public void yorumYap(String yorum) {
        if(kullanici.kullaniciAdi.equals("test") && kullanici.sifre.equals("123456"))
            kullanici.yorumYap(yorum);
        else
            System.out.println("Kullanici adi sifre yanlis, yorum yapilamadi.");
    }
}
