package ranjith;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
    	List l=new ArrayList<String>(3);
    	l.add(3 );
    	l.add("ranjith");
    	System.out.println(l);
    	l.add(1, "hi");;
    	System.out.println(l);
    	l.add(3, 4);
    	l.add("null");
    	l.add("null");
    	System.out.println(l);
l.add(4, 4);;
System.out.println(l);
    	List<String>l2=new LinkedList<String>();
    	l2.add("srinu");
    	l2.add("rinu");
    	l2.add(0, "element");
    	System.out.println(l2);
    	Set s=new HashSet<>(4);
    	s.add(3);
    	s.add("ranjith");
    	s.add(3);
    s.add("ranjith");
    s.add("anjith");
    s.add(null);
    	System.out.println(s);
    	
    	
		}
    	
	}


