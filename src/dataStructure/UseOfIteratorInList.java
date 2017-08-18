package dataStructure;

import java.util.List;

import java.util.Iterator;

import java.util.ArrayList;

public class UseOfIteratorInList {
	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>();
		ls.add("CANADA");
		ls.add("USA");
		ls.add("CANADA");
		ls.add("USA");
		Iterator<String> it = ls.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (String string: ls) {
			System.out.println(ls);
		}

	}
}