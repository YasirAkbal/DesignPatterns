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
public class OracleConnection extends SQLConnection{

    @Override
    public boolean connect(String username, String password) {
        if(username.equals("test") && password.equals("123"))
            this.bagliMi = true;
        return bagliMi;
    }

    @Override
    public boolean disconnect() {
        bagliMi = false;
        return bagliMi;
    }
    
}
