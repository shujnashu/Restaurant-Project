package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import resturant.test.TakeOrderAndBill;

public class BillPrint {
	public static HashMap<String, Integer> vegList = new HashMap<String, Integer>();
	public static HashMap<String, Integer> nonVegList = new HashMap<String, Integer>();
	public static HashMap<String, Integer> dessertList = new HashMap<String, Integer>();
	public static float vegDishPrice = 0;
	public static float nonVegDishPrice = 0;
	public static float dessertPrice = 0;

	public static void printBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Enter your phone number :");
		String phoneNo = sc.nextLine();
		User user = new User(name, phoneNo);

		System.out.println(
				"\n\n\n++++++++++++++++++++ Y o u r  B i l l(" + user.name + ") +++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.print("Name of the  Restaurant - " + TakeOrderAndBill.restaurantName);
		System.out.println("\nCustomer_Name -  " + user.name + "\nPhone number - +91 " + user.phoneNumber);
		System.out.println("----------------\t ---------------\t ---------------");
		System.out.println("| Items	|\t\t |Quantity |" + "\t\t  |	Price |");
		System.out.println("-----------------\t ---------------\t ---------------");

		String qty = null;

//		This section for Veg dish bill
		for (Map.Entry<String, Integer> eachDish : BillPrint.vegList.entrySet()) {
			if (eachDish.getKey() == "Aloo Tikki") {
				qty = eachDish.getValue() + " * " + new VegDishes().ALOOTIKKI;
			}
			if (eachDish.getKey() == "Manchurian") {
				qty = eachDish.getValue() + " * " + new VegDishes().MANCHURIAN;
			}
			if (eachDish.getKey() == "Kadai-Paneer") {
				qty = eachDish.getValue() + " * " + new VegDishes().KADAPANEER;
			}
			if (eachDish.getKey() == "Kadai-Mashroom") {
				qty = eachDish.getValue() + " * " + new VegDishes().KADAIMASHROOM;
			}
			System.out.println(eachDish.getKey() + "\t\t  " + qty);
		}
		if (vegDishPrice != 0) {
			System.out.print("\t\t\t\t\t\t\t" + vegDishPrice + "\n");
		}

//		This section for Non-Veg dish bill
		for (Map.Entry<String, Integer> eachDish : BillPrint.nonVegList.entrySet()) {
			if (eachDish.getKey() == "Grilled Chicken") {
				qty = eachDish.getValue() + " * " + new NonVegDishes().GRILLEDCHICKEN;
			}
			if (eachDish.getKey() == "Mutton Korma") {
				qty = eachDish.getValue() + " * " + new NonVegDishes().MOTTONKORMA;
			}
			if (eachDish.getKey() == "Fish Biryani") {
				qty = eachDish.getValue() + " * " + new NonVegDishes().FISHBIRIYANI;
			}
			if (eachDish.getKey() == "Chicken Biryani") {
				qty = eachDish.getValue() + " * " + new NonVegDishes().CHICKENBIRIYANI;
			}
			if (eachDish.getKey() == "Egg Biryani") {
				qty = eachDish.getValue() + " * " + new NonVegDishes().EGGBIRIYANI;
			}
			System.out.println(eachDish.getKey() + "\t\t\t" + qty);
		}
		if (nonVegDishPrice != 0) {
			System.out.print("\t\t\t\t\t\t\t" + nonVegDishPrice + "\n");
		}

// This section for desert
		for (Map.Entry<String, Integer> eachDish : BillPrint.dessertList.entrySet()) {
			if (eachDish.getKey() == "Chocolate Cookies") {
				qty = eachDish.getValue() + " * " + new DessertDishes().CHOCOLATE_COOKIES;
			}
			if (eachDish.getKey() == "Gulab Jamun") {
				qty = eachDish.getValue() + " * " + new DessertDishes().GULAB_JAMUN;
			}
			if (eachDish.getKey() == "Ice -  Cream") {
				qty = eachDish.getValue() + " * " + new DessertDishes().ICE_CREAM;
			}
			System.out.println(eachDish.getKey() + "\t\t\t" + qty);
		}
		if (dessertPrice != 0) {
			System.out.print("\t\t\t\t\t\t\t" + dessertPrice + "\n");
		}

		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(
				"Total Bill Amount : \t\t\t\t\t " + (vegDishPrice + nonVegDishPrice + dessertPrice) + " Rs. only");

		System.out
				.println("\n\n+++++++++++++++++++++++ T H A N K *  Y O U +++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++ V I S I T *  A G A I N +++++++++++++++++++++++++++++++++++++++");
		sc.close();
	}

}
