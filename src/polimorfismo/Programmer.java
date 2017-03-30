/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiante
 */
public class Programmer extends Employee{

    public Programmer(String name) {
        super(name);
    }
    
    
    @Override
    
    public double calculateSalary(){
        return 5000;
    }

    
    
    
}
