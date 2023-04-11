
package com.gihozo.dsacoursework.part4;

import com.gihozo.dsacoursework.part3.EmployeeList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author pascal
 */

//The following class allows the user to write and read user inputs
public class EmployeeFileReader {
    public void writeToFile(EmployeeList employeeList, String file){
    try {
 
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(employeeList);
            objectOut.close();
            System.out.println("You have written to a file successfully");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public EmployeeList readFromFile(String file){
        try {
 
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            Object obj = objectIn.readObject();
 
            System.out.println("Reading from the file perfomed successfully");
            objectIn.close();
            return (EmployeeList)obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
