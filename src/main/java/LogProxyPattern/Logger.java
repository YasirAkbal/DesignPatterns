/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogProxyPattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author yasir
 */
public class Logger {
    private ArrayList<String> loglarArray = new ArrayList<>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    private static Logger logger;
    
    private Logger(){}
    
    public static Logger getInstance()
    {
        if(logger == null)
            logger = new Logger();
        return logger;
    }
    
    public void logEkle(Urun eklenecekUrun,boolean girisMi)
    {
        loglarArray.add("Tarih: "+dtf.format(LocalDateTime.now())+", Urun: "+eklenecekUrun.urunAdi+ ", " + eklenecekUrun.adet +
                (girisMi ? " Giris" : " Cikis"));
    }
    
    public void loglariGoster()
    {
        for(String s : loglarArray)
        {
            System.out.println(s);
        }
    }
}
