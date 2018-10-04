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
    
     double accountNumber = 0;
 int  id  = 0;
  String customerName = "";
   String name  = "";
   String place;
   String email;
   String workposition="";
   int salary = 0;
  
  
    public  Employee (int id, String name, String place,int salary, String workposition ){
      this.id =id;
        this.name = name;
       
        this.place= place;
        this.salary = salary; 
        
        this.workposition= workposition;
    
    
}
    
    
    public String getname() {
    
    return name;
}
    
    public int salary(int salary){
       this.salary +=salary;
       
       return salary;
    }
    
}
