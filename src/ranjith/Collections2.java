package ranjith;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet<>(4);
		s.add(3);
		s.add(3);
		System.out.println(s);
		s.addAll(s);
		System.out.println(s);
		s.add("ran");
		System.out.println(s);
		s.add(4);
		System.out.println(s);

		Map m=new HashMap<>();
		m.put(3, "ranjith");
		System.out.println(m);
		m.remove(3);
		System.out.println(m);
		m.put(2, "hi");
		m.put(3, "hi");
		m.put(3, "how");
		m.put(1, "hi");
		m.put(0, "hi");
		m.put(2, "hey");
		System.out.println(m);
		
	}

}

