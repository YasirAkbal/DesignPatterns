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
public class YazModu implements IState{
    
    Kombi kombi;
    
    public YazModu(Kombi kombi)
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
        kombi.setDurum(kombi.kisModuDurumu);
        System.out.println("Kis moduna gecildi");
    }

    @Override
    public void yazModunaGec() {
        System.out.println("Zaten yaz modundasin.");
    }

    @Override
    public void suyuBosalt() {
        kombi.suOrani = 0;
        kombi.setDurum(kombi.suYokDurumu);
        System.out.println("Kombideki su bosaltildi");
    }
}
