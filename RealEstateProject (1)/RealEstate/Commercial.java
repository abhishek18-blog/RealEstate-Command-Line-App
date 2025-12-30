public class Commercial extends Property{
    public String businessType;
    public String parkingSpaces;
    
    public int leaseDuration=0;
    public int MonthlyRate=0;
    public int TotalLeaseD=0;

    public Commercial(String Address,String area,String price,String yearBuilt,String businessType,String parkingSpaces){
        super(Address, area, price, yearBuilt);
        this.businessType=businessType;
        this.parkingSpaces=parkingSpaces;

    }

    void displayCommercial(){
        System.out.println("Adress: "+Address+"Area: "+area+"For business Type: "+businessType+"Parking space available (area in sqm): "+parkingSpaces);
    }

    public void setLeaseDcal(int leaseDuration,int MonthlyRate){
        this.leaseDuration=leaseDuration;
        this.MonthlyRate=MonthlyRate;
    }
    public int getLeaseDcal(){
        return  TotalLeaseD=MonthlyRate*leaseDuration;

        //LEASE COST CALCULATION FOR COMMERICIAL PROPERTY  = MONTHLYRATE*LEASEDURATION MONTHS
    }
}