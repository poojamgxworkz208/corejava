class ChatCentre{
String centreName;
int centreId;
String location;
String ownerName;
boolean isOpen;

String items[]={"Pani Puri","Kachori","Samosa","Pav Bhaji","Masala Puri"};;

public ChatCentre(){
this("Sai Chats",2, "near KLE", "Ranga",true);
System.out.println("ChatCentre object is created");

}

public ChatCentre(String centreName,int centreId,String location,String ownerName,boolean isOpen){
this.centreName=centreName;
this.location=location;
this.items=items;
this.centreId=centreId;
this.ownerName=ownerName;
this.isOpen=isOpen;
}

public void displayChatCentre(){
System.out.println(this.centreName+" "+this.centreId+" "+this.ownerName+" "+this.location+" "+this.isOpen);
}

public void getItems(){
for(int i=0;i < this.items.length; i++){
System.out.println(items[i]);
}
}
}
