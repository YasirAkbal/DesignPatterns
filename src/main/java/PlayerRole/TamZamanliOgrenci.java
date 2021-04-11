/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerRole;

/**
 *
 * @author yasir
 */
public class TamZamanliOgrenci extends OgrenciDevamRolu{

    @Override
    public boolean mezunOlabilirMiDevamsizlik(int devamGunu) {
        if(devamGunu > 150)
            return true;
        return false;
    }
    
}
