import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class TimeTest {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub'
		
		
		boolean contFile = true;  // boolean for choosing file 
		boolean contTest = true;  // boolean for testing loop
		
		Scanner scan = new Scanner(System.in); 
		
		String file = null;        // for choosing which file to read
		String[] commands = null;  // to store all the commands
		
		System.out.println("number of command line arguments: "+args.length); 
		System.out.println("command line arguments: ");
		
		while(contFile==true) // Print all the options for the user and allow them to choose which file they would like to read, quit will end this loop
			{																						// and terminate the code
			System.out.println("Which file would you like to use");
			System.out.println("(1) - File1.dat, all insertions");
			System.out.println("(2) - File2.dat, insertions then deletionss");
			System.out.println("(3) - File3.dat");
			System.out.println("(4) - File4.dat");
			System.out.println("(5) - Quit");
			
			int option1 = scan.nextInt(); // scan the choice
					 
			if(option1==5)  // if they want to quit, end loop
				contFile = false;
			else {  // if they choose an option, use that choice to retrieve it from the command line
				file = args[option1-1];
				contTest = true; // set the tester variable to true for retesting with other files
				Scanner reader = new Scanner(new File(file));  // open a reader to read the file
				reader.nextLine(); //ignore first line
				String line = reader.nextLine(); // create a string with the first line and split it at the spaces to create a string array of the commands
				commands = line.split(" ");
				System.out.println("Reading filename from command line. \n"+ ">>" +file+" read\n"); // print which file was chosen
			}

			
			while(contTest==true) // loop to allow multiple methods to be tested on the the same file
				{
					System.out.println("	ADT Menu"); //prints all options for user to choose
					System.out.println("(0) - Quit/Pick Another File");
					System.out.println("(1) - LinkedList");
					System.out.println("(2) - StackArray");
					System.out.println("(3) - StackList");
					System.out.println("(4) - QueueList");
					System.out.println("(5) - ArrayList");
					System.out.println("(6) - array");
					
					
					int option = scan.nextInt(); //takes users input to see which option they want
					
					if(option == 0 ) // end the loop if they choose to quit
						contTest = false;
						
					else if (option == 1) {  // LinkedList
						System.out.println("Your Choice >> "+option);
						System.out.println("CPU time: " + LinkedList(commands)); // call the method, which returns the runtime. This is the same for each one
						System.out.println();						
					}
					
					else if (option == 2) { //StackArray
						System.out.println("Your Choice >> "+option);
						System.out.println("CPU time: "+ StackArray(commands));
						System.out.println();
					}
					
					else if (option == 3) {  //StackList
						System.out.println("Your Choice >> "+option);
						System.out.println("CPU time: "+ StackList(commands));
						System.out.println();
					}
				
					else if (option == 4) {  //QueueList
						System.out.println("Your Choice >> "+option);
						System.out.println("CPU time: "+ QueueList(commands));
						System.out.println();
					}
					
					else if (option == 5) {  //ArrayList
						System.out.println("Your Choice >> "+option);
						System.out.println("CPU time: "+ ArrayList(commands));
						System.out.println();
					}
					
					else if (option == 6) {  // array
						System.out.println("Your Choice >> "+option);
						System.out.println("CPU time: "+ array(commands));
						System.out.println();
					}
				}
			}

		scan.close(); 
		
	}
	
	
	
	
	public static long LinkedList(String[] commands){
		//TODO Run Commands on LinkedList
		
		long start = System.currentTimeMillis();  // beginning time stored
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();  // new LinkedList initialized
		 
		for(int i = 0; i < commands.length; i++) // loop thru all commands
		{
			String com = commands[i]; // create a string of specific command
			Integer num = Integer.parseInt(com.substring(1)); // create an integer of the string from first index of that string on
			if(com.startsWith("i")) {  // if it is a insertion
				linkedList.add(num);  // insertions method for LinkedList
			}
			else { // if it is a deletion
				linkedList.remove(num);  // deletion method for linked list
			}
		}
		
		long end = System.currentTimeMillis();  // ending time stored
		
		return end-start;  // total time returned 
	} 
	
	public static long StackArray(String[] commands){
		//TODO Run Commands on StackArray
		
		long start = System.currentTimeMillis();
		
		Stack<Integer> stackArray = new Stack<Integer>();  // new StackArray initialized
		
		for(int i = 0; i < commands.length; i++)
		{
			String com = commands[i];
			Integer num = Integer.parseInt(com.substring(1));
			if(com.startsWith("i")) 
				stackArray.push(num); // insertion method for StackArray
			else 
				stackArray.pop();  // deletion method for StackArray
		}
		
		long end = System.currentTimeMillis();
		
		return end-start; 
		
	}

	public static long StackList(String[] commands){
		//TODO Run Commands on StackList
		
		long start = System.currentTimeMillis();
		
		StackLi stackList = new StackLi(); //new StackList initialized
		
		for(int i =0; i < commands.length; i++)
		{
			String com = commands[i];
			Integer num = Integer.parseInt(com.substring(1));
			if(com.startsWith("i"))
				stackList.push(num); //insertion method for StackList
			else
				stackList.pop(); //deletion method for StackList
		}
		
		long end = System.currentTimeMillis();
		
		return end-start;
	}
	
	public static long QueueList(String[] commands) {
		//TODO Run Commands on QueueList
		
		long start = System.currentTimeMillis();
		
		QueueLi queueList = new QueueLi(); //new QueueList initialized
		
		for(int i =0; i < commands.length; i++)
		{
			String com = commands[i];
			Integer num = Integer.parseInt(com.substring(1));
			if(com.startsWith("i"))
				queueList.enqueue(num); // insertion method for QueueList
			else
				queueList.dequeue();  // deletion method for QueueList
		}
		
		long end = System.currentTimeMillis();
		
		return end-start;	
	}
	
	public static long ArrayList(String[] commands) {
		//TODO Run Commands on ArrayList

		long start = System.currentTimeMillis();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); //new ArrayList initialized
		
		for(int i =0; i < commands.length; i++)
		{
			String com = commands[i];
			Integer num = Integer.parseInt(com.substring(1));
			if(com.startsWith("i"))
				arrayList.add(num); //insertion method for ArrayList
			else
				arrayList.remove(num);  //deletion method for ArrayList
		}
		
		long end = System.currentTimeMillis();
		
		return end-start;	
	}
	
	public static long array(String[] commands) {
		//TODO Run Commands on array
		
		long start = System.currentTimeMillis();
		
		Integer[] array = new Integer[250000]; // new array of size 250000 initialized
		
		for(int i =0; i < commands.length; i++)
		{
			int indCount = 0;  // counter to know the next available index to insert
			String com = commands[i];
			Integer num = Integer.parseInt(com.substring(1));
			if(com.startsWith("i")) {
				array[indCount] = num;  // insertion number at the next available index
				indCount++; // adjust next available index 
			}
			else {
				for(int j = 0; j < array.length; j ++) {  // loop through the whole array
					if(array[j]==num) // look for the specific number 
						array[j]=-1; // this deletion is just changed that value to -1
				}
			}
		}
		
		long end = System.currentTimeMillis();
		
		return end-start;	
	}	
	
}
