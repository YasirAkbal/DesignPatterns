/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delegate;

/**
 *
 * @author yasir
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Cat c = new Cat();
            // Delegation
            c.makeSound();          // Output: Meow
            // now to change the sound it makes
            ISoundBehaviour newsound = new RoarSound();
            c.setSoundBehaviour(newsound);           
            c.makeSound();          // Output: Roar!
    }
    
}
