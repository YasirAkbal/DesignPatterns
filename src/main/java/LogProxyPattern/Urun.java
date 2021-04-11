/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogProxyPattern;

/**
 *
 * @author yasir
 */
public class Urun implements IProxyUrun{
    String urunAdi;
    int adet;
    
    public Urun(String urunAdi)
    {
        this.urunAdi = urunAdi;
    }
    
    @Override
    public void urunGiris(int eklenecekSayi)
    {
        adet += eklenecekSayi;
    }
    
    @Override
    public void urunCikis(int cikisYapilacakSayi)
    {
        adet -= cikisYapilacakSayi;
    }
}
