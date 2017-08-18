package dataStructure;

import java.util.ArrayList;
import java.util.Random;

public class UseArraysList {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++) {
			Random rm = new Random();
			numList.add(rm.nextInt(50));
		}
		for (int j = 0; j < numList.size(); j++)
			System.out.println(numList.get(j));

	}

}
