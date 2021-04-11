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
public class OracleCommand extends SQLCommand{

    @Override
    public void executeCommand(String query) {
        System.out.println(query + ", sorgusu Oracle'da calistirildi");
    }
    
}
