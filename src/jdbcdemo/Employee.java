/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

/**
 *
 * @author User
 */
public class Employee {
    
     private double accountNumber = 0;
  private int  id  = 0;
  private String customerName = "";
  private String name  = "";
  private String place;
  private int salary = 0;
  
  
    public  Employee (String name, int id, String place,int salary ){
    
        this.name = name;
        this.id=id;
        this.place= place;
        this.salary = salary; 
    
    
}
    
    
    public String getname() {
    
    return name;
}
    
    public int salary(int salary){
       this.salary +=salary;
       
       return salary;
    }
    
}
