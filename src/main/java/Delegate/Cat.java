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
public class Cat {  
  private ISoundBehaviour sound = new MeowSound();  

  public void makeSound() {  
    this.sound.makeSound();  
  }  

  public void setSoundBehaviour(ISoundBehaviour newsound) {  
        this.sound = newsound;  
  }  
}