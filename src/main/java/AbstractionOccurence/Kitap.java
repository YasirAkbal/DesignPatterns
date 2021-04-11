/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractionOccurence;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class Kitap {
    String bagislayan;
    //Occurence yapısı(Kitap), abstraction sınıfını(KatalogKitap) gösteriyor.
    //Tek bir tane referans yeterli çünkü 1 tane abstraction sınıfına bağlı olmalı.
    KatalogKitap katalogKitap;  
    
    public Kitap(String bagislayan,KatalogKitap katalogKitap)
    {
        this.bagislayan = bagislayan;
        this.katalogKitap = katalogKitap;
    }
}
