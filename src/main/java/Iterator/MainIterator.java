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
public class MainIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UrunlerAggregate aggregate = new UrunlerAggregate();
        IIterator iterator;
        
        aggregate.urunEkle(new Urunler("Laptop","U003"));
        aggregate.urunEkle(new Urunler("Monitor","U008"));
        aggregate.urunEkle(new Urunler("Kulaklik","U018"));
        aggregate.urunEkle(new Urunler("Sandalye","U007"));
        aggregate.urunEkle(new Urunler("Kitap","U001"));
        
        iterator = aggregate.createIterator();
        
        Urunler temp;
        while(iterator.hasNext())
        {
            temp = (Urunler)iterator.next();
            System.out.println("Urun adi: " + temp.isim + ", Urun no: " + temp.no);
        }
        
        
    }
    
}
