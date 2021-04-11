/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralHierarchy;

import java.util.ArrayList;

/**
 *
 * @author yasir
 */
public class Manager extends Employee {
    int managerRoomNumber;
    ArrayList<Employee> altlari = new ArrayList<>();
    
    public Manager(String name,int age,int salary,int managerRoomNumber)
    {
        super(name,age,salary);
        this.managerRoomNumber = managerRoomNumber;
    }
    
    public void addEmployee(Employee e)
    {
        altlari.add(e);
        e.manager = this;
    }
}
