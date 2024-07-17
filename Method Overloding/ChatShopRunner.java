class ChatShopRunner
{
public static void main(String[]args)
{

boolean isAdded = ChatShop.createChatName("bhel puri");
System.out.println("is chat Name  "+isAdded);
// boolean priceAdded = ChatShop.addChatprice(40.00);
// System.out.println("is chat Price  "+priceAdded);
 isAdded = ChatShop.createChatName("Sev puri");
System.out.println("is chat Name "+isAdded);
// priceAdded = ChatShop.addChatprice(40.00);
// System.out.println("is chat Price  "+priceAdded);
 isAdded = ChatShop.createChatName("pani puri");
System.out.println("is chat Name  "+isAdded);
// priceAdded = ChatShop.addChatprice(30.00);
// System.out.println("is chat Price  "+priceAdded);
isAdded = ChatShop.createChatName("Allo puri");
System.out.println("is chat Name "+isAdded);
// priceAdded = ChatShop.addChatprice(140.00);
// System.out.println("is chat Price  "+priceAdded);
isAdded = ChatShop.createChatName("null");
System.out.println("is chat Name  "+isAdded);
// priceAdded = ChatShop.addChatprice(50.00);
// System.out.println("is chat Price  "+priceAdded);
 isAdded = ChatShop.createChatName("dahi puri");
System.out.println("is chat Name  "+isAdded);
// priceAdded = ChatShop.addChatprice(60.00);
// System.out.println("is chat Price  "+priceAdded);
//ChatShop.getChatShop();
//ChatShop.getChatprice();
ChatShop.deletchatName("Allo puri");
//ChatShop.getChatShop();
}
}