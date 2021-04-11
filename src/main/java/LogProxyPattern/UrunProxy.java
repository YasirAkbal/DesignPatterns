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
public class UrunProxy implements IProxyUrun {

    Urun urun;
    Logger logger = Logger.getInstance();
    
    public UrunProxy(String isim)
    {
        urun = new Urun(isim);
    }
    
    //Log Proxy Patterni ile bir islemi yaptiktan sonra log atiyoruz
    @Override
    public void urunGiris(int eklenecekSayi) {
        urun.urunGiris(eklenecekSayi);
        logger.logEkle(urun,true);
    }

    @Override
    public void urunCikis(int cikisYapilacakSayi) {
        urun.urunGiris(cikisYapilacakSayi);
        logger.logEkle(urun,false);
    }
    
}
