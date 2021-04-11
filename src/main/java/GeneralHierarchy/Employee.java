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
public class Employee {
    String name;
    int age;
    int salary;
    Employee manager;
    
    public Employee(String name,int age,int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public Employee(String name,int age,int salary,Employee manager)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.manager = manager;
    }
}
