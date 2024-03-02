import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Company {
  
 //FIELDS
    
    private String companyName;
    private ArrayList <Employee> staff;
    
     
//CONSTRUCTORS 
    
    public Company() {
        this.companyName = "Random Company Name";
        this.staff = new ArrayList<>();
    }

    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }

//METHODS
      
      // Method for adding new employees to arrayList.
      public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
      
      //Method to return number of employees in the arrayList.
      public int getStaffNumber() {
        return staff.size();
    }
      
      //Method to list employees wih an employee number above a certain value, using an iterator.
      public void listEmployees(int empNumValue) {
       Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > empNumValue) {
                System.out.println(employee.getName());
            }
           }   
          }
       
      
       //Method for displaying all employees. For use in the Managers console menu.
       public void displayEmployees() {
        System.out.println("Employees:");
        for (Employee employee : staff) {
            System.out.println(employee.getName());
        }
    }
       
       // Manager Login and Menu
       public void managerMenu(String username, String password) {
        if (username.equals("Gnomeo") && password.equals("smurf")) {
           
            // Speak, friend, and enter.
            System.out.println("Login successful. Welcome!");

            // Display menu options
            Scanner scanner = new Scanner(System.in);
            int option;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. View Employees");
                System.out.println("2. Remove Employee");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        // View employees
                        displayEmployees();
                        break;
                    case 2:
                        // Remove employee
                        System.out.print("\nEnter the empNum of the employee to remove: ");
                        int empNumToRemove = scanner.nextInt();
                        removeStaff(empNumToRemove); // Call method to remove employee
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } while (option != 3);
            scanner.close();
        
        } else {
            // Manager login failed
            System.out.println("Access Denied!");
        }
    }
    

     
       //(Challenge) Method for removing employees from the staff array list.
       //Invoked in Manager's console so he can remove employees.
       public void removeStaff(int empNum) {
        
         //Loop that iterates through the array list 
        for (int i = 0; i < staff.size(); i++) {
            Employee employee = staff.get(i);
            
              // Checking if employee's empNum matches the given empNum
            if (employee.getEmpNum() == empNum) {
                
                // Removing the employee from the ArrayList
                staff.remove(i);
               
                System.out.println("Employee with number " + empNum + " has been removed.");
                return;
            }
        }
      }


//Getters and Setters for comapny name
      public String getCompanyName() {
        return companyName;
    }

       public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


}


