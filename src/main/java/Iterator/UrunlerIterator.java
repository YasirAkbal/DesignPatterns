/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author yasir
 */
public class UrunlerIterator implements IIterator<Urunler>{

    UrunlerAggregate aggregate;
    int indis;
    
    public UrunlerIterator(UrunlerAggregate aggregate)
    {
        this.aggregate = aggregate;
        indis = 0;
    }
    
    @Override
    public Urunler next() {
        return aggregate.getUrun(indis++);
    }

    @Override
    public boolean hasNext() {
        return indis < aggregate.getSize();
    }
    
}
