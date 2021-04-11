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
public class ClientProtectionProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IKullanici i1 = new KullaniciProxy("test","123456");
        IKullanici i2 = new KullaniciProxy("test","33");
        i1.yorumYap("eline saglik kardes");
        i2.yorumYap("paylasildi konu kilit");
    }
    
}
