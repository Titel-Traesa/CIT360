
/*Traesa Titel - CIT 360
 * Code for Collections 
 * List Examples
 */
import java.util.*;

public class listExamples {

	public listExamples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is to demonstrate various types of lists in the collections interface
		List<String> testArrayList = new ArrayList<String>();
		List<String> testLinkedList = new LinkedList<String>();

		playWithList("ArrayList", testArrayList);
		System.out.println("====================Now the Same program with a linkList====================");
		playWithList("ArrayList", testLinkedList);
	}

	private static void playWithList(String type, List<String> list) {

		list.add("Cindy");
		list.add("Max");
		list.add("Joe");
		list.add("Kip");
		list.add("Beth");
		list.add("Lisa");

		for (int i = 0; i < list.size(); i++) {

			System.out.printf("%s ", list.get(i));

		}
		System.out.println("\n=========Now Sorted List==========");

		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {

			System.out.printf("%s ", list.get(i));

		}
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter another Name \n");
		list.add(in.nextLine());
		System.out.println("=========Now with Added Name==========");

		// Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {

			System.out.printf("%s ", list.get(i));

		}
		System.out.println();
		System.out.print("Enter a name to be removed from the list\n");
		list.remove(in.nextLine());
		System.out.println("=========Now with Name Removed==========");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
			System.out.println();

		}

		in.close();
	}

}
