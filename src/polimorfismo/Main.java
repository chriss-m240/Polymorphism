/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    
    public static int menu() {
        int option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add employee"
                            + " 2. List"
                            + " 3. Paysheet"
                            + " 4. Programmer´s paysheet"
                            + " 5. Get out");
        option = sc.nextInt();
        return option;
    }
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        Company Google = new Company();
        Scanner sc = new Scanner(System.in);
        do {
            option = menu();
            switch (option) {
                case 1 : 
                    System.out.println("Enter the employee´s name: ");
                    String name = sc.next();
                    int type = 1;
                    do {
                        if (type != 1 && type != 2 ) {
                            System.out.println("Invalid input, try again");
                        }
                    System.out.println("Employee´s type: 1. Programmer, 2. Architect :");
                    type = sc.nextInt();
                    } while (type != 1 && type != 2);
                    
                    Employee employee = null;
                    
                    if (type == 1) {
                        employee = new Programmer(name);
                    } else if (type == 2) {
                        employee = new Architect(name);
                    }
                    Google.addEmployee(employee);
                    break;
                case 2:
                    ArrayList<Employee> employees = Google.listEmployees();
                    for (int i = 0; i < employees.size(); i++) {
                        Employee e = employees.get(i);
                        if ( e  instanceof Programmer) {
                            System.out.println( e.getName() + ": Programmer");
                        } else {
                            System.out.println( e.getName() + ": Architect");
                        }
                    }
                    break;
                case 3:
                    System.out.println("This is the paysheet of your company");
                    System.out.println(Google.calculatePaysheet());
                    break;
                case 4:
                    System.out.println("This is the programmers´s paysheet of your company");
                    System.out.println(Google.calculatePaysheetProgrammers());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input, try again");
            }
        } while (option != 5);
        
        
        Employee Cristian = new Employee("Cristian");
        Google.addEmployee(Cristian);
        // TODO code application logic here
    }
    
}
