class SwiggyRunner{
public static void main(String args[]){
double foodPrice = Swiggy.takeOrder("pizza");
System.out.println("The pizza price is  "+foodPrice);

double foodPrice1 = Swiggy.takeOrder("burger");
System.out.println("The burger price is "+foodPrice1);

double foodPriceQuantity = Swiggy.takeOrder("pizza",3);
System.out.println("The pizza with 3 quantity price is "+foodPriceQuantity);
}
         
}