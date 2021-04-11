/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author yasir
 */
public class KisModu implements IState{

    Kombi kombi;
    
    public KisModu(Kombi kombi)
    {
        this.kombi = kombi;
    }
    
    @Override
    public void kullanmaSuyuSicaklikAzalt() {
        System.out.println("Kullanma suyu sicakligi azaltildi = " + (--kombi.kullanmaSuyuSicakligi));
    }

    @Override
    public void kullanmasuyuSicaklikArttir() {
        System.out.println("Kullanma suyu sicakligi arttirildi = " + (++kombi.kullanmaSuyuSicakligi));
    }

    @Override
    public void isinmaSuyuSicaklikAzalt() {
        System.out.println("Isinma suyu sicakligi azaltildi = " + (--kombi.kaloriferSuyuSicakligi));
    }

    @Override
    public void isinmaSuyuSicaklikArttir() {
        System.out.println("Isinma suyu sicakligi arttirildi = " + (++kombi.kaloriferSuyuSicakligi));
    }

    @Override
    public void kisModunaGec() {
        System.out.println("Zaten kis modundasin");
    }

    @Override
    public void yazModunaGec() {
        kombi.setDurum(kombi.yazModuDurumu);
        System.out.println("Yaz moduna gecildi");
    }

    @Override
    public void suyuBosalt() {
        kombi.suOrani = 0;
        kombi.setDurum(kombi.suYokDurumu);
        System.out.println("Kombideki su bosaltildi");
    }
    
}
