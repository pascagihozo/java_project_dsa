
package com.gihozo.dsacoursework.dsapart1;

import java.io.Serializable;

/**
 *
 * @author pascal
 */
public class EmployeePart1 implements IEmpView, Serializable {
    private String name;
    private int age;

    public EmployeePart1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public EmployeePart1(){
    }
    
    

    @Override
    public void display() {
        System.out.println("Employee name: "+name+ " Employee age :" + age);
        
        }
    
    
    
}
