package homeworkTwo;

import java.util.ArrayList;

public class Egg {

	private static ArrayList<String> state;
	private int minutes;
	private int number;
	
	public Egg() {
		this.state = new ArrayList<String>();
		state.add("Сурово");
		state.add("Сварено");
	}

	public ArrayList<String> getEgg() {
		return state;
	}

	public void setState(ArrayList<String> state) {
		this.state = state;
	}

}
