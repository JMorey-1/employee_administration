



public class Employee {
   
//FIELDS    
    
    
//Instance fields
    private String name;
    private String email;
    private int empNum;
 
 //Manager Fields 
   private String managerUsername;
   private String managerPassword;
    
//Static fields
   private static int nextEmpNum = 1;

   

//CONSTRUCTORS
    
    
    //Default value constructor
    public Employee() {
        this.name = "John Doe";
        this.email = "johndoe@example.com";
        this.empNum = nextEmpNum++;        
    } 
    
    //Parameter constructor
    public Employee(String name, String email){
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
        
    }
    
//GETTERS AND SETTERS

    
  // Getter and setter for manager username    
     public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    // Getter and setter for manager password
      public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    
//METHODS
    
    //Accessor methods for returning Name, Email and EmpNum.
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getEmpNum(){
        return empNum;
    }
    
    //Method for returning current value of nextEmpNum
    public static int getNextEmpNum(){
        return nextEmpNum;
    }

    //Method to set email field to a new value, ensure length is greater than 3 and also call my email validation method.
    public void setEmail(String email) {
      if (email.length() > 3 && isValidEmail(email)) {
        this.email = email;
      } else {
        throw new IllegalArgumentException("Invalid email address: " + email);
       }
      }
    
    // Regex for email validation, used in my setEmail method.
    private boolean isValidEmail(String email) {
      String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
       return email.matches(emailRegex);
       }
   
    }




