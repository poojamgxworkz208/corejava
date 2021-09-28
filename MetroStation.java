class MetroStation{

int stationId;
String stationLocation;
String ownerName;
boolean isOpen;

public MetroStation(){
this(2, "near KLE", "Ranga",true);
System.out.println("MetroStation object is created");

}

public MetroStation(int stationId,String stationLocation,String ownerName,boolean isOpen){

this.stationId=stationId;
this.stationLocation=stationLocation;
this.ownerName=ownerName;
this.isOpen=isOpen;
}

public void displayMetroStation(){
System.out.println(this.stationId+" "+this.stationLocation+" "+this.ownerName+" "+this.isOpen);
}


}
