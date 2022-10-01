import java.util.*;

public class Test {

	public static void main(String args[])
	{
		// Creating object of the
		// class linked list
		LinkedList<String> ll
			= new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		ll.add(3,"F");

		System.out.println(ll);

	}
}
