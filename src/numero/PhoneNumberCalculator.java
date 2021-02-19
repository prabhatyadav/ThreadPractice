package numero;

import java.util.Scanner;

public class PhoneNumberCalculator {

	public static void main (String args[]) {
		 String number = "8285427147";
		boolean wannacalculate = true;
		 while (wannacalculate) {
			 readInputFromConsole();
			 wannacalculate = doYouWantToCalculateMore();
		 }
		 
	}
	
	public static  boolean doYouWantToCalculateMore() {
		System.out.println("Do you wanna do more calculation");
		Scanner sq = new Scanner(System.in);
		switch(sq.nextLine()) {
		case "y" : return true;  
		case "n": return false;	
		default: return false;
		}
	}

	public static void readInputFromConsole() {
		 System.out.println("Enter The phone Number");
		 Scanner s = new Scanner(System.in);
		 String phoneNumber =s.nextLine();
		 System.out.println("Entered   phone Number"+ phoneNumber);
		 System.out.println("SUM OF ENTERED NUMBER : "+ calculateNumber(phoneNumber));
	}
	
	public static int calculateNumber(String number) {
		  while (number.length()>1  ) {
			   int sumNumber = 0;
			   char ch[]= number.toCharArray();
			  
			   for (int j = 0; j < ch.length; j++) {
				sumNumber+=Integer.parseInt(ch[j]+"");
				
				//System.out.println(sumNumber);
			}
			   number=sumNumber+"".trim();
		   }
		  return Integer.parseInt(number);
	}
	
}
