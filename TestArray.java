package Main;

import java.util.*;

public class TestArray {
	
	public static void main(String[]args) {
		
		defaultConstructor();
		System.out.println();
		userArray();
		
	}

		//importing ArrayList class to create an arraylist
		private static ArrayList arrayList = new ArrayList ();
		//creating an object to generate random elements
		private static Random random = new Random();
		//holds random elements
		static int element;
		//uses default constructor to create and test and arraylist
	
	public static void defaultConstructor() {
		
		//Add elements into a new array list that is the size of 15
		System.out.println("List: ");
		for(int i=0;i<15;i++) {
			element = 1 + random.nextInt(25);
			arrayList.add(element);
		}
		for(int i=0;i<15;i++){

            System.out.println(i + ": " +arrayList.get(i));
        }
		System.out.println();
		
		//Replace an element at position 5
		// another add method
		System.out.println("Updated List: ");
	    arrayList.add(5, "Zeak");
	    for(int i=0;i<15;i++) {

            System.out.println(i + ": " +arrayList.get(i));

        }
	    System.out.println();
      
	    //finds an elment in the array
	    if(arrayList.find("Zeak")!=-1)

          System.out.println("Element Zeak found in the List");

	    else

          System.out.println("Element Zeak does not found in the List");
	      System.out.println();
     
	    //test if list is empty
	    if(arrayList.isEmpty()==true)

          System.out.println("List is empty");

	    else

          System.out.println("List is not emtpy");
	      System.out.println();
     
	     //tells you if an element is in this list
	    if(arrayList.isIn("Zeak")==true)

          System.out.println("Zeak Exist in the List");

	    else

          System.out.println("Zeak Does not exist in the List");

      
	    //Remove an element
	    System.out.println();
	    arrayList.remove("Zeak");
	    System.out.println("Updated List: ");
	    for(int i=0;i<15;i++) {

          System.out.println(i + ": " +arrayList.get(i));
	    }
 }
	
	private static void userArray() {
	
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Enter size of arraylist");
			int size = userInput.nextInt();
	
			//Add elements
			System.out.println("List: ");
			for(int i=0;i<size;i++) {
				element = 1 + random.nextInt(25);
				arrayList.add(element);
			}
			for(int i=0;i<size;i++){

	            System.out.println(i + ": " +arrayList.get(i));
	        }
			System.out.println();
			
			//Replace an element at position 5
			// another add method
			System.out.println("add your own method");
			System.out.println("Where do you want to place your value?");
			int index = userInput.nextInt();
			System.out.println("Now enter the Value you want");
			Object value = userInput.nextInt();
			arrayList.add(index, value);
			System.out.println("Updated List: ");
		    for(int i=0;i<15;i++) {

	            System.out.println(i + ": " +arrayList.get(i));

	        }
		    System.out.println();
	      
		    //finds an elment in the array
		    if(arrayList.find(value)!=-1)

	          System.out.println("Element " + value + "found in the List");

		    else

	          System.out.println("Element " + value + "does not found in the List");
		      System.out.println();
	     
		    //test if list is empty
		    if(arrayList.isEmpty()==true)

	          System.out.println("List is empty");

		    else

	          System.out.println("List is not emtpy");
		      System.out.println();
	     

		    if(arrayList.isIn(value)==true)

	          System.out.println(value + " Exist in the List");

		    else

	          System.out.println(value + " Does not exist in the List");

	      
		    //Remove an element
		    System.out.println();
		    arrayList.remove("Zeak");
		    System.out.println("Updated List: ");
		    for(int i=0;i<15;i++) {

	          System.out.println(i + ": " +arrayList.get(i));
		    }
	}

}
