package resturant.test;


import java.util.Scanner;
import restaurant.BillPrint;
import restaurant.KFC;
import restaurant.McDonald;

public class TakeOrderAndBill {
	public static String restaurantName = null;
	public static void main(String[] args) {
//		char continueChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select restaurant . . .  \n a. Mac-Donald \n b. KFC");
		char restaurantChoice = sc.next().charAt(0);
		switch (restaurantChoice) {
		case 'a':
//			Setting the name of the restaurant for billing
			restaurantName = "Mac-Donald";
			System.out.println("You select Mc-Donald");
//			Call the mac-donald restaurant menu for order place
			McDonald.choiceMcDonald();
			break;
		case 'A':
			restaurantName = "Mac-Donald";
			System.out.println("You select Mc-Donald");
			McDonald.choiceMcDonald();
			break;
		case 'b':
			restaurantName = "KFC";
			System.out.println("You select KFC");
//			Call the KFC restaurant menu for order place
			KFC.choiceKFC();
			break;
		case 'B':
			restaurantName = "KFC";
			System.out.println("You select KFC");
			KFC.choiceKFC();
			break;
		default:
			System.out.println("Please give valid choice i,e - a/b");
			break;
		}
//				Calling the billing method
		if (restaurantChoice == 'a' || restaurantChoice == 'b' || restaurantChoice == 'A' || restaurantChoice == 'B') {
			BillPrint.printBill();
		}
	}
}
