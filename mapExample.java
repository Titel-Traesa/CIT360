
/*Traesa Titel - CIT 360
 * Code for Collections 
 * Map Examples
 */
import java.util.*;

public class mapExample {

	public mapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hashMapTest = new HashMap<Integer, String>();
		Map<Integer, String> treeMapTest = new TreeMap<Integer, String>();

		System.out.println("This is the order with the HashMap\n");
		playWithMaps(hashMapTest);
		System.out.println("\nThe order is unrelaibe with HashMap but with TreeMap it is logical and consistant\n");
		playWithMaps(treeMapTest);

	}

	private static void playWithMaps(Map<Integer, String> map) {
		map.put(1041, "John Smith");
		map.put(1002, "Sany Wilcox");
		map.put(4102, "Alan Jones");
		map.put(3701, "Dotty Bell");
		map.put(1702, "Sam Durant");

		for (Integer key : map.keySet()) {

			System.out.println(key + " - " + map.get(key));
		}

		System.out.println("Maps are great for searching and looking up values simular to a look up table.\n"
				+ "When searching through large amount of data a TreeMap is faster because the key is sorted and organized in the Tree\n "
				+ "Enter an employee number to return the name:\n");
		Scanner input = new Scanner(System.in);
		int employeeNum = input.nextInt();
		System.out.println("The employee name is:" + map.get(employeeNum));
		input.close();
	}

}
