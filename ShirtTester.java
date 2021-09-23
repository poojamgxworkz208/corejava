class ShirtTester{
public static void main(String a[]){

Shirt shirt=new Shirt();

shirt.type="COTTON";
shirt.price=500;
shirt.color="Black";
System.out.println(shirt.type+" "+shirt.price+" "+shirt.color);

shirt.write();

}
}