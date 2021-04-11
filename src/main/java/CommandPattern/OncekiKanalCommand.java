/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author yasir
 */
public class OncekiKanalCommand implements ICommand{

    Televizyon televizyon;
    
    public OncekiKanalCommand(Televizyon televizyon)
    {
        this.televizyon = televizyon;
    }
    
    @Override
    public void Command() {
        televizyon.oncekiKanal();
    }
    
    @Override
    public String toString()
    {
        return "Onceki Kanal";
    }
}
