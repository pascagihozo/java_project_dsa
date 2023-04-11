
package com.gihozo.dsacoursework.dsapart5;
import com.gihozo.dsacoursework.EmployeeFileReaderTest;
import com.gihozo.dsacoursework.EmployeeListTest;
import com.gihozo.dsacoursework.EmployeeTest;
import com.gihozo.dsacoursework.TestEmployee;
import com.gihozo.dsacoursework.dsapart1.EmployeePart1;
import com.gihozo.dsacoursework.dsapart2.Employee;
import com.gihozo.dsacoursework.dsapart2.Qualification;
import com.gihozo.dsacoursework.part3.EmployeeList;
import com.gihozo.dsacoursework.part4.EmployeeFileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pascal
 */
public class AppRunner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmployeeList list=new EmployeeList();
        Employee employee= new Employee();
        Employee employee2= new Employee();
        EmployeePart1 emp1Test= new EmployeePart1();
        EmployeeFileReader fileReader=new EmployeeFileReader();
        
        employee.setAddress("Kiga");
        employee.setTelephoneNumber("54");
        employee.setQualifications("phd");
        employee2.setTelephoneNumber("45");
        list.addEmployee(employee);
        
        
        boolean stop=false;
        
        while(!stop){
            System.out.println("[*************************************]");
            System.out.println("EMPLOYEE MANAGMENT APP");
            System.out.println("[*************************************]");
            System.out.println("Make the following choices");
            System.out.println("1. Test Part1");
            System.out.println("2. Test Part2");
            System.out.println("3. Test Part3");
            System.out.println("4. Test Part4");
            System.out.println("[*************************************]");
            System.out.println("A. Insert Employee");
            System.out.println("B. Remove an Employee");
            System.out.println("C. Search an Employee by phone number");
            System.out.println("D. Seach an employee by last Name");
            System.out.println("E. Search an Employee by a specific qualification");
            System.out.println("X. Quit the program");
            System.out.println("Enter your choice:: ");
            String choices=scanner.nextLine();
            
            switch(choices){
                case "1":
                    TestEmployee.test();
                    break;
                case "2":
                    EmployeeTest.test();
                    break;
                case "3":
                    EmployeeListTest.test();
                    break;
                case "4":
                    EmployeeFileReaderTest.test();
                    fileReader.readFromFile("Our_employees.txt");
                    break;
                case "A":
                    System.out.println("Insert an employee");
                    try {
                    System.out.print("Enter first name: ");
                    String fname = scanner.next();
                    System.out.print("Enter lasty name: ");
                    String lname = scanner.next();
                    System.out.print("Enter employee id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter employee address");
                    String address= scanner.next();
                    System.out.print("Enter employee email: ");
                    String email = scanner.next();
                    System.out.println("Enter employee qualification: ");
                    String qualification= scanner.next();
                    System.out.println("Employee joining date: ");
                    String sDate=scanner.next();
                    Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate);
                    System.out.println("Employee telephone number: ");
                    String phone=scanner.next();
                    Employee employee1=new Employee(id,fname,lname,address,phone,email,date1,qualification);
                    list.addEmployee(employee1);
                    
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                   
                case "B":
                    System.out.print("Enter employees telephone number: ");
                    String tel = scanner.next();
                    list.removeEmployee(list.searchTelephoneNumber(tel));
                    list.display();
                    
                    break;
                    
                case "C":
                    System.out.println("Search an employee by phone number:");
                    String phone=scanner.next();
                    list.searchTelephoneNumber(phone).display();
                    
                case "D":
                    System.out.println("Search an Employee by last name");
                    String lastName= scanner.next();
                    list.searchLastName(lastName).display();
                    break;
                    
                case "E":
                    System.out.println("Seearch with qualification: ");
                    String qualification= scanner.next();
                    list.searchWithQualification(qualification).display();
//                    list.searchQualification(new Qualification()).forEach(System.out::println);
                    break;

                case "X":
                    stop=true;
                    
                    
                    

           }
        
        }
        
        
        
    }
    
}
