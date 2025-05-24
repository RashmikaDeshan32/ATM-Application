
import java.util.Scanner;

public class MainClass{
	
	
	public static void main(String[] args){
		
		int atmNumber = 12345;
		int atmPin = 123;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to ATM machine");
		
		
		System.out.println("Please enter ATM number : ");
		int enteredAtmNumber = input.nextInt();
		
		System.out.println("Please enter ATM pin number : ");
		int enteredAtmPin = input.nextInt();
		
		if( atmNumber == enteredAtmNumber && atmPin == enteredAtmPin){
			
			System.out.println("Validation is done");
			
			while(true){
				
				System.out.println("1.View available balance\n2.Withdraw amount\n3.Deposite the amount\n4.View mini statment\n5.Exit");
				System.out.println("Enter choice");
				int choice = input.nextInt();
				
				if( choice == 1 ){
					
				}else if(choice == 2){
					
					
				}else if(choice == 3){
					
					
				}else if(choice == 4){
					
				}else if(choice == 5){
					
					System.out.println("Collect your ATM card\n.Thank you for using ATM");
					System.exit(0);
					
				}else{
					
					System.out.println("Please enter correct choice");
				}
				
				
			}
			
		}else{
			
			System.out.println("Incorrect ATM number or PIN number");
			System.exit(0);
			
		}
		
		
		
		
	}
	
	
}
