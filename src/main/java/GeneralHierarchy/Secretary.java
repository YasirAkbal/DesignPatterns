/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralHierarchy;

/**
 *
 * @author yasir
 */
public class Secretary extends Employee {
    String secretaryPhoneNumber;
    
    public Secretary(String name,int age,int salary,String secretaryPhoneNumber)
    {
        super(name,age,salary);
        this.secretaryPhoneNumber = secretaryPhoneNumber;
    }
}
