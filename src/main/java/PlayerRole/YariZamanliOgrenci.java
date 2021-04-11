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
public class YariZamanliOgrenci extends OgrenciDevamRolu{

    @Override
    public boolean mezunOlabilirMiDevamsizlik(int devamGunu) {
        if(devamGunu > 50)
            return true;
        return false;
    }
    
}
