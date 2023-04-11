
package com.gihozo.dsacoursework;

import com.gihozo.dsacoursework.dsapart2.Employee;
import com.gihozo.dsacoursework.part3.EmployeeList;
import com.gihozo.dsacoursework.dsapart2.Qualification;

/**
 *
 * @author pascal
 */
public class EmployeeListTest {
    
    public static void test() {
        
        EmployeeList cdll=new EmployeeList();
        Employee employee=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        
        
        employee.setEmployeeID(12);
        employee.setFirstName("PascalG");
        employee.setLastName("GihozoP");
        employee.setAddress("Pamplemousses, Mauritius");
        employee.setTelephoneNumber("54299084");
        
        emp2.setFirstName("Dangote");
//      emp2.setHighestQualification(highestQualifica tion);
        
         
         
        emp3.setTelephoneNumber("5456544");
        
  
        
        cdll.addEmployee(employee);
        cdll.addEmployee(emp2);
        cdll.addEmployee(emp3);
        
        cdll.display();
//        cdll.removeEmployee(emp2);
//        System.out.println(cdll.searchTelephoneNumber("54299084"));
//        cdll.searchTelephoneNumber("54299084");
        cdll.display();
        
        
        
    }
    
}
