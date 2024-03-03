

public class EmployeeTest {
    
    
 public static void main(String[] args) {
    
  //Creating 3 employee objects
       Employee employee1 = new Employee ("Joe Bloggs", "jb@gmail.com");
       Employee employee2 = new Employee ("Ann Banana", "ab@gmail.com");
       Employee employee3 = new Employee ("Tom Thumb", "tt@gmail.com");
       
         
   //Delcaring array and storing employee objects
       Employee[] projectGroup = {employee1, employee2, employee3};
     
   // Print the value of variable nextEmpNum
       System.out.println("Value of nextEmpNum: " + Employee.getNextEmpNum());
     
   //Declaring test variable "m". 
      int m = 2;
     
   //Searching and displaying employees with an empNum greater than the variable m.   
     System.out.println("Employees with empNum above " + m + ":");
        for (Employee employee : projectGroup) {
           if (employee.getEmpNum() > m) {
              System.out.println(employee.getName());
              }
             }
           }  
 
  }

     
     
     
     
     
     
     

