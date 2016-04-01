package factoryMethod;

import java.util.Scanner;

public class RotiRollTestDrive {

	public static void main(String[] args) {

		System.out.println("Please enter your name");
		Scanner sc = new Scanner(System.in);
		String customername = sc.next().toUpperCase();
		
		if(customername.contains("OMAR")){
			System.out.println("Welcome Professor ! This application has been specially designed for you to \n make yummy & tasty rotis from all over holy land of India");	
		}
		else {
			System.out.println("Welcome! "+customername+"! This application will let you order yummy RotiRolls !!  ");
			
		}
		RotiRollTestDrive rotiroll = new RotiRollTestDrive();
		String stylearea = rotiroll.selectStyle();
		String style = " ";
		style = rotiroll.ingredientSelecter();
		if (stylearea.equals("n")) {
			RotiRollMaker northstyle = new NorthIndiaStyleRotiRollStore();
			RotiRoll rotiroll1 = northstyle.orderRotiRoll(style);
			System.out.println(customername + " ordered a " + rotiroll1.getName()
					+ " successfully using Factory Method Design Pattern");
		} else if (stylearea.equals("s")) {
			RotiRollMaker southstyle = new SouthIndianStyleRotiRollStore();
			RotiRoll rotiroll2 = southstyle.orderRotiRoll(style);
			System.out.println(customername + " ordered a " + rotiroll2.getName()
					+ " successfully using Factory Method Design Pattern");
		}
		/*System.out.println("Do you want to order more Roti Rolls? Press Y/N");
		String choiceagain = sc.nextLine();
		if (choiceagain.equals("y")){
			RotiRollTestDrive.main(null);
		}*/
	}

	
	
	// Area Style Selector  method
	private String selectStyle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press N for North Indian Style Roti Roll");
		System.out.println("Press S for South Indian Style Roti Roll");
		String area= " ";
		String choice = sc.next().toLowerCase();
		if (choice.equals("s")) {
			 area = choice;
		} else if (choice.equals("n")) {
			area = choice;
		} else {
			System.out.println("Wrong Choice !! Wanna try again ? Press Y/N");
			String choice4 = sc.next().toLowerCase();
			if (choice4.equals("y")) {
				return selectStyle();
			} else {
				System.out.println("Goodbye ");
			}
		}
		return area;
	}

	// Ingredient selector method

	private String ingredientSelecter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which specific ingredient you like ?");
		System.out.println("Press V for Veggie");
		System.out.println("Press C for Cheese");
		System.out.println("Press N for Chicken");
		String entry = sc.next().toLowerCase();
		String styleI = " ";
		if (entry.equals("v")) {
			styleI = "veggie";
		} else if (entry.equals("c")) {
			styleI = "cheese";
		} else if (entry.equals("n")) {
			styleI = "chicken";
		} else {
			System.out.println("Please select the correct choice");
			System.out.println("Want to try again ? Press Y/N");
			String choice2 = sc.next().toLowerCase();
			if (choice2.equals("y")) {
				return ingredientSelecter();

			} else {
				System.out.println("Goodbye");
			}

		}
		return styleI;
	}

}
