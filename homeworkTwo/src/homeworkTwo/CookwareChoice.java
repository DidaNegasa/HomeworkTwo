package homeworkTwo;

import java.util.ArrayList;

public class CookwareChoice {

	private static ArrayList<String> cookware;

	public CookwareChoice() {
		this.cookware = new ArrayList<String>();
		cookware.add("джезве");
		cookware.add("канче");
		cookware.add("тенджера");
	}

	public ArrayList<String> getCookware() {
		return cookware;
	}

	public void setCookware(ArrayList<String> cookware) {
		this.cookware = cookware;
	}

	public static void getByIndex(int index) {
		switch (index) {
		case 1:
			System.out.println(cookware.get(0));
			break;
		case 2:
			System.out.println(cookware.get(1));
			break;
		case 3:
			System.out.println(cookware.get(2));
			break;
		default:
			System.out.println("Невалидна опция");
		}
	}
}
