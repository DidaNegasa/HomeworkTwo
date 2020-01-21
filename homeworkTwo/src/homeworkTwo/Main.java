package homeworkTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println("Измиване на яйцата");
		System.out.println("Заливане на яйцата със студена вода");
		System.out.println("Изберете съд за приготвяне на яйцата:\n1.джезве\n2.канче\n3.тенджера");
		CookwareChoice cookware = new CookwareChoice();
		Scanner reader = new Scanner(System.in);
		String cookChoice = reader.nextLine();
		int index = Integer.parseInt(cookChoice);
		CookwareChoice.getByIndex(index);
		// fire
		System.out.println("Слагане на огъня");
		// minutes
		System.out.println("Въведете минути");
		String minutes = reader.nextLine();
		int min = Integer.parseInt(minutes);
	}
}
