class RestaurantTester{

public static void main(String a[]){
Restaurant rest=new Restaurant();
rest.restaurantName="1947";
rest.type="veg";
rest.location="Majestic";
rest.ownerName="ppp";
rest.restaurantId=2233;

rest.serveFood();
System.out.println(rest.restaurantName+" "+rest.type+" "+rest.location+" "+rest.ownerName+" "+rest.restaurantId);




Restaurant rest1=new Restaurant();
rest1.restaurantName="Swati";
rest1.type="NonVeg";
rest1.location="Majestic";
rest1.ownerName="am";
rest1.restaurantId=33;

rest1.serveFood();
System.out.println(rest1.restaurantName+" "+rest1.type+" "+rest1.location+" "+rest1.ownerName+" "+rest1.restaurantId);
}

}