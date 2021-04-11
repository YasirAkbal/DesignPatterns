/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.Scanner;

/**
 *
 * @author yasir
 */
public class AbstractFactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SQLFactory factory;
        SQLConnection sqlConnection;
        SQLCommand sqlCommand;
        int secim=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Veritabani seç:");
        System.out.println("1 -> SQL Server");
        System.out.println("2 -> Oracle");
        secim = scanner.nextInt();
        switch(secim)
        {
            case 1:
                factory = new SQLServerFactory();
                break;
            case 2:
                factory = new OracleFactory();
                break;
            default:
                factory = new SQLServerFactory();
                break;
        }
        
        sqlConnection = factory.createConnection();
        sqlConnection.connect("test", "123");
        
        sqlCommand = factory.createCommand();
        sqlCommand.executeCommand("select * from customers");
        
    }
    
}
