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
public interface IComponent {
    public void operation();
    public void add(IComponent component);
    public void remove(IComponent component);
    public IComponent getChild(int i);
    public String isimDondur();
}
