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
public class SQLServerFactory implements SQLFactory{

    @Override
    public SQLConnection createConnection() {
        return new SQLServerConnection();
    }

    @Override
    public SQLCommand createCommand() {
        return new SQLServerCommand();
    }
    
}
