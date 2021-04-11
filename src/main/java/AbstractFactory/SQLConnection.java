/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author yasir
 */
public abstract class SQLConnection {
    
    public boolean bagliMi = false;
    
    public abstract boolean connect(String username,String password);
    public abstract boolean disconnect();
}
