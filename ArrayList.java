package Main;

public class ArrayList {
	
	//creating the components that make up the custom array list
		private Object[] arrayList;//creates the actual array list to store all the objects in it
		private int sizeOfArray;//the capacity of the array list
		private int end;//how many elements are in the list
		
		//default constructor
		//creating the how big the array list is going to be. how many many elements it can hold.
		public ArrayList() {
			
			arrayList = new Object[20];
			sizeOfArray = 20;
			end = 0;	
		}
		
		//constructor
		//how we can construct an array with user inputs
		public ArrayList(int n) {
			
			arrayList = new Object[n+5];
			sizeOfArray = n+5;
			end = 0;
		}
		
		//add method
		//object x is the new object that is being added to the list
		//adds the new object x to the end of the array list
		public void add(Object x) {
			
			//checks if the list is full
			if(end>=sizeOfArray) {
				
				System.out.println("Capacity of this array list has been reached");
				return;
			}
			arrayList[end] = x;
			end++;
		}
		
		//add method
		//index refers to the location of the element/value in the array list
		//adds a object x to any location of the array
		public void add(int index, Object x) {
			
		     //if index is out of range, print error message

	        if(index < 0 || index > sizeOfArray)

	       {

	            System.out.println(index + " is an invalid index to add.");

	            return;

	       }

	        //if the array list is full, print error message

	        if(end>=sizeOfArray)

	        {

	            System.out.println("Exception: Size exceeds");

	            return;

	        }

	        //make a space at index to place new element

	       for(int i = end; i > index; i--)

	       arrayList[i] = arrayList[i - 1];

	       //place the new element at index

	       arrayList[index] = x;

	       end++;

	   }
		
		
		//lets you get an get object from its index location
		public Object get(int index) {
			
			//checks if the index is a valid location in the list 
			if (index < sizeOfArray) {
				return arrayList[index];
			} else {
				return null;
			}
		}
		
		//tells you the current length of the array list
		public int size() {
			
			if (sizeOfArray < 0) {
				return 0;
			}
			return sizeOfArray;
		}
		
		//tells if the array list is empty
		public boolean isEmpty() {
			
			//if the length of the list is 0, then it returns true, but if the length is greater than 0, it returns as false
			if(end == 0) {
				
				return true;
			}
			else {
				
				return false;
			}
		}
		
		//checks if a particular object exist in the array list
		public boolean isIn(Object ob) {
			
			// starting from the very beginning of the list, the loop runs for the length of the array list.
			for(int x = 0; x < end; x++) {
				
				//while running through the loop, if the particular object is found, it will return true. if the particular object is not found, then it retu
				if(arrayList[x] == ob)
				return true;
			}
			
			return false;
		}
		
		//finds the index of an object in the array list
		public int find(Object n) {
			
			// starting from the very beginning of the list, the loop runs for the length of the array list.
			for(int x = 0; x < end; x++) {
						
				//if the particular object is found in the array list, it will give you the index of the object		
				if(arrayList[x] == n)
				return x;
					}
			
			//if location is not found, the object is given a index outside of the array list
			return -1;
		}
		
		//removes the object from the array list. if the object had a index a was not assigned a new index outside of the array list, then it removes the object from the array list
		public void remove(Object n) {
			
			//if the object actually has a location in the array list, then the loop runs to remove the object, but if it is assign a index outside of the array list, then you will get a message that the object did not exist in the array list
			if(find(n) != -1) {
				
				//runs through the length of the array list, then it removes the object once it gets to it
				for(int x = find(n); x < end - 1; x++) {
					
					arrayList[x] = arrayList[x+1];
				}
				
				System.out.println("This object has been removed from the array list");
				end--;
			}
			
			else {
				System.out.println("This object does not exist in this array list");
			}
			
		}

}
