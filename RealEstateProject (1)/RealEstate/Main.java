
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//<----------------------------Property here---------------------------------->
     
        Property p1= new Property("Cortalim", "Margo", "1.8Cr", "2015");
        
        Scanner sc1 = new Scanner(System.in);



//<----------------------------Residential Property here------------------------>
        ResidentialProperty rp1=new ResidentialProperty("Hno 55/11 ", "Conoca", "2.5Cr",
         "2015", "KamakshiKutir", "2", "2", "yes", 2);
        Scanner sc2 = new Scanner(System.in);
        
       



//<----------------------------Villa extends ResidentialProperty----------------->

        Villa v1=new Villa("Nagali Hills Colony\n", "Durgavado\n", "1.2Cr\n", "2000\n", "HillTop View\n", "\n");
        Scanner sc3=new Scanner(System.in);
    
//<---------------------------Commercial Property----------------->
       // System.out.println("<---------------------------Commercial Property----------------->");
        Commercial c1=new Commercial("St. joseph Colony\n ", "Velha Goa \n", "1.5Cr \n", "2008 \n", "Logistics and Cargo \n", "60 sqm ");
        

        Scanner sc4=new Scanner(System.in);

 

//<---------------------------Agent----------------->

        Agent a1 = new Agent();

        a1.setName("Ramesh KUmar Singh");
        a1.setEmployeeId("RD-101");
        a1.setlicenseNumber("L-87391");
        a1.setSalary(90000);

     



        Scanner sc5=new Scanner(System.in);
        System.out.println("<----------------Hello welcome to Real Estate APP--------------->\n");
        System.out.println("What would you like to search today?\n Choose from options below\n");
  
        while(true){
        System.out.println("1.Display Property \n2.Calculate Property Tax \n3.Villa Details \n4.Calculate Garden Tax of Villa \n5.Commericial property Details \n6.Calculate Total lease duration \n7.Agent details \n8.Monthly Mortgage Calculation for Villa \n9.Exit");
        int opt = sc5.nextInt();
        sc5.nextLine();
        switch (opt) {
            case 1:
                System.out.println("Details of Property....\n");
                p1.displayProperty();  
                break;
            
            case 2:
                System.out.println("Calculating tax....\n");


                System.out.println("Enter TAX rate :");
                int taxRate=sc1.nextInt();

                System.out.println("Enter propertyPrice: ");
                int propertyPrice= sc1.nextInt();

                //Tax Calculation
                p1.setCalculateTax(propertyPrice, taxRate);//this updates the object
                System.out.println("\nThe Tax calculation is: "+p1.getCalculateTax());
                break;
                
            case 3:
                System.out.println(".......Villa Detail....\n");
                v1.displayVilla();
                break;
            
            case 4:
                System.out.print("\nCalculating garden tax of Villa....\n");
                
                System.out.println("Calculation of Garden TaxRate: ");
                System.out.println("Enter Garden Area in sqm: ");
                int GardenArea=sc3.nextInt();
                
                System.out.println("Enter per Unit Rate Price");
                int perUnitRate=sc3.nextInt();

                System.out.println("Enter MunicipalTaxRATE: ");
                int MunicipalTaxrate=sc3.nextInt();

                v1.setGardenTax(GardenArea, perUnitRate, MunicipalTaxrate);
                System.out.println("\nGarden Tax calculated will be : "+v1.getGardenTax());
                break;

            case 5:
                System.out.println("\nDisplaying Commercial property details.....\n");
                c1.displayCommercial();
                break;
            case 6:
                System.out.println("Calculating Total lease duration");

                System.out.println("Calculate Total Lease Duration Cost:   \n");
                
                System.out.println("Enter MonthlyRate: ");
                int MonthlyRate=sc4.nextInt();

                System.out.println("Enter leaseDuration in years: ");
                int leaseDuration=sc4.nextInt();

                c1.setLeaseDcal(leaseDuration, MonthlyRate);

                System.out.println("\nThe total Lease Duration cost is Rs "+ c1.getLeaseDcal());
                break;
            case 7:
                System.out.println("Agent Details....\n");
                System.out.println("The name of agent: "+a1.getName());
                System.out.println("Verified Employee Id : "+a1.getEmployeeId());
                System.out.println("License Holder's License number: "+a1.getlicenseNumber());
                System.out.println("Salary of "+a1.getName()+"is "+a1.getSalary());
                break;
            
            case 8:
                System.out.println("Monthly Mortgage Calculation");
                System.out.println("Enter propertyPrice: ");
                int Price=sc2.nextInt();

                System.out.println("\nEnter monthly Rate of Interest: ");
                int monthlyRateOfInt=sc2.nextInt();

                System.out.println("\nEnter No. of payments (loan terms in month): ");
                int n=sc2.nextInt();

                rp1.setcalculateMonthlyMortage(Price, monthlyRateOfInt, n);

                System.out.println("\nCalculation of Monthly Mortgage: "+rp1.getcalculateMonthlyMortage());
                break;

         
            case 9:
                System.out.println("Exiting.....");
                

                sc1.close();
                sc2.close();
                sc3.close();
                sc4.close();
                sc5.close();

                return;
        
            default:
                System.out.println("Invalid INPUT");



        }

        
     

    }
      
    
}}
