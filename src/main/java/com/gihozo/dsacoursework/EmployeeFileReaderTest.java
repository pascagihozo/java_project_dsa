
package com.gihozo.dsacoursework;

import com.gihozo.dsacoursework.dsapart2.Employee;
import com.gihozo.dsacoursework.part3.EmployeeList;
import com.gihozo.dsacoursework.part4.EmployeeFileReader;
import java.util.Date;


/**
 *
 * @author pascal
 */
public class EmployeeFileReaderTest {
    public static void test() {
        EmployeeList list=new EmployeeList();
        Employee employee=new Employee();
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();
        Employee employee6=new Employee();
        Employee employee7=new Employee();
        Employee employee8=new Employee();
        Employee employee9=new Employee();
        
        EmployeeFileReader reader= new EmployeeFileReader();
        
        
        
        employee.setEmployeeID(12);
        employee.setTelephoneNumber("435432");
        employee.setFirstName("Francis");
        employee.setAddress("Arusha, Tanzania");
        employee.setEmail("francis@kiksgames.com");
        
        employee2.setEmployeeID(12);
        employee2.setTelephoneNumber("435432");
        employee2.setFirstName("Francis");
        employee2.setAddress("Arusha, Tanzania");
        employee2.setEmail("francis@kiksgames.com");
        
        employee3.setEmployeeID(12);
        employee3.setTelephoneNumber("435432");
        employee3.setFirstName("Francis");
        employee3.setAddress("Arusha, Tanzania");
        employee3.setEmail("francis@kiksgames.com");
        
        employee4.setEmployeeID(12);
        employee4.setTelephoneNumber("435432");
        employee4.setFirstName("Francis");
        employee4.setAddress("Arusha, Tanzania");
        employee4.setEmail("francis@kiksgames.com");
        
        employee5.setEmployeeID(12);
        employee5.setTelephoneNumber("435432");
        employee5.setFirstName("Francis");
        employee5.setAddress("Arusha, Tanzania");
        employee5.setEmail("francis@kiksgames.com");
        
        employee6.setEmployeeID(12);
        employee6.setTelephoneNumber("435432");
        employee6.setFirstName("Francis");
        employee6.setAddress("Arusha, Tanzania");
        employee6.setEmail("francis@kiksgames.com");
        
        employee7.setEmployeeID(12);
        employee7.setTelephoneNumber("435432");
        employee7.setFirstName("Francis");
        employee7.setAddress("Arusha, Tanzania");
        employee7.setEmail("francis@kiksgames.com");
        
        employee8.setEmployeeID(12);
        employee8.setTelephoneNumber("435432");
        employee8.setFirstName("Francis");
        employee8.setAddress("Arusha, Tanzania");
        employee8.setEmail("francis@kiksgames.com");
        
        employee9.setEmployeeID(12);
        employee9.setTelephoneNumber("435432");
        employee9.setFirstName("Francis");
        employee9.setAddress("Arusha, Tanzania");
        employee9.setEmail("francis@kiksgames.com");
        
        employee1.setEmployeeID(12);
        employee1.setTelephoneNumber("435432");
        employee1.setFirstName("Francis");
        employee1.setAddress("Arusha, Tanzania");
        employee1.setEmail("francis@kiksgames.com");
        
        
        
        
        
        list.addEmployee(employee);employee1.setEmployeeID(12);
        employee1.setTelephoneNumber("435432");
        employee1.setFirstName("Francis");
        employee1.setAddress("Arusha, Tanzania");
        employee1.setEmail("francis@kiksgames.com");
        reader.writeToFile(list, "Our_Employees.txt");
        
        reader.readFromFile("Our_Employees.txt");
        

    }
    
    
    
}
