



public class Employee {
    
//Instance fields
    private String name;
    private String email;
    private int empNum;
    
//Static fields
    private static int nextEmpNum = 1;


//Constructors
    
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

//Methods
    
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getEmpNum(){
        return empNum;
    }
    
    public static int getNextEmpNum(){
        return nextEmpNum;
    }

    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
          
        } else {
            System.out.println("Please enter valid email!");
        }
    }


}




