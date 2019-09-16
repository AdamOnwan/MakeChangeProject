import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		cashRegister();
	}

	public static String cashRegister() {
		String cashRegisterReturn = "";
		Scanner kb = new Scanner(System.in);
		boolean keepGoing = true;
		System.out.println("Welcome to Plane of Knowledge\n");
		while (keepGoing) {
			System.out.println("Main Menu");
			System.out.println("Press (1) for register or (2) to exit");
			String makeChange = kb.next();

			switch (makeChange) {
			case "1":
				double price = getPrice();
				double payment = getPayment();
				double customerChange = saleSystem(payment, price);
				if (customerChange < 0) {
					notEnoughChange(payment, price);
				} else if (customerChange >= 0) {
					changeSystem(customerChange);
				}
				break;
			case "2":
				System.out.println("Have a nice day!");
				keepGoing = false;
				break;
			default:
				System.out.println("Wrong input, please press 1 or 2");
				break;
			}
		}
		return cashRegisterReturn;

	}

	public static String changeSystem(double customerChange) {

		new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(customerChange);
		if (customerChange < 0) {
			System.out.println("ERROR NOT ENOUGH MONEY");
		} else if (customerChange == 0) {
			System.out.println("Exact change thank you\n");
		} else {
			System.out.println("change amount of: $" + df.format(customerChange) + "\n");
		}
		customerChange = customerChange * 100;
		int intCustomerChange = (int) (customerChange + .05);

		int twentyDollars = 0, tenDollars = 0, fiveDollars = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;

		String totalChangeString = " ";

		while (intCustomerChange > 0) {
			if (intCustomerChange >= 2000) {
				intCustomerChange = intCustomerChange - 2000;
				twentyDollars++;
				if (intCustomerChange <= 1999 && twentyDollars == 1) {
					System.out.println(twentyDollars + " Twenty dollar");
				} else if (intCustomerChange <= 1999 && twentyDollars > 0)
					System.out.println(twentyDollars + " Twenty dollar");
			} else if (intCustomerChange >= 1000) {
				intCustomerChange = intCustomerChange - 1000;
				tenDollars++;
				if (intCustomerChange <= 999 && tenDollars == 1) {
					System.out.println(tenDollars + " Ten dollar");
				} else if (intCustomerChange <= 999 && tenDollars > 0) {
					System.out.println(tenDollars + " Ten dollars");
				}
			} else if (intCustomerChange >= 500) {
				intCustomerChange = intCustomerChange - 500;
				fiveDollars++;
				if (intCustomerChange <= 499 && fiveDollars == 1) {
					System.out.println(fiveDollars + " Five dollar");
				} else if (intCustomerChange <= 499 && fiveDollars > 0) {
					System.out.println(fiveDollars + " Five dollars");
				}
			} else if (intCustomerChange >= 100) {
				intCustomerChange = intCustomerChange - 100;
				oneDollar++;
				if (intCustomerChange <= 99 && oneDollar == 1) {
					System.out.println(oneDollar + " One dollar");
				} else if (intCustomerChange <= 99 && oneDollar > 0) {
					System.out.println(oneDollar + " One dollars");
				}
			} else if (intCustomerChange >= 25) {
				intCustomerChange = intCustomerChange - 25;
				quarter++;
				if (intCustomerChange <= 24 && quarter == 1) {
					System.out.println(quarter + " Quarter");
				} else if (intCustomerChange <= 24 && quarter >= 1) {
					System.out.println(quarter + " Quarters");
				}
			} else if (intCustomerChange >= 10) {
				intCustomerChange = intCustomerChange - 10;
				dime++;
				if (intCustomerChange <= 9 && dime == 1) {
					System.out.println(dime + " Dime");
				} else if (intCustomerChange <= 9 && dime >= 1) {
					System.out.println(dime + " Dimes");
				}
			} else if (intCustomerChange >= 5) {
				intCustomerChange = intCustomerChange - 5;
				nickel++;
				if (intCustomerChange <= 4 && nickel == 1) {
					System.out.println(nickel + " Nickel");
				} else if (intCustomerChange <= 4 && nickel >= 1) {
					System.out.println(nickel + " Nickels");
				}
			} else if (intCustomerChange > 0) {
				intCustomerChange = intCustomerChange - 1;
				penny++;
				if (intCustomerChange == 0 && penny == 1) {
					System.out.println(penny + " Penny");
				} else if (intCustomerChange <= 0 && penny >= 0) {
					System.out.println(penny + " Pennies");
				}
			}
		}
		return totalChangeString;
	}

	public static double notEnoughChange(double payment, double price) {
		new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#.00");

		double insufficientChange = payment - price;
		insufficientChange = Math.abs(insufficientChange);
		System.out.println("***************ERROR******************");
		System.out.println("Payment not sufficient, short");
		changeSystem(insufficientChange);
		System.out.println("***************ERROR******************\n");
		return (insufficientChange);

	}

	public static double contSaleSystem(double newPayment, double remainingPrice) {
		double newCustomerChange = newPayment - remainingPrice;

		return newCustomerChange;
	}

	public static double saleSystem(double payment, double price) {
		double customerChange = payment - price;

		return customerChange;
	}

	public static double getPrice() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter price of item : \n$");
		double price = kb.nextDouble();
		System.out.println("Item price: $" + price);

		return price;
	}

	public static double getPayment() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter payment : \n$");
		double payment = kb.nextDouble();

		return payment;
	}
}