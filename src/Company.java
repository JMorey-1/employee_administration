import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class Company {
  
//FIELDS
    
    private String companyName;
    private ArrayList <Employee> staff;
    private Set<Employee> staffSet; //Bonus Challenge HashSet
     
//CONSTRUCTORS 
    
    //Default Constructor
    public Company() {
        this.companyName = "Random Company Name";
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>(); //Bonus Challenge HashSet
    }

    //Overloaded Constructor that takes name as a parameter
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>(); //Bonus Challenge HashSet
    }

//GETTERS AND SETTERS
      
       public String getCompanyName() {
        return companyName;
    }

       public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }    
    
// MANAGER LOGIN AND MENU
    
       public void managerMenu(String username, String password) {
        if (username.equals("Gnomeo") && password.equals("smurf")) {
           
            // Speak, friend, and enter.
            System.out.println("Login successful. Welcome!");

            // Display menu options
            Scanner scanner = new Scanner(System.in);
            
            int option;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Display current Staff");
                System.out.println("2. Add new staff");
                System.out.println("3. Remove staff");
                System.out.println("4. Exit program");
                System.out.print(" Please enter your choice: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        // View current staff
                        displayEmployees();
                        break;
                    
                    case 2:
                        // Add new staff
                        addNewEmployee(scanner);
                        break;
                    
                    case 3:
                        // Remove employee
                        System.out.print("\nEnter the empNum of the employee you would like to remove: ");
                        int empNumToRemove = scanner.nextInt();
                        removeStaff(empNumToRemove); // Invoking method to remove employee
                        break;
                    
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    
                    default:
                        System.out.println("Invalid selection. Please enter a valid option.");
                }
            } while (option != 4);
            scanner.close();
        
        } else {
            // Manager login failed
            System.out.println("Access Denied!");
        }
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
          
       //Method for displaying all employees. For use in the Manager's console menu.
       public void displayEmployees() {
        System.out.println("Employees:");
         
         for (Employee employee : staff) {
            System.out.println(employee.getName());
          }
         }
       
       //Method for the manager to manually add employees. For use in the Manager's console menu.
        public void addNewEmployee(Scanner scanner) {
          System.out.print("\nEnter employee name: ");
            String name = scanner.nextLine();
       
          System.out.print("Enter employee email: ");
           String email = scanner.nextLine();
       
          Employee newEmployee = new Employee(name, email);
             addNewStaff(newEmployee);
               System.out.println("New employee added successfully.");
           }
       
        
       /*(Challenge) Method for removing employees from the staff array list.
         Called in Manager's console so he can manually remove employees.*/
       public void removeStaff(int empNum) {
        
         //Looping through array list 
        for (int i = 0; i < staff.size(); i++) {
            Employee employee = staff.get(i);
            
              // Checking if employee's empNum matches the given empNum
            if (employee.getEmpNum() == empNum) {
                
                // Removing employee from the ArrayList
                staff.remove(i);
               
                System.out.println("Employee with number " + empNum + " has been removed.");
                return;
              }
            }
          }




//Bonus Challenge HashSet
       
       //HashSet for employee objects that requires unique empNums.
       //The HashSet is initialised in fields section of this class (line 15).
       public void manageHashSet(Employee employee) {
       
        // Checking if the empNum already exists in the HashSet
        boolean duplicate = false;
        for (Employee e : staffSet) {
            if (e.getEmpNum() == employee.getEmpNum()) {
                duplicate = true;
                break;
            }
        }
        //If empNum doesn't exist, add the employee
        if (!duplicate) {
            staffSet.add(employee);
            System.out.println("Employee added: " + employee);
        } else {
            System.out.println("Duplicate empNum found. Employee not added: " + employee);
        }
    }
       
}


