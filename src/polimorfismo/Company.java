/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Company {
    
     private ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }  

    public Company() {
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    
    public double calculatePaysheet(){
        double total = 0;
        // Polimorfismo de asigmacion
        for (Employee e : employees){
            // Ligadura tardia
            total += e.calculateSalary();
        }
        return total;
    }
    public double calculatePaysheetProgrammers(){
        double total = 0;
        for (Employee e : employees) {
            if (e instanceof Programmer) {
                total+=e.calculateSalary();
            }
        }
        return total;
    }
    
    public ArrayList<Employee> listEmployees(){
        ArrayList<Employee> paysheet = new ArrayList<>();
        for (Employee e : employees){
            paysheet.add(e);
        }
        return paysheet;
    }
}
