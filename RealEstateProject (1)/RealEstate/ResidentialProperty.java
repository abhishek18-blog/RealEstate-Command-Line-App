public class ResidentialProperty extends  Property{
    
public String NameOfRes;
public String NoofBedrooms;
public String NoofBathrooms;
public String HasGarage;
public int floorLevel;

//Mortgage Calculation
public int MortageCal=0;
public int Price=0;
public int monthlyRateOfInt=0;
public int n=0;//no. of payment

public ResidentialProperty(String Address,String area,String price,String yearBuilt,
    String NameOfRes,String NoofBedrooms,String NoofBathroms,String HasGarage,int floorLevel){
        super(Address, area, price, yearBuilt);
        this.NameOfRes=NameOfRes;
        this.NoofBedrooms=NoofBedrooms;
        this.NoofBathrooms=NoofBathroms;
        this.HasGarage=HasGarage;
        this.floorLevel=floorLevel;
    }    

    public void setcalculateMonthlyMortage(int Price,int monthlyRateOfInt,int n ){
     

        this.monthlyRateOfInt=monthlyRateOfInt;
        this.Price=Price;
        this.n=n;

    }


    public int getcalculateMonthlyMortage(){
        return MortageCal=Price*((monthlyRateOfInt*(1+monthlyRateOfInt)^n)/(1+monthlyRateOfInt)^n-1);
    }


}
