/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab3;

/**
 *
 * @author USER
 */
public class Employee extends Person{
    private long employeeNumber;

    public Employee(long employeeNumber, String firstName, String lastName, String birthDate, int age) {
        this.employeeNumber = employeeNumber;
        super.setFirstName(firstName); 
        super.setLastName(lastName);
        super.setBirthDate(birthDate);
        super.setAge(age);
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
    
}
