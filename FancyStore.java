class FancyStore{

String StoreName;
int StoreId;
String location;
boolean isOpen;

String items[]={"Necklace","Anklet","Ring"};
public FancyStore(){
this("Fashion Centre",33,"Rajajinagar",true);
System.out.println("FancyStore object is created");
}

public FancyStore(String StoreName,int StoreId,String location,boolean isOpen){
this.StoreName=StoreName;
this.StoreId=StoreId;
this.items=items;
this.location=location;
this.isOpen=isOpen;
}
public void displayFancyStore(){
System.out.println(this.StoreName+" "+this.StoreId+" "+this.location+" "+this.isOpen);
}

public void getItems(){
for(int i=0; i<this.items.length;i++){
System.out.println(items[i]);
}
}
}