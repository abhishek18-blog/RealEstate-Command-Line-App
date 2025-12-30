public class Villa extends  ResidentialProperty {


    //TAX=PRICE*TAXRATE
    //COMMISSSION FOR AGENT =SALES PRICE * COMMISSSION RATE
    //LEASE COST CALCULATION FOR COMMERICIAL PROPERTY  = MONTHLYRATE*LEASEDURATION MONTHS
    //TOTAL COST CALCULQATION IN TRANSDACTION: SALE PRICE + TAXES +ADDITIONAL FEES
    public String HasGarden;


    int GardenArea= 0;
    int perUnitRate =0;
    int MunicipalTaxrate =0;
    int GardenTax=0;
    
    public Villa(String Address,String area,String price,String yearBuilt,String NameOfRes,String HasGarden){
        super(Address, area, price, yearBuilt, NameOfRes,"","","YES",2);
        this.HasGarden=HasGarden;


    }

    public void displayVilla(){
        System.out.println("Address: "+Address+"Area: "+area+"Price: "+price+ "Year Built in: "+yearBuilt);
    }
    
    public void setGardenTax(int GardenArea, int perUnitRate, int MunicipalTaxrate ){
        
        this.GardenArea=GardenArea;
        this.perUnitRate=perUnitRate;
        this.MunicipalTaxrate=MunicipalTaxrate;
        
    }
    public int getGardenTax(){
        return  GardenTax=GardenArea*perUnitRate*MunicipalTaxrate;
    }


    
}
