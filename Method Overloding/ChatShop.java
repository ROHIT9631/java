import java.util.Arrays;
class ChatShop
{
static String name="Rk";
static String ownerName="";
static String chatnames[]={null,null,null,null,null,null};
static double ChatPrice[]={0.0,0.0,0.0,0.0,0.0,0.0};
static int index;
public static boolean createChatName(String chatName)
{
System.out.println("chatnamecreated start");
boolean isChatNameCreate=false;
if(chatName != null)
{
chatnames[index] = chatName;
index++;
isChatNameCreate = true;
}
else System.out.println("can't added");
System.out.println("chatnamecreated ended");
return isChatNameCreate;

}
// public static boolean addChatprice(double chatPrice){
	// boolean isAddedchatprice=false;
// if(chatPrice >0.0)
// {
// chatPrices[index] = chatPrice;
// index++;
// }
// else System.out.println("can't be Zero");
// return isAddedchatprice;
// }
// public static void getChatShop()
// {
	// System.out.println("The chat is Avaliable");
	// for(String chatName:chatnames){
		
                // System.out.println(chatName);

		
// }
// }
// public static void getChatprice()
// {
	// System.out.println("The chat is Avaliable");
	// for(String chatPrice:chatPrices){
		// // if (chatName != null) {
                // System.out.println(chatPrice);
	// // }
		
// }
//}
public static boolean deletchatName(String chatNametobedeleted)
   {
	System.out.println("delete chat name to started");
	boolean isChatnameDeleted=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<chatnames.length;oldIndex++)
	{
	if(chatnames[oldIndex]!=chatNametobedeleted)
	{
		chatnames[newIndex]=chatnames[oldIndex];
		newIndex++;
	}
	}
	chatnames=Arrays.copyOf(chatnames,newIndex);
	if(chatnames!=null)
	{
		isChatnameDeleted=true;
	}
	if(isChatnameDeleted==false)
	{
		System.out.println(chatNametobedeleted+"not found");
	}
	System.out.println("Deleted chat name to be Ended");
	return isChatnameDeleted;
   }
 }
