import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter price of item : ");
		double price = kb.nextDouble();
		System.out.println("Enter customer payment : ");
		double payment = kb.nextDouble();

		int intPrice = (int) (price * 100 + .5);
		int intPayment = (int) (payment * 100 +.5);
		
		int twentyDollars = 0, tenDollars = 0, fiveDollars = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;


		int customerChange = intPayment - intPrice;
		
		while (customerChange > 0) 
			System.out.println("hand the customer");
		
		{
			if (customerChange >= 2000) {
				customerChange = customerChange - 2000;
				twentyDollars++;
				if (customerChange <= 1999 && twentyDollars > 0)
					System.out.println(twentyDollars + " Twenty dollars");
			} else if (customerChange >= 1000) {
				customerChange = customerChange - 1000;
				tenDollars++;
				if (customerChange <= 999 && tenDollars > 0) {
					System.out.println(tenDollars + " Ten dollars");
				}
			} else if (customerChange >= 500) {
				customerChange = customerChange - 500;
				fiveDollars++;
				if (customerChange <= 499 && fiveDollars > 0) {
					System.out.println(fiveDollars + " Five dollars");
				}
			} else if (customerChange >= 100) {
				customerChange = customerChange - 100;
				oneDollar++;
				if (customerChange <= 99 && oneDollar > 0) {
					System.out.println(oneDollar + " One dollars");
				}
			} else if (customerChange >= 25) {
				customerChange = customerChange - 25;
				quarter++;
				if (customerChange <=24 && quarter >= 1) {
					System.out.println(quarter + " Quarters");
				}
			} else if (customerChange >= 10) {
				customerChange = customerChange - 10;
				dime++;
				if (customerChange <=9 && dime >= 1) {
					System.out.println(dime + " Dimes");
				}
			} else if (customerChange >= 5) {
				customerChange = customerChange - 5;
				nickel++;
				if (customerChange <=4 && nickel >= 1) {
					System.out.println(nickel + " Nickels");
				}
			} else if (customerChange > 0) {
				customerChange = customerChange - 1;
				penny++;
				if (customerChange == 0 && penny >= 0) {
					System.out.println(penny + " Pennies");
				}
			}
		}
		
		if (customerChange < 0) {
			System.out.println("ERROR NOT ENOUGH MONEY");
		}
		
		kb.close();

	}
}





//	public static double itemPrice() {
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Please enter price of item: ");
//		double price = kb.nextDouble();
//
//		return price;
//	}
//
//	public static double itemPayment() {
//
//		Scanner kbb = new Scanner(System.in);
//		System.out.println("Please enter customer payment: ");
//		double payment = kbb.nextDouble();
//
//		return payment;
//
//	}

//Make Change (Cash Register)
//Denominations that are not used should not be displayed.
//Hint: Mod operator
//
//User Story #1
//The user is prompted asking for the price of the item.
//
//User Story #2
//The user is then prompted asking how much money was tendered by 
//the customer.
//
//User Story #3
//Display an appropriate message if the customer provided too little 
//money or the exact amount.
//
//User Story #4
//If the amount tendered is more than the cost of the item, display 
//the number of bills and coins that should be given to the customer.
//
//You will be given either a pass or fail based on whether your code
//works given all of the following test conditions:
//
//Amount: .6719dered: 20.00, Result: 1 ten dollar bill, 1 five 
//dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than 
//amount: correct denominations for correct change.
//If the project does work with all of the above test conditions, you 
//will be given a 1 for this week's project.
//To turn in a project, you must push it to GitHub. You must include 
//a README.md that describes how to run your program.