package dataStructure;

import java.util.ArrayList;

public class UseOfArrayListString {

	public static void main(String[] args) {

		ArrayList<String> stList = new ArrayList<String>();
		stList.add("I am not performing good");
		stList.add("I have to perform for my betterment");
		for (int i = 0; i < stList.size(); i++) {
			System.out.println(stList);
		}
		for (String st: stList) {
			System.out.println(stList);
			
		}
	}
}