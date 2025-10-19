package guessthenumber;

// java.util ist ein Package mit Hilfsklassen

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		int theNumber = random.nextInt(100) + 1; // + 1, damit die Zahl zwischen 1 und 100 liegt
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hallo, kannst du die Zahl zwischen 1 und 100 erraten, die ich im Kopf habe?");
		
		
		int guess = 0;
		
		while (guess != theNumber) {
			
			System.out.print("Dein Tipp: ");
			guess = scanner.nextInt();
			
			if (guess < theNumber) {
				
				System.out.println("Zu niedrig!");
				
			} else if (guess > theNumber) {
				
				System.out.println("Zu hoch!");
				
			} else {
				
				System.out.println ("Richtig! Du hast die Zahl erraten.");
			
			}
			
		}
		
		scanner.close();

	}

}
