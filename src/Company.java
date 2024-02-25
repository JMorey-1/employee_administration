import java.util.ArrayList;




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
      public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
      
       public int getStaffNumber() {
        return staff.size();
    }
    
    
}


