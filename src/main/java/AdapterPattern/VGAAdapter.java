/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author yasir
 */
public class VGAAdapter implements Ports{
    VGAPort vgaPort;
    
    public VGAAdapter(VGAPort vgaPort)
    {
        this.vgaPort = vgaPort;
        vgaToHDMI();
    }
    
    private void vgaToHDMI()
    {
        System.out.println("VGA'dan HDMI'a cevirme islemi gerceklesti.");
    }

    @Override
    public void getInfo() {
        vgaPort.showInformation();
    }
}
