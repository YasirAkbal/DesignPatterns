/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author yasir
 */
public class Dosya implements IComponent{

    String dosyaAdi;
    
    public Dosya(String dosyaAdi)
    {
        this.dosyaAdi = dosyaAdi;
    }
    
    @Override
    public void operation() {
        System.out.println(this.isimDondur());
    }

    @Override
    public void add(IComponent component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(IComponent component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IComponent getChild(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String isimDondur() {
        return "Dosya: " + dosyaAdi;
    }
    
}
