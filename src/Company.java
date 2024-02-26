import java.util.ArrayList;
import java.util.Iterator;




public class Company {
  
    private String companyName;
    private ArrayList <Employee> staff;
    
     
//Constructors    
    public Company() {
        this.companyName = "Random Company Name";
        this.staff = new ArrayList<>();
    }

    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }

//Methods
      
      // Method for adding new employees to arrayList
      public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
      
      //Method to return number of employees in the arrayList
       public int getStaffNumber() {
        return staff.size();
    }
       
     public void listEmployees(int empNumValue) {
       
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > empNumValue) {
                System.out.println(employee.getName());
            }
        }   
     }
      
      // Manager Menu FINISH OPTIONS
      public void managerMenu(String username, String password) {
        if (username.equals("Gnomeo") && password.equals("smurf")) {
            // Manager logged in successfully
            System.out.println("Manager logged in successfully.");

        } else {
            // Manager login failed
            System.out.println("Incorrect username or password.");
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


