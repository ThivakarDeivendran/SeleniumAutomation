package LearningTestNg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class INterviewArray {

	public static void main(String[] args) {

		String[] name = { "Thivakar", "Basketball", "INterview", "Thivakar", "INterview", "INterview" };
		Map<String, Integer> stringName = new HashMap<String, Integer>();
		for (String x : name) {
			if (!stringName.containsKey(x)) {
				stringName.put(x, 1);
			} else {
				stringName.put(x, stringName.get(x) + 1);
			}
		}
		System.out.println(stringName);

		otherTest();
	}

	public static void test() {
		String[] inter = { "Thivakar", "Rajan", "Ramavani", "Thivakar", "Rajan" };
		Map<String, Integer> pp = new HashMap<String, Integer>();
		for (String a : inter) {
			if (!pp.containsKey(a)) {
				pp.put(a, 1);
			} else {
				pp.put(a, pp.get(a) + 1);
			}
		}
		System.out.println(pp);

	}

	public static void otherTest() {
		 String[] name ={"Thivakar","Basketball", "INterview","Thivakar",
		 "INterview","INterview"};

		 //String word ="wherethereisawillthereisaway";
		 //char[] name=word.toCharArray();
		for (int i = 0; i < name.length; i++) {
			int count = 0;
			int count1 = 0;
			for (int j = 0; j < name.length; j++) {
				if (name[i] == name[j]) {
					count++;
				}
			}
			for (int j = i - 1; j >= 0; j--) {
				if (name[i] == name[j]) {
					count1++;
				}
			}
			if (count1 == 0) {
				System.out.println(name[i] + "  " + count);
			}
		}
	}
}
