/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author yasir
 */
public class HDMIPort implements Ports{

    @Override
    public void getInfo() {
        System.out.println("Ben HDMI portuyum");
    }
    
}
