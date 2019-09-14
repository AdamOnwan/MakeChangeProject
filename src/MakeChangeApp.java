import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double price = getPrice();
		double payment = getPayment();
		int intPrice = dblToIntPrice(price);
		int intPayment = dblToIntPayment(payment);
		int customerChange = saleSystem(intPayment, intPrice);
		changeSystem(customerChange);
		if (customerChange < 0) {
			changeNeeded(intPayment, intPrice);
		}

		key.close();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String changeSystem(int customerChange) {
//		
//		Scanner kb = new Scanner(System.in);
//
//		System.out.println("Enter price of item : ");
//		double price = kb.nextDouble();
//		System.out.println("Enter customer payment : ");
//		double payment = kb.nextDouble();
//
//		kb.close();
//
//		int intPrice = (int) (price * 100 + .5);
//		int intPayment = (int) (payment * 100 + .5);
//		int customerChange = intPayment - intPrice;
//
//		
//		int customerChange;
		if (customerChange < 0) {
			System.out.println("ERROR NOT ENOUGH MONEY");
		} else if (customerChange == 0) {
			System.out.println("Exact change thank you");
		} else {
			System.out.println("Customer change is: ");
		}
		
		int twentyDollars = 0, tenDollars = 0, fiveDollars = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;

		String totalChangeString = " ";
		
		while (customerChange > 0) {
			if (customerChange >= 2000) {
				customerChange = customerChange - 2000;
				twentyDollars++;
				if (customerChange <= 1999 && twentyDollars == 1) {
					System.out.println(twentyDollars + " Twenty dollar");
				} else if (customerChange <= 1999 && twentyDollars > 0)
					System.out.println(twentyDollars + " Twenty dollars");
			} else if (customerChange >= 1000) {
				customerChange = customerChange - 1000;
				tenDollars++;
				if (customerChange <= 999 && tenDollars == 1) {
					System.out.println(tenDollars + " Ten dollar");
				} else if (customerChange <= 999 && tenDollars > 0) {
					System.out.println(tenDollars + " Ten dollars");
				}
			} else if (customerChange >= 500) {
				customerChange = customerChange - 500;
				fiveDollars++;
				if (customerChange <= 499 && fiveDollars == 1) {
					System.out.println(fiveDollars + " Five dollar");
				} else if (customerChange <= 499 && fiveDollars > 0) {
					System.out.println(fiveDollars + " Five dollars");
				}
			} else if (customerChange >= 100) {
				customerChange = customerChange - 100;
				oneDollar++;
				if (customerChange <= 99 && oneDollar == 1) {
					System.out.println(oneDollar + " One dollar");
				} else if (customerChange <= 99 && oneDollar > 0) {
					System.out.println(oneDollar + " One dollars");
				}
			} else if (customerChange >= 25) {
				customerChange = customerChange - 25;
				quarter++;
				if (customerChange <= 24 && quarter == 1) {
					System.out.println(quarter + " Quarter");
				} else if (customerChange <= 24 && quarter >= 1) {
					System.out.println(quarter + " Quarters");
				}
			} else if (customerChange >= 10) {
				customerChange = customerChange - 10;
				dime++;
				if (customerChange <= 9 && dime == 1) {
					System.out.println(dime + " Dime");
				} else if (customerChange <= 9 && dime >= 1) {
					System.out.println(dime + " Dimes");
				}
			} else if (customerChange >= 5) {
				customerChange = customerChange - 5;
				nickel++;
				if (customerChange <= 4 && nickel == 1) {
					System.out.println(nickel + " Nickel");
				} else if (customerChange <= 4 && nickel >= 1) {
					System.out.println(nickel + " Nickels");
				}
			} else if (customerChange > 0) {
				customerChange = customerChange - 1;
				penny++;
				if (customerChange == 0 && penny == 1) {
					System.out.println(penny + " Penny");
				} else if (customerChange == 0 && penny >= 0) {
					System.out.println(penny + " Pennies");
				}
			}
		}
		return totalChangeString;

	}
	
	public static int changeNeeded(int intPayment, int intPrice) {
		
		int customerChange = intPayment - intPrice;
		customerChange = Math.abs(customerChange);
		System.out.println("***************ERROR******************");
		System.out.println("Customer still needs to pay \n $"+ customerChange + "\n");
	
		int changeRemaining = 0;
		
		int twentyDollars = 0, tenDollars = 0, fiveDollars = 0, oneDollar = 0, quarter = 0, dime = 0, nickel = 0,
				penny = 0;

		String totalChangeString = " ";
		
		while (customerChange > 0) {
			if (customerChange >= 2000) {
				customerChange = customerChange - 2000;
				twentyDollars++;
				if (customerChange <= 1999 && twentyDollars == 1) {
					System.out.println(twentyDollars + " Twenty dollar");
				} else if (customerChange <= 1999 && twentyDollars > 0)
					System.out.println(twentyDollars + " Twenty dollars");
			} else if (customerChange >= 1000) {
				customerChange = customerChange - 1000;
				tenDollars++;
				if (customerChange <= 999 && tenDollars == 1) {
					System.out.println(tenDollars + " Ten dollar");
				} else if (customerChange <= 999 && tenDollars > 0) {
					System.out.println(tenDollars + " Ten dollars");
				}
			} else if (customerChange >= 500) {
				customerChange = customerChange - 500;
				fiveDollars++;
				if (customerChange <= 499 && fiveDollars == 1) {
					System.out.println(fiveDollars + " Five dollar");
				} else if (customerChange <= 499 && fiveDollars > 0) {
					System.out.println(fiveDollars + " Five dollars");
				}
			} else if (customerChange >= 100) {
				customerChange = customerChange - 100;
				oneDollar++;
				if (customerChange <= 99 && oneDollar == 1) {
					System.out.println(oneDollar + " One dollar");
				} else if (customerChange <= 99 && oneDollar > 0) {
					System.out.println(oneDollar + " One dollars");
				}
			} else if (customerChange >= 25) {
				customerChange = customerChange - 25;
				quarter++;
				if (customerChange <= 24 && quarter == 1) {
					System.out.println(quarter + " Quarter");
				} else if (customerChange <= 24 && quarter >= 1) {
					System.out.println(quarter + " Quarters");
				}
			} else if (customerChange >= 10) {
				customerChange = customerChange - 10;
				dime++;
				if (customerChange <= 9 && dime == 1) {
					System.out.println(dime + " Dime");
				} else if (customerChange <= 9 && dime >= 1) {
					System.out.println(dime + " Dimes");
				}
			} else if (customerChange >= 5) {
				customerChange = customerChange - 5;
				nickel++;
				if (customerChange <= 4 && nickel == 1) {
					System.out.println(nickel + " Nickel");
				} else if (customerChange <= 4 && nickel >= 1) {
					System.out.println(nickel + " Nickels");
				}
			} else if (customerChange > 0) {
				customerChange = customerChange - 1;
				penny++;
				if (customerChange == 0 && penny == 1) {
					System.out.println(penny + " Penny");
				} else if (customerChange == 0 && penny >= 0) {
					System.out.println(penny + " Pennies");
				}
			}
		}

		
		System.out.println("\n***************ERROR******************");
		return changeRemaining;
	}
		

	public static int saleSystem(int intPayment, int intPrice) {
		int customerChange = intPayment - intPrice;
		
		return customerChange;
	}

	public static int dblToIntPayment(double payment) {
		int intPayment = (int) (payment * 100 + .5);

		return intPayment;
	}

	public static int dblToIntPrice(double price) {
		int intPrice = (int) (price * 100 + .5);

		return intPrice;
	}

	public static double getPrice() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter price of item : ");
		double price = kb.nextDouble();

		return price;
	}

	public static double getPayment() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter customer payment : ");
		double payment = kb.nextDouble();

		kb.close();
		return payment;
	}

	
//	public static void menuBackground() {
//		System.out.println("////////////////////////////");
//		System.out.println("////////////////////////////");
//		System.out.println("//" + changeSystem(); + "///");
//		System.out.println("////////////////////////////");
//		System.out.println("////////////////////////////");
//	}
}