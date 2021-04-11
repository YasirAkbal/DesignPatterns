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
enum Type{
    Desktop,
    Laptop
}

public class Factory {
    
    public IComputer createComputer(Type type)
    {
        IComputer newComputer = null; 
        switch(type)
        {
            case Desktop:
                newComputer = new Desktop();
            case Laptop:
                newComputer = new Laptop();
        }
        return newComputer;
    }
    
}
