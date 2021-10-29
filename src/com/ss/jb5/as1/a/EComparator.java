package com.ss.jb5.as1.a;

import java.util.Comparator;

public class EComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if ((o1.contains("E") || o1.contains("e") && o2.contains("E") || o2.contains("e"))) {
			return 0;
		} else if (o1.contains("E") || o1.contains("e")) {
			return -1;
		} else {
			return 1;
		}
	}

}
