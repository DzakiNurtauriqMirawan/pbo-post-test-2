/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warnets;

import java.util.Scanner;
import posttest2.customer;
import java.util.ArrayList;
import java.util.List;


public class warnet {
    private static final List<customer> customers = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add new customer");
            System.out.println("2. Customer's List");
            System.out.println("3. Update duration of use");
            System.out.println("4. Remove customers");
            System.out.println("5. exit");
            
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    System.out.print("Insert Id customer: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Insert customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the duration of the time usage: ");
                    int hours = scanner.nextInt();
                    customers.add(new customer(id, name, hours));
                    System.out.println(" Customer has been added ");
                    break;
                
                case 2:
                    System.out.println(" Customers List: ");
                    for (customer customer : customers) {
                        System.out.println("ID: " + customer.getId()+ ", Name: " + customer.getName()+ ", Duration: " + customer.getHours() + " Hours");
                    }
                    break;
                    
                    
                case 3:
                    System.out.println("Enter the Customer ID you want to update: ");
                    int updateId = scanner.nextInt();
                    for (customer customer : customers) {
                        if (customer.getId() == updateId) {
                            System.out.print("Enter the duration of the new user: ");
                            int newHours = scanner.nextInt();
                            customer.setHours(newHours);
                            System.out.println("The duration for which the user has been updated. ");
                            break;
                        }
                    }
                    break;
                
                case 4:
                    System.out.print("Enter the customer ID you want to delete: ");
                    final int deleteId = scanner.nextInt();
                    customers.removeIf(customer -> customer.getId()== deleteId);
                    System.out.println("The account has been deleted.");
                    break;
                    
                case 5:
                    System.out.println(" Shutdown ");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println(" the opsiont not invalid. ");
            }
        }
    }
    
}
    

