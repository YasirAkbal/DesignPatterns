/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;

/**
 *
 * @author yasir
 */
public class UrunlerAggregate implements IAggregate<Urunler>{

    private ArrayList<Urunler> urunler = new ArrayList<>();
    
    void urunEkle(Urunler urun)
    {
        urunler.add(urun);
    }
    
    void urunSil(int i)
    {
        urunler.remove(i);
    }
    
    public Urunler getUrun(int i)
    {
        return urunler.get(i);
    }
    
    @Override
    public IIterator<Urunler> createIterator() {
        return new UrunlerIterator(this);
    }
    
    public int getSize()
    {
        return urunler.size();
    }
    
}
