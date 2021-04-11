/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Immutable;

/**
 *
 * @author yasir
 */

//Bu kalıp için ayrıca bir de kendim uygulama yapmaya çalıştım
public final class CalisanImmutable {
    private final String isim;
    private final int yas;
    
    public CalisanImmutable(String isim, int yas)
    {
        this.isim = isim;
        this.yas = yas;
    }
    
    public String getIsim()
    {
        return isim;
    }
    
    public int getYas()
    {
        return yas;
    }
}
