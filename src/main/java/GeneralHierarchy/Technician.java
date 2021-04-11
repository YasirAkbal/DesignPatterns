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
public class Technician extends Employee {
    String technicianJob;
    
    public Technician(String name,int age,int salary,String technicianJob)
    {
        super(name,age,salary);
        this.technicianJob = technicianJob;
    }
}
