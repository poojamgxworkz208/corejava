class Sofa{
public String SofaName;
public int price;

public Sofa(String sofaName,int price){




System.out.println("Sofa object is created");
sofaName=sofaName;
price=price;
System.out.println(sofaName+" "+price); 

}

public static void main(String a[]){
Sofa sofa=new Sofa("Furny",13500);
Sofa sofa1=new Sofa("Wooden",18500);
}
}



