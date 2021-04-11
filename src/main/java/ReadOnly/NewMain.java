/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadOnly;

/**
 *
 * @author yasir
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPersonReadOnly i;
        Person yasir = new Person("Ahmet Yasir","Akbal");
        i = yasir;
        System.out.println(i.getName());
    }
    
}
