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
		System.out.println("Big Al's Warcamp Hut\n");
		while (keepGoing) {
			System.out.println("Main Menu");
			System.out.println("Press (1) for register or (2) to exit");
			String makeChange = kb.next();
			switch (makeChange) {
			case "1":
//				makeChangeApp();
				double price = getPrice();
				double payment = getPayment();
				double customerChange = saleSystem(payment, price);
				if (customerChange < 0) {
					double remainingPrice = changeNeeded(payment, price);
//					System.out.println("Press (1) for continue payment (2) to return to main menu or (3) to exit");
//					switch(makeChange) {
//					case "1":
//						double newPayment = getPayment();
//						double newCustomerChange = contSaleSystem(newPayment, remainingPrice);
//						if (newCustomerChange < 0) {
//							changeNeeded(newPayment, remainingPrice);
//						} else if (newCustomerChange >= 0) {
//							changeSystem(newCustomerChange);
//						}
//						break;
//					case "2":
//						cashRegister();
					break;
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

//	public static double makeChangeApp() {
//		double change = 0;
//		
//		double price = getPrice();
//		double payment = getPayment();
//		double customerChange = saleSystem(payment, price);
//		if (customerChange < 0) {
//			double remainingPrice = changeNeeded(payment, price);
//		} else if (customerChange >= 0) {
//			changeSystem(customerChange);
//		}
//		return change;
//	}

	public static String changeSystem(double customerChange) {

		new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(customerChange);

		if (customerChange < 0) {
			System.out.println("ERROR NOT ENOUGH MONEY");
		} else if (customerChange == 0) {
			System.out.println("Exact change thank you\n");
		} else {
			System.out.println("Customer change is: $" + customerChange);
		}

		int twentyDollars = 0, tenDollars = 0, fiveDollars = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;

		String totalChangeString = "";

		while (customerChange > 0) {
			if (customerChange >= 20) {
				customerChange = customerChange - 20;
				twentyDollars++;
				if (customerChange <= 19.99 && twentyDollars == 1) {
					System.out.println(twentyDollars + " Twenty dollar");
				} else if (customerChange <= 19.99 && twentyDollars > 0)
					System.out.println(twentyDollars + " Twenty dollars");
			} else if (customerChange >= 10) {
				customerChange = customerChange - 10;
				tenDollars++;
				if (customerChange <= 9.99 && tenDollars == 1) {
					System.out.println(tenDollars + " Ten dollar");
				} else if (customerChange <= 9.99 && tenDollars > 0) {
					System.out.println(tenDollars + " Ten dollars");
				}
			} else if (customerChange >= 5) {
				customerChange = customerChange - 5;
				fiveDollars++;
				if (customerChange <= 4.99 && fiveDollars == 1) {
					System.out.println(fiveDollars + " Five dollar");
				} else if (customerChange <= 4.99 && fiveDollars > 0) {
					System.out.println(fiveDollars + " Five dollars");
				}
			} else if (customerChange >= 1) {
				customerChange = customerChange - 1;
				oneDollar++;
				if (customerChange <= .99 && oneDollar == 1) {
					System.out.println(oneDollar + " One dollar");
				} else if (customerChange <= .99 && oneDollar > 0) {
					System.out.println(oneDollar + " One dollars");
				}
			} else if (customerChange >= .25) {
				customerChange = customerChange - .25;
				quarter++;
				if (customerChange <= .24 && quarter == 1) {
					System.out.println(quarter + " Quarter");
				} else if (customerChange <= .24 && quarter >= 1) {
					System.out.println(quarter + " Quarters");
				}
			} else if (customerChange >= .10) {
				customerChange = customerChange - .10;
				dime++;
				if (customerChange <= .9 && dime == 1) {
					System.out.println(dime + " Dime");
				} else if (customerChange <= .9 && dime >= 1) {
					System.out.println(dime + " Dimes");
				}
			} else if (customerChange >= .05) {
				customerChange = customerChange - .05;
				nickel++;
				if (customerChange <= .04 && nickel == 1) {
					System.out.println(nickel + " Nickel");
					System.out.println(customerChange);
				} else if (customerChange <= .04 && nickel >= 1) {
					System.out.println(nickel + " Nickels");
				}
			} else if (customerChange > 0) {
				customerChange = customerChange - .01;
				penny++;
				if (customerChange == 0 && penny == 1) {
					System.out.println(penny + " Penny");
				} else if (customerChange <= 0 && penny >= 0) {
					System.out.println(penny + " Pennies");
				}
			}
			if (customerChange == 0) {
				System.out.println("\n Thank You \n");
			}
		}
		return totalChangeString;
	}

	public static double changeNeeded(double payment, double price) {

		new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#.00");

		double customerChange = payment - price;
		customerChange = Math.abs(customerChange);
		System.out.println("***************ERROR******************");
		System.out.println("Inform customer that they are short \n $" + (df.format(customerChange)) + "\n");

		double changeRemaining = customerChange;
		int twentyDollars = 0, tenDollars = 0, fiveDollars = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;

		String totalChangeString = "";

		while (customerChange > 0) {
			if (customerChange >= 20) {
				customerChange = customerChange - 20;
				twentyDollars++;
				if (customerChange <= 19.99 && twentyDollars == 1) {
					System.out.println(twentyDollars + " Twenty dollar");
				} else if (customerChange <= 19.99 && twentyDollars > 0)
					System.out.println(twentyDollars + " Twenty dollars");
			} else if (customerChange >= 10) {
				customerChange = customerChange - 10;
				tenDollars++;
				if (customerChange <= 9.99 && tenDollars == 1) {
					System.out.println(tenDollars + " Ten dollar");
				} else if (customerChange <= 9.99 && tenDollars > 0) {
					System.out.println(tenDollars + " Ten dollars");
				}
			} else if (customerChange >= 5) {
				customerChange = customerChange - 5;
				fiveDollars++;
				if (customerChange <= 4.99 && fiveDollars == 1) {
					System.out.println(fiveDollars + " Five dollar");
				} else if (customerChange <= 4.99 && fiveDollars > 0) {
					System.out.println(fiveDollars + " Five dollars");
				}
			} else if (customerChange >= 1) {
				customerChange = customerChange - 1;
				oneDollar++;
				if (customerChange <= .99 && oneDollar == 1) {
					System.out.println(oneDollar + " One dollar");
				} else if (customerChange <= .99 && oneDollar > 0) {
					System.out.println(oneDollar + " One dollars");
				}
			} else if (customerChange >= .25) {
				customerChange = customerChange - .25;
				quarter++;
				if (customerChange <= .24 && quarter == 1) {
					System.out.println(quarter + " Quarter");
				} else if (customerChange <= .24 && quarter >= 1) {
					System.out.println(quarter + " Quarters");
				}
			} else if (customerChange >= .10) {
				customerChange = customerChange - .10;
				dime++;
				if (customerChange <= .9 && dime == 1) {
					System.out.println(dime + " Dime");
				} else if (customerChange <= .9 && dime >= 1) {
					System.out.println(dime + " Dimes");
				}
			} else if (customerChange >= .05) {
				customerChange = customerChange - .05;
				nickel++;
				if (customerChange <= .04 && nickel == 1) {
					System.out.println(nickel + " Nickel");
				} else if (customerChange <= .04 && nickel >= 1) {
					System.out.println(nickel + " Nickels");
				}
			} else if (customerChange > 0) {
				customerChange = customerChange - .01;
				penny++;
				if (customerChange == 0 && penny == 1) {
					System.out.println(penny + " Penny");
				} else if (customerChange <= 0 && penny >= 0) {
					System.out.println(penny + " Pennies");
				}
			}
		}

		System.out.println("***************ERROR******************\n");
		return changeRemaining;
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

		return price;
	}

	public static double getPayment() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter customer payment : \n$");
		double payment = kb.nextDouble();

		return payment;
	}
}