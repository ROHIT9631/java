class Swiggy{
public static double takeOrder(String foodName){

if(foodName == "pizza")
return 99.00;

if(foodName == "burger")
return 120.00;
else
System.out.println("not found");
return  0.0;
}
public static double takeOrder(String foodName,int quantity){
double price = 0.0;
if(foodName == "pizza"){
price = 99.00 * quantity;
return price;
}
return price;
}
}