package driverCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import resorces.AVLTree;

public class DriverCode {

	static AVLTree avl;
	static BufferedReader br;
	public static void main(String[] args){
		avl = new AVLTree();
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int ch = 0;
		while(true) {
			System.out.println("\n1.Insert \n2.Display \n3.isBalenced \n10.Exit \nEnter your choice : ");
			try {
				ch = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.out.println("Try Again ");
			}
			
			
			switch (ch) {
			
			case 1:
				System.out.println("Enter data : ");
				
				try {
					avl.insert(Integer.parseInt(br.readLine()));
				} catch (NumberFormatException | IOException e) {
					System.out.println("Try Again ");
				}
				
				break;
				
			case 2:
				System.out.println("Sorted Data : ");
				avl.display();
				break;
				
			case 3:
				try {
					System.out.println("Search Count is : " + avl.search(Integer.parseInt(br.readLine())));
				} catch (NumberFormatException | IOException e) {
					System.out.println("Try Again ");
				}
				break;
			case 10:
				System.exit(0);
			default:
				System.out.println("Please enter valid choice ");
				break;
			}
		}
		
	}

}
