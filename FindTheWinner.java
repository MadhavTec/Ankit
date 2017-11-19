import java.util.Scanner;

public class FindTheWinner {
	
   public static void main(String[] args) {
	
	   int[] andrea = {1,2,3};
	   int[] maria = {2,1,3};
	   String str = "Even";
	   String output = winner(andrea,maria,str);
	   System.out.println("output: "+output);

   }
   
   public static String winner(int[] andrea, int[] maria, String s){
	   int length = andrea.length < maria.length ? andrea.length:maria.length;
	   int andreaScore = 0;
	   int mariaScore = 0;
	   
	   if ("EVEN".equalsIgnoreCase(s)) {
		   System.out.println("Even Game");
		   
		   for (int i=0; i <length; i=i+2) {
			   System.out.println("inside even");
			   andreaScore += andrea[i] - maria[i];
			   mariaScore += maria[i] - andrea[i];
		   }
		   
	   } else if("ODD".equalsIgnoreCase(s)){
		   System.out.println("Odd Game");
		   
		   for (int i=1; i<length; i=i+2) {
			   andreaScore += andrea[i] - maria[i];
			   mariaScore += maria[i] - andrea[i];
		   }
		   
	   } else {
		   System.out.println("Input is wrong");
	   }	   
	 
	   if (andreaScore == mariaScore) {
		   return "Tie";
	   } else if (andreaScore > mariaScore){
		   return "Andrea";
	   } else{
		   return "Maria";
	   }	   
   }
}

