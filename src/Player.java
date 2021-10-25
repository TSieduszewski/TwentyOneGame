import java.util.*;
public class Player {

	private int playerNumber;
	private int bankNumber;
	private int p;
	private int b;
	private int points = 500; //na potrzeby testów jest 100 lub 999 domyœlnie 500
	
public void setNumber(int player) {
	p = player;
	System.out.println("Graczu " + p + " podaj swoj¹ liczbê z zakresu 1-21");
	Scanner keyboard = new Scanner(System.in);
	playerNumber = keyboard.nextInt();
	System.out.println("");
}

public void compareNumbers(int b) {
	b = b;
	int testNumber = Math.abs(b - playerNumber);
	if (testNumber==0) {
		System.out.println("Gratulacje! Wybra³eœ dok³adnie tak¹ sam¹ liczbê. Dodano 20 pkt");
		points = points + 20;
		System.out.println("");
	}
		else {
			if (testNumber<3) {
				System.out.println("Brawo! Prawie trafi³eœ, ale bank uznaje Twój wynik. Dodano 10 pkt");
				points = points + 10;
				System.out.println("");
			}
			else {
				System.out.println("Przykro mi, nie by³eœ/aœ nawet blisko. Odjêto 50 pkt");
				points = points - 50;
				System.out.println("");
			}
	}
	System.out.println("Graczu " + p + " Masz obecnie " + points + " punktów");
	System.out.println("");
	}

public int cash() {
	
	return points;
}
}
	
	

