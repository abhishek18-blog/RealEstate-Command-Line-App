public class Agent implements Person,Employee{
    private String name;
    private String EmployeeId;
    private double salary;
    private String licenseNUmber;

    @Override
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    public void setEmployeeId(String EmployeeId){
        this.EmployeeId=EmployeeId;

    }
    public String getEmployeeId(){
        return EmployeeId;

    }


    public void setSalary(double  salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }

    public void setlicenseNumber(String licenseNUmber){
        this.licenseNUmber=licenseNUmber;
    }
    public String getlicenseNumber(){
        return licenseNUmber;
    } 


}