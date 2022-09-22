public class Petrol{


private String stationLocation;
private String petrolType;
private int quantity;
private double purchaseInLiter;
private double pricePerLiter;
private double percentageDiscount;
   
 
 
	public Petrol(String stationlocation, String petroltype , int quantity, double purchaseinliter, double priceperliter ,double percentagediscount){
     
		this.stationLocation = stationlocation;
  		this.petrolType = petroltype;
              this.quantity = quantity;
		this.purchaseInLiter = purchaseinliter;
              this.pricePerLiter = priceperliter;
              this.percentageDiscount = percentagediscount;
   	}
    	
    		
        

	public void setStationLocation(String stationLocation){
       
		this.stationLocation = stationLocation;
	}      
              

	public String getStationLocation(){
     
		return stationLocation;
	}
       
 
	public void setPetrolType(String petroltype){
            this.petrolType =petroltype;
	}       
            
	public String getPetrolType(){

            return petrolType;
	} 
	
	public void setQuantity(int quantity){

             this.quantity = quantity;
	}
	public int getQuantity(){

               return quantity ;
	}
	public void setPurchaseInLiter(double purchaseinliter){

		this.purchaseInLiter = purchaseinliter;
	}
	public double getPurchaseInLiter(){

		return purchaseInLiter;
	}
	public void setPricePerLiter(double priceperliter){

		this.pricePerLiter = priceperliter;
	}
	
	public double getPricePerLiter(){

		return pricePerLiter;
	}

	public void setPercentage(double percentagediscount){
		
		this.percentageDiscount = percentagediscount;
	}

	public double getPercentageDiscount(){

		return percentageDiscount;
	}
       
	 public double getPurchaseAmount(){
	double PurchaseAmount = (quantity * pricePerLiter ) - percentageDiscount/100;
			return PurchaseAmount;
	}	 

}

      





              
