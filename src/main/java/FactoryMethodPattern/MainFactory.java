/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

/**
 *
 * @author yasir
 */
public class MainFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Factory factory = new Factory();

        IComputer c1 = new Desktop();
        IComputer c2 = new Laptop();
        
        c1.type();
        c2.type();

    }
    
}
