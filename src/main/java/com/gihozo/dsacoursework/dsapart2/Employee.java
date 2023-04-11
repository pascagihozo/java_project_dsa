
package com.gihozo.dsacoursework.dsapart2;

import com.gihozo.dsacoursework.dsapart1.IEmpView;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pascal
 */
public class Employee implements IEmpView, Serializable{
    private int employeeID;
    private String firstName;
    private String lastName;
    private String address;
    private String telephoneNumber;
    private String email;
    private Date date;
    private Qualification highestQualification;

    public Employee(int employeeID, String firstName, String lastName, String address, String telephoneNumber, String email, Date date, String qualifications) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.date = date;
        this.highestQualification = highestQualification;
    }
    private  String qualifications;
    public Employee(){
        
    
    }

    public String getQualifications() {
        return qualifications;
    }
    
    

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate() {
        return date;
    }

    public Qualification getHighestQualification() {
        return highestQualification;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    

    public void setHighestQualification(Qualification highestQualification) {
        this.highestQualification = highestQualification;
    }

    @Override
    public void display() {
        System.out.println("id : " + employeeID + " First Name: "+firstName+" Last Name: "+lastName+" Address: "+address+ " Telephone Number: "+telephoneNumber+" E-mail: "+email+" Date Joined"+date+ " Highest Qualification: "+ highestQualification);
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", telephoneNumber=" + telephoneNumber + ", email=" + email + ", date=" + date + ", highestQualification=" + highestQualification + '}';
    }

    
    
    

    
    
    
    
}
