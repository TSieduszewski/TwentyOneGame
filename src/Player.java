import java.util.*;
public class Player {

	private int playerNumber;
	private int bankNumber;
	private int p;
	private int b;
	private int points = 500; //na potrzeby test�w jest 100 lub 999 domy�lnie 500
	
public void setNumber(int player) {
	p = player;
	System.out.println("Graczu " + p + " podaj swoj� liczb� z zakresu 1-21");
	Scanner keyboard = new Scanner(System.in);
	playerNumber = keyboard.nextInt();
	System.out.println("");
}

public void compareNumbers(int b) {
	b = b;
	int testNumber = Math.abs(b - playerNumber);
	if (testNumber==0) {
		System.out.println("Gratulacje! Wybra�e� dok�adnie tak� sam� liczb�. Dodano 20 pkt");
		points = points + 20;
		System.out.println("");
	}
		else {
			if (testNumber<3) {
				System.out.println("Brawo! Prawie trafi�e�, ale bank uznaje Tw�j wynik. Dodano 10 pkt");
				points = points + 10;
				System.out.println("");
			}
			else {
				System.out.println("Przykro mi, nie by�e�/a� nawet blisko. Odj�to 50 pkt");
				points = points - 50;
				System.out.println("");
			}
	}
	System.out.println("Graczu " + p + " Masz obecnie " + points + " punkt�w");
	System.out.println("");
	}

public int cash() {
	
	return points;
}
}
	
	

