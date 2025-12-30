public class Property{
    private String propertyID;
    public String Address;
    public String area;
    public String price;
    private  String ownerID;
    public String yearBuilt;

    //Caslculation of Tax
    int propertyPrice = 0;
    int taxrate =0;
    int tax =0;
    public Property(String Address,String area,String price,String yearBuilt){

        this.Address=Address;
        this.area=area;
        this.price=price;
        this.yearBuilt=yearBuilt;

    }

    public void setpropertyID(String propertyID){
        this.propertyID=propertyID;
        
    }
    public String getpropertyID(){
        return propertyID;
    }

    public void ownerID(String ownerID){
        this.ownerID=ownerID;
        
    }
    public String ownerID(){
        return ownerID;
    }

    public void getPrice() {
        System.out.println("Price of this property "+propertyID+"is " +price);
    }

    void setCalculateTax(int  propertyPrice,int  taxrate){
        
        this.propertyPrice=propertyPrice;
        this.taxrate=taxrate;

    }

    public int getCalculateTax(){
        return tax = (propertyPrice * taxrate);
    }
    
    public void displayProperty(){
        System.out.println("Address: "+Address+"\nArea: "+area+"\nprice: "+price+"\nYear Built : "+yearBuilt);
    }

}