public class Food {
  private String name ;
  private int price ;

public Food(String name){
 this.name = name; 
}
public Food(int price){
this.price = price;
}


public void setname(String name){
  this.name = name ;
}
public void setprice(int price){
this.price = price;
}
  
public String getname ()  {
   return name ;
}
public int getprice() {
return price ; 
   }
}