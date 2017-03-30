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
public class Architect extends Employee{

    public Architect(String name) {
        super(name);
    }
    
    @Override
    public double calculateSalary(){
        return 4500;
    }
    
}
