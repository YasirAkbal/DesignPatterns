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
public class OracleFactory implements SQLFactory{

    @Override
    public SQLConnection createConnection() {
        return new OracleConnection();
    }

    @Override
    public SQLCommand createCommand() {
        return new OracleCommand();
    }
    
}
