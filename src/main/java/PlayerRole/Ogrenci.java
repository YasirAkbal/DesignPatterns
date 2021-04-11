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
public class Ogrenci {
    String isim;
    float notOrtalamasi;
    int devamGunu;
    
    OgrenciDevamRolu ogrenciDevamTipi;
    OgrenciSeviyeRolu ogrenciSeviyesi;
    
    public Ogrenci(String isim,float notOrtalamasi,int devamGunu)
    {
        this.isim = isim;
        this.notOrtalamasi = notOrtalamasi;
        this.devamGunu = devamGunu;
    }
    
    public boolean ogrenciMezunOlabilirMi()
    {
        return ogrenciDevamTipi.mezunOlabilirMiDevamsizlik(devamGunu) &&
               ogrenciSeviyesi.mezunOlabilirMiSeviye(notOrtalamasi);
    }
}
