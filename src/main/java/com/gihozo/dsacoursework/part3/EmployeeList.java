
package com.gihozo.dsacoursework.part3;

import com.gihozo.dsacoursework.dsapart1.IEmpView;
import com.gihozo.dsacoursework.dsapart2.Employee;
import com.gihozo.dsacoursework.dsapart2.Qualification;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pascal
 */
public class EmployeeList implements IEmpView, Serializable {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    @Override
    public void display() {
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node now=head;
//            for (int i = 0; i < size; i++){
//                System.out.print("Dispplay employee here");
//                System.out.println(now.data);
//                if(now==head)
//                    break;
//                now=now.next;
//
//                
//                
//              
//            }
            while(now!=null){
                System.out.println(now.data);
                if(now.next==head)break;
                now=now.next;
                
            }
         
        }
    }
    
    
    public class Node implements Serializable {
        private Employee data = null;
        private Node prev = null;
        private Node next = null;
        
        public Node(Employee data){
            this.data = data;
        }
        public Node(){}

        public Employee getData() {
            return data;
        }

        public Node getPrev() {
            return prev;
        }

        public Node getNext() {
            return next;
        }

        public void setData(Employee data) {
            this.data = data;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
        
        
    }
    
    
    public void addEmployee(Employee data){
        Node newEmployee=new Node(data);
           
        if(head==null){
        head=newEmployee;
        tail=head;
            System.out.println("The list has something");
            size++;
        }
        else{
        newEmployee.next=head;
        newEmployee.prev=tail;
        tail.next=newEmployee;
        head.prev=newEmployee;
        head=newEmployee;

        size++;
           
        }
        System.out.println(size);
    
    }
    
    public void removeEmployee(Employee data){
        Node current=head;
        if (head==null){
            System.out.println("The llist is empty no need for deletion");
        
        }
        else{
        while(current!=null){
            if(current.data.equals(data)){
                current.prev.next=current.next;
                current.next.prev=current.prev;
                
                System.out.println("The data is deleted: " +current.data);
                size--;
                
                if(current.next == this.head) 
                    break;
            }
            
            current=current.next;
            }  
        }
       
    }
    
    public Employee searchTelephoneNumber(String telephoneNumber){
        
        if(head==null){
            System.out.println("The list is empty no need to search phone number");
        }
        else{
            Node current=head;
            while(current!=null){
                if(current.data.getTelephoneNumber().equals(telephoneNumber)){
                    return current.data;
                }
                System.out.println("Employee with tel number: ");
                if (current.next == head)
                    break;
                
                current = current.next;
            
            }
        
        }
       return null;
    }
    
     public Employee searchLastName(String lastName){
        
        if(head==null){
            System.out.println("The list is empty ");
        }
        else{
            Node current=head;
            while(current!=null){
                if(current.data.getLastName().equals(lastName)){
                    return current.data;
                }
                
                if (current.next == head)
                    break;
                
                current = current.next;
            
            }
        
        }
       return null;
    }
     
     public Employee searchWithQualification(String qualifications){
        
        if(head==null){
            System.out.println("The list is empty ");
        }
        else{
            Node current=head;
            while(current!=null){
                if(current.data.getQualifications().equals(qualifications)){
                    return current.data;
                }
                
                if (current.next == head)
                    break;
                
                current = current.next;
            
            }
        
        }
       return null;
    }
     
     public List<Employee> searchQualification(Qualification qualification){
        List<Employee> listEmployees = new ArrayList<>();
        if(head==null){
            System.out.println("The list is empty ");
        }
        else{
            Node current=head;
            while(current!=null){
                if(current.data.getHighestQualification().equals(qualification)){
                    listEmployees.add(current.data);
//                    listEmployees.addAll(listEmployees);
                }
                
                if (current.next == head)
                    break;
                
                current = current.next;
            
            }
        
        }
       return listEmployees;
    }
   
  
    }



    
     
    

