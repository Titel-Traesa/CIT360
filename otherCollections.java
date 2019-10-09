
/*Traesa Titel - CIT 360
 * Code for Collections 
 * Set and Queue Examples
 */
import java.util.*;

public class otherCollections {

	public otherCollections() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is to demonstrate various types of lists in the collections interface
		Set<String> hashSetTest = new HashSet<String>();
		Set<String> linkedHashSetTest = new LinkedHashSet<String>();
		Set<String> treeSetTest = new TreeSet<String>();
		Scanner input = new Scanner(System.in);

		int choice = 5;
		Queue<String> testq = new LinkedList<>();
		while (choice != 0) {
			System.out.print("\nEnter 1 for Hash Set, 2 for LinkedHashSet and 3 for TreeSet and 0 to quit \n");
			choice = input.nextInt();

			if (choice == 1) {
				playWithSet("HashSet", hashSetTest);
				testq.add("HashSet");
			}
			if (choice == 2) {
				playWithSet("LinkedHashSet", linkedHashSetTest);
				testq.add("LinkedHashSet");
			}
			if (choice == 3) {
				playWithSet("TreeSet", treeSetTest);
				testq.add("TreeSet");
			}

		}
		input.close();
		// Example of Queue
		System.out.println("See what you added to the queue with your previous selections");
		System.out.print("\nThis is the current queue - " + testq);
		testq.remove();
		System.out.println(
				"\nQueue is first in first out so when you invoke remove method the 1st one is removed\n\nHere is what the queue has in it now - "
						+ testq);
		testq.remove();
		System.out.print("See who is next in the queue after removing another element - " + testq.peek());
	}

	private static void playWithSet(String type, Set<String> testSet) {

		testSet.add("Blue");
		testSet.add("Pink");
		testSet.add("Orange");
		testSet.add("Red");
		testSet.add("Yellow");
		testSet.add("Purple");

		System.out.println("This is the order of the list for: " + type);
		// iterates through the list and outputs
		printTestSet(testSet);

		System.out.println("\nSets cannot have duplicates!  Enter a color that is a duplicate: \n");
		Scanner in = new Scanner(System.in);
		testSet.add(in.nextLine());
		System.out.println("=========See that the color was not added==========");

		printTestSet(testSet);

		System.out.println("\nNow Enter a color that is NOT a duplicate: \n");
		testSet.add(in.nextLine());
		System.out.println("=========See that the color was added==========");
		printTestSet(testSet);

		in.close();

	}

	private static void printTestSet(Set<String> testSet) {
		Iterator<String> ite = testSet.iterator();
		while (ite.hasNext())
			System.out.printf("%s ", ite.next());
	}

}
