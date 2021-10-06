class BankTester{

public static void main(String a[]){

Bank bank=new BandhanBank();
bank.provideLoans(7.5);
System.out.println(bank);


Bank bank1=new DenaBank();
bank1.provideLoans(7.1);
System.out.println(bank);


Bank bank3=new SiddhasiriBank();
bank3.provideLoans(6.1);
System.out.println(bank);

Bank bank2=new SBIBank();
bank2.provideLoans(4.1);
System.out.println(bank);



}
}