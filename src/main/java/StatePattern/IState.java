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
public interface IState {
    public void kullanmaSuyuSicaklikAzalt();
    public void kullanmasuyuSicaklikArttir();
    public void isinmaSuyuSicaklikAzalt();
    public void isinmaSuyuSicaklikArttir();
    public void kisModunaGec();
    public void yazModunaGec();
    public void suyuBosalt();
}
