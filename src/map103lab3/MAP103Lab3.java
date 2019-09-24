/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MAP103Lab3 {
     /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Employee emArr[] = new Employee[3];
        
        emArr[0] = new Employee(1,"ROBERT", "DOWNEY", "03/07/1965", 54);
        emArr[1] = new Employee(32,"JENIT", "DARULA", "11/09/1986", 33);
        emArr[2] = new Employee(24,"WILL", "SMITH", "11/09/1983", 36);
        
        
        
        emArr[1].setEmployeeNumber(777);
        emArr[1].setFirstName("JENIT");
        emArr[1].setLastName("DARULA");
        
        
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            if(n<=emArr.length){
                System.out.println("Employee number     :" + emArr[n-1].getEmployeeNumber());
                System.out.println("Employee name       :" + emArr[n-1].getFirstName());
                System.out.println("Employee surname    :" + emArr[n-1].getLastName());
                System.out.println("Employee birth date :" + emArr[n-1].getBirthDate());
                System.out.println("Type 0 to quit!");
            }else{
                System.out.println("Wrong employee position!");
                System.out.println("Type 0 to quit!");
            }
            
            n = sc.nextInt();
        }
    }
}
