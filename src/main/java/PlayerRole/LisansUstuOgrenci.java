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
public class LisansUstuOgrenci extends OgrenciSeviyeRolu{

    @Override
    public boolean mezunOlabilirMiSeviye(float ortalama) {
        if(ortalama >= 2.5)
            return true;
        return false;
    }
    
}
