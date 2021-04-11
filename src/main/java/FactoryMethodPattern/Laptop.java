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
public class Laptop implements IComputer{

    @Override
    public void type() {
        System.out.println("Laptop.");
    }
    
}
