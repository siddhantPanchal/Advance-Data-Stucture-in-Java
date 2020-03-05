package demoDict;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import dictionary.*;

public class Main {
	static Node n = null;
	static Dictionary dict = null;
	static BufferedReader br = null;
	public static void main(String[] args) {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		dict = new Dictionary();
		int ch = 0;
		
		do {
			System.out.println("\n1.Insert new word and its meaning : \n2.Display");
			System.out.println("Enter tour choice : ");
			try {
				ch = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.out.println("Number format error");
				break;
			}
			
			try {
				switch(ch) {
				case 1 :
					System.out.println("Enter word & its meaning : ");
					dict.insert(new Node(br.readLine(),br.readLine()));
					dict.insert(n);
					break;
				case 2:
					dict.display();
					break;
				case 10:
					System.exit(0);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}while(true);
	}

}
