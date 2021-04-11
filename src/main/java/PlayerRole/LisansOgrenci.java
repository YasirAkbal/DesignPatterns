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
public class LisansOgrenci extends OgrenciSeviyeRolu{

    @Override
    public boolean mezunOlabilirMiSeviye(float ortalama) {
        if(ortalama >= 2)
            return true;
        return false;
    }
    
}
