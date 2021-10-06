class Reverse{
public static void main(String a[]){

String string=getReverse("ihsa yadhtrib yppah");

System.out.println(string);
System.out.println(string.length());

}

public static String getReverse(String data){
String finalData="";

char ch[]=data.toCharArray();

for(int i=ch.length-1;i>=0;i--){

finalData +=ch[i];
}
return finalData;

}

}