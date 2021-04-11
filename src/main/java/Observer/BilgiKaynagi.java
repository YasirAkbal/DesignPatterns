/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author yasir
 */
public class BilgiKaynagi {
    ArrayList<Observer> observerlar = new ArrayList<>();
    ArrayList<String> bilgiler = new ArrayList<>();
    
    public void bilgiEkle(String bilgi)
    {
        bilgiler.add(bilgi);
        notifyAllObservers();
    }
 
    
    //Observable için gerekli tanımlamalar
    public void addObserver(Observer observer)
    {
        observerlar.add(observer);
    }
    
    public void notifyAllObservers()
    {
        for(Observer o : observerlar)
        {
            o.update(bilgiler);
        }
    }  
}
