package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "C");
		h.put(2, "B");
		h.put(3, "A");
		
		List<String> lt = getValues(h);
		System.out.println(lt);
		
	}

	public static List<String> getValues(HashMap<Integer, String> hm) {

		List<String> l = new ArrayList<String>(hm.values());
		Collections.sort(l);

		return l;

	}

}
