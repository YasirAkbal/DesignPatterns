/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author yasir
 */
public class WebObserver implements Observer{

    String sonBilgi;
    @Override
    public void update(ArrayList<String> bilgiler) {
        sonBilgi = bilgiler.get(bilgiler.size()-1);
    }
    
}
