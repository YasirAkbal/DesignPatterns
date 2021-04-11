/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Immutable2;

/**
 *
 * @author yasir
 */

//İmmutable patterni için benim dusundugum tasarim.
public class CalisanImmutable {
    private String isim;
    private int yas;
    
    public CalisanImmutable(String isim,int yas)
    {
        this.isim = isim;
        this.yas = yas;
    }
    
    public String getIsim()
    {
        return this.isim;
    }
    
    public int getYas()
    {
        return this.yas;
    }
    
    //Java Stringlerdeki Immutable yapısını benzetmeye çalıştım.
    public CalisanImmutable setIsım(String isim)
    {
        return new CalisanImmutable(isim,this.yas);
    }
    
    public CalisanImmutable setYas(int yas)
    {
        return new CalisanImmutable(this.isim,yas);
    }
}
