/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

import java.util.ArrayList;

/**
 *
 * @author yasir
 */
public class AdapterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Ports> ports = new ArrayList<>();
        ports.add(new HDMIPort());
        ports.add(new DVIPort());
        
        //direkt olarak kullanim mumkun degil
        //ports.add(new VGAPort());
       
        //adaptor ile birlikte kullanim mumkun
        ports.add(new VGAAdapter(new VGAPort()));
      
        for(Ports port : ports)
        {
            port.getInfo();
        }
    
    }
    
}
