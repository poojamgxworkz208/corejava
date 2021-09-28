class Cylinder{

public String cylinderName;
public int price;

public Cylinder(String cylinderName,int price){

System.out.println("Cylinder object is created");
cylinderName=cylinderName;
price=price;

System.out.println(cylinderName+" "+price);
}
public static void main(String a[]){

Cylinder cylinder=new Cylinder("INDIAN",1000);
Cylinder cylinder1=new Cylinder("HP",900);
}
}