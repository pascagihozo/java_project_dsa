
package com.gihozo.dsacoursework;

import com.gihozo.dsacoursework.dsapart2.Employee;
import com.gihozo.dsacoursework.dsapart2.Qualification;
import java.util.Date;

/**
 *
 * @author pascal
 */
public class EmployeeTest {
    public static void test() {
        Employee employee= new Employee();
        Qualification qualification= new Qualification("bachelor of Engineering","BA Diploma in Highschool", "Master of Computing", "phd In CS research", "Proffessor in Comp sciences");
        
        
        
        employee.setEmployeeID(123);
        employee.setFirstName("Savior");
        employee.setLastName("Mukiza");
        employee.setAddress("Kigali, Rwanda");
        employee.setDate(new Date());
        employee.setTelephoneNumber("54298765");
        employee.setEmail("p.gihozo@alustudent.com");
        employee.setHighestQualification(qualification);
        
        
        employee.display();
        
    }
    
}
