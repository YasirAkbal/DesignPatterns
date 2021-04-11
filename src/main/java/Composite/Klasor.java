/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author yasir
 */
public class Klasor implements IComponent {

    String klasorAdi;
    ArrayList<IComponent> elemanlar = new ArrayList<>();
    
    public Klasor(String klasorAdi)
    {
        this.klasorAdi = klasorAdi;
    }
    
    @Override
    public void operation() {
        System.out.println("<-----"+klasorAdi+" klasoru altindakiler----->");
        for(IComponent eleman : elemanlar)
            eleman.operation();
    }

    @Override
    public void add(IComponent component) {
        elemanlar.add(component);
    }

    @Override
    public void remove(IComponent component) {
        elemanlar.remove(component);
    }

    @Override
    public IComponent getChild(int i) {
        return elemanlar.get(i);
    }

    @Override
    public String isimDondur() {
        return "Klasor adi: " + klasorAdi;
    }
    
}
