import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price = kb.nextDouble();
		double payment = kb.nextDouble();

		int twentyDollars = 0, tenDollars = 0, fiveDollars = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;
		System.out.println("hand the customer");

		double customerChange = payment - price;
		System.out.println("change before: " + customerChange);
		while (customerChange > 0) {
			if (customerChange > 19) {
				customerChange = customerChange - 20;
				twentyDollars++;
				if (twentyDollars > 39.99) {
					customerChange = customerChange - 20;
					twentyDollars++;
					if (customerChange <= 19.99 && twentyDollars > 0)
					System.out.println(twentyDollars + "Twenty dollars");
					continue;
				}
			} else if (customerChange > 19.99) {
				customerChange = customerChange - 10;
				tenDollars++;
				if (customerChange <= 9.99 && tenDollars > 0) {
					System.out.println(tenDollars + "Ten dollars");
					continue;
				}
			} else if (customerChange > 9.99 ) {
				customerChange = customerChange - 5;
				fiveDollars++;
				if (customerChange <= 4.99 && fiveDollars > 0) {
					System.out.println(fiveDollars + "Five dollars");
					continue;
				}
			} else if (customerChange > 1.99) {
				customerChange = customerChange - 1;
				oneDollar++;
				if (customerChange <= 0 && oneDollar > 0) {
					System.out.println(oneDollar + " One dollars");
					System.out.println("change afer: " + customerChange);
					continue;
				}
			} else if (customerChange > .24) {
				customerChange = customerChange - .25;
				quarter++;
				if (quarter >= 1) {
					System.out.println(quarter + "Quarters");
					continue;
				}
			} else if (customerChange > .09) {
				customerChange = customerChange - .1;
				dime++;
				if (dime >= 1) {
					System.out.println(dime + "Dimes");
				}
			} else if (customerChange > .04) {
				customerChange = customerChange - .05;
				nickel++;
				if (nickel >= 1) {
					System.out.println(nickel + "Nickels");
				}
			} else if (customerChange > .01) {
				customerChange = customerChange - .01;
				penny++;
				if (penny >= 1) {
					System.out.println(penny + "Pennies");
				}
			}
			System.out.println("change remaining: " + customerChange);
		}
		kb.close();

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
}

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
//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 
//1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five 
//dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than 
//amount: correct denominations for correct change.
//If the project does work with all of the above test conditions, you 
//will be given a 1 for this week's project.
//To turn in a project, you must push it to GitHub. You must include 
//a README.md that describes how to run your program.