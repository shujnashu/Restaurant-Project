package restaurant;

import java.util.Scanner;
import resturant.test.TakeOrderAndBill;

public class McDonald {
	static String  name = TakeOrderAndBill.restaurantName;
	public static void choiceMcDonald() {
		char continueChoice;
		Scanner sc = new Scanner(System.in);
		VegDishes veg = new VegDishes();
		NonVegDishes nVeg = new NonVegDishes();
		DessertDishes desert = new DessertDishes();
		do {
			System.out.println("Select category . . .");
			System.err.println(" a. Veg. \n b. Non-Veg. \n c. Dessert.");
			char categoryChoose = sc.next().charAt(0);
			switch (categoryChoose) {

//	This is for Veg Choice
			case 'a':
				System.out.println("You choose Veg.");
				do {
					System.out.println("Choose Items . . . ");
					System.err.println(" a. Aloo Tikki     Rs-[" + veg.ALOOTIKKI + "] \n b. Manchurian     Rs-["
							+ veg.MANCHURIAN + "]\n c. Kadai paneer   Rs-[" + veg.KADAPANEER
							+ "] \n d. Kadai mashroom Rs-[" + veg.KADAIMASHROOM + "]");

					char itemChoice = sc.next().charAt(0);
					if (itemChoice == 'a') {
						System.out.println("Quantity ?");
						veg.vegQuantity = sc.nextInt();
						BillPrint.vegDishPrice += veg.ALOOTIKKI * veg.vegQuantity;

						BillPrint.vegList.put("Aloo Tikki", veg.vegQuantity);

					} else if (itemChoice == 'b') {
						System.out.println("Quantity ?");
						veg.vegQuantity = sc.nextInt();
						BillPrint.vegDishPrice += veg.MANCHURIAN * veg.vegQuantity;
						BillPrint.vegList.put("Manchurian", veg.vegQuantity);

					} else if (itemChoice == 'c') {
						System.out.println("Quantity ?");
						veg.vegQuantity = sc.nextInt();
						BillPrint.vegDishPrice += veg.KADAPANEER * veg.vegQuantity;
						BillPrint.vegList.put("Kadai-Paneer", veg.vegQuantity);

					} else if (itemChoice == 'd') {
						System.out.println("Quantity ?");
						veg.vegQuantity = sc.nextInt();
						BillPrint.vegDishPrice += veg.KADAIMASHROOM * veg.vegQuantity;
						BillPrint.vegList.put("Kadai-Mashroom", veg.vegQuantity);
					}
					else {
						System.out.println("Please give correct option");
					}
					System.out.println("Do you want to select more Veg dish . (Y/N)");
					continueChoice = sc.next().charAt(0);

				} while (continueChoice == 'Y' || continueChoice == 'y');

//					System.out.println(veg.vegDishPrice);					
				break;
			case 'b':

//					This is for Non - Veg Choice

				System.out.println("You choose Non-Veg.");
				do {
					System.out.println("Choose Items . . . ");
					System.err.println(" a. Grilled Chicken Rs-[" + nVeg.GRILLEDCHICKEN + "] \n b. Mutton Korma  Rs-["
							+ nVeg.MOTTONKORMA + "]\n c. Fish Biryani Rs-[" + nVeg.FISHBIRIYANI
							+ "] \n d. Chicken Biryani Rs-[" + nVeg.CHICKENBIRIYANI + "]\n e. Egg Biryani  Rs-["
							+ nVeg.EGGBIRIYANI + "]");
					char itemChoice = sc.next().charAt(0);
					if (itemChoice == 'a') {
						System.out.println("Quantity ?");
						nVeg.nonVegQuantity = sc.nextInt();
						BillPrint.nonVegDishPrice += nVeg.GRILLEDCHICKEN * nVeg.nonVegQuantity;
						BillPrint.nonVegList.put("Grilled Chicken", nVeg.nonVegQuantity);

					} else if (itemChoice == 'b') {
						System.out.println("Quantity ?");
						nVeg.nonVegQuantity = sc.nextInt();
						BillPrint.nonVegDishPrice += nVeg.MOTTONKORMA * nVeg.nonVegQuantity;
						BillPrint.nonVegList.put("Mutton Korma", nVeg.nonVegQuantity);

					} else if (itemChoice == 'c') {
						System.out.println("Quantity ?");
						nVeg.nonVegQuantity = sc.nextInt();
						BillPrint.nonVegDishPrice += nVeg.FISHBIRIYANI * nVeg.nonVegQuantity;
						BillPrint.nonVegList.put("Fish Biryani", nVeg.nonVegQuantity);

					} else if (itemChoice == 'd') {
						System.out.println("Quantity ?");
						nVeg.nonVegQuantity = sc.nextInt();
						BillPrint.nonVegDishPrice += nVeg.CHICKENBIRIYANI * nVeg.nonVegQuantity;
						BillPrint.nonVegList.put("Chicken Biryani", nVeg.nonVegQuantity);

					} else if (itemChoice == 'e') {
						System.out.println("Quantity ?");
						nVeg.nonVegQuantity = sc.nextInt();
						BillPrint.nonVegDishPrice += nVeg.EGGBIRIYANI * nVeg.nonVegQuantity;
						BillPrint.nonVegList.put("Egg Biryani", nVeg.nonVegQuantity);

					}
					else {
						System.out.println("Please give correct option");
					}
					System.err.println("Do you want to select more Non-Veg dish . y/n");
					continueChoice = sc.next().charAt(0);

				} while (continueChoice == 'Y' || continueChoice == 'y');
//				System.out.println(nVeg.nonVegDishPrice);
				break;

//		This is for desert...

			case 'c':
				System.out.println("You choose Dessert.");
				do {
					System.out.println("Choose Items . . . ");
					System.err.println(
							" a. Chocolate Cookies Rs-[" + desert.CHOCOLATE_COOKIES + "] \n b. Gulab Jamun  Rs-["
									+ desert.GULAB_JAMUN + "]\n c. Ice - Cream Rs-[" + desert.ICE_CREAM + "] ");
					char itemChoice = sc.next().charAt(0);
					
					
					if (itemChoice == 'a') {
						System.out.println("Quantity ?");
						desert.dessertQuantity = sc.nextInt();
						BillPrint.dessertPrice += desert.CHOCOLATE_COOKIES * desert.dessertQuantity;
						BillPrint.dessertList.put("Chocolate Cookies", desert.dessertQuantity);

					} else if (itemChoice == 'b') {
						System.out.println("Quantity ?");
						desert.dessertQuantity = sc.nextInt();
						BillPrint.dessertPrice += desert.GULAB_JAMUN * desert.dessertQuantity;
						BillPrint.dessertList.put("Gulab Jamun", desert.dessertQuantity);

					} else if (itemChoice == 'c') {
						System.out.println("Quantity ?");
						desert.dessertQuantity = sc.nextInt();
						BillPrint.dessertPrice += desert.ICE_CREAM * desert.dessertQuantity;
						BillPrint.dessertList.put("Ice -  Cream", desert.dessertQuantity);
					}
					else {
						System.out.println("Please give correct option");
					}
					System.err.println("Do you want to select more desert . y/n");
					continueChoice = sc.next().charAt(0);

				} while (continueChoice == 'Y' || continueChoice == 'y');
				break;
			default:
				System.err.println("Please select proper option -(a, b, c)");
				break;
			}

			System.err.print("Do you want to order more from(Veg/Non-Veg/Dessert)  (Y/N)");
			continueChoice = sc.next().charAt(0);
		} while (continueChoice == 'y' || continueChoice == 'Y');

//		sc.close();
	}
}
