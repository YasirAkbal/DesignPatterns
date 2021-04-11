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
public class Kombi {
    int suOrani;
    int kullanmaSuyuSicakligi;
    int kaloriferSuyuSicakligi;
    private IState simdikiDurum;
    IState kisModuDurumu;
    IState yazModuDurumu;
    IState suYokDurumu;
    
    public Kombi()
    {
        this.suOrani = 89;
        this.kullanmaSuyuSicakligi = 40;
        this.kaloriferSuyuSicakligi = 15;
        kisModuDurumu = new KisModu(this);
        yazModuDurumu = new YazModu(this);
        suYokDurumu = new SuYok(this);
        simdikiDurum = yazModuDurumu;
    }
    
    public IState getDurum()
    {
        return suYokDurumu;
    }
    
    public void setDurum(IState yeniDurum)
    {
        this.simdikiDurum = yeniDurum;
    }
    
    public void kullanmaSuyuSicaklikAzalt()
    {
        simdikiDurum.kullanmaSuyuSicaklikAzalt();
    }
    
    public void kullanmasuyuSicaklikArttir()
    {
        simdikiDurum.kullanmasuyuSicaklikArttir();
    }
    
    public void isinmaSuyuSicaklikAzalt()
    {
        simdikiDurum.isinmaSuyuSicaklikAzalt();
    }
    
    public void isinmaSuyuSicaklikArttir()
    {
        simdikiDurum.isinmaSuyuSicaklikArttir();;
    }
    
    public void kisModunaGec()
    {
        simdikiDurum.kisModunaGec();
    }
    
    public void yazModunaGec()
    {
        simdikiDurum.yazModunaGec();
    }
    
    public void suyuBosalt()
    {
        simdikiDurum.suyuBosalt();
    }
}
