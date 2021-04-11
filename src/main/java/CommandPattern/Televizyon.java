/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author yasir
 */
public class Televizyon {
    int sesSeviyesi;
    int kanalNo;
    
    public Televizyon(int sesSeviyesi,int kanalNo)
    {
        this.sesSeviyesi = sesSeviyesi;
        this.kanalNo = kanalNo;
    }
    
    public void oncekiKanal()
    {
        System.out.println("Mevcut kanal = " + (--kanalNo));
    }
    
    public void sonrakiKanal()
    {
        System.out.println("Mevcut kanal = " + (++kanalNo));
    }
        
    public void sesAzalt()
    {
        System.out.println("Mevcut ses seviyesi = " + (--sesSeviyesi));
    }
    
    public void sesArttir()
    {
        System.out.println("Mevcut ses seviyesi = " + (++sesSeviyesi));
    }
}
