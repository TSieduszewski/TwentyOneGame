import java.util.*;
import javax.swing.JOptionPane;
public class MainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfPlayers;
		int p1 = 1;
		int p2 = 2;
		int b; //wylosowana liczba w zmiennej
		int player1Cash = 0;
		int player2Cash = 0;

		JOptionPane.showMessageDialog(null, "Witaj w Twenty One Game!\n"
				+ "Gra polega na odgadywaniu liczby, jak� wybra� komputer (Bank).\n"
				+ "Zasady gry: Masz 500 punkt�w. Za odgadni�cie liczby otrzymasz 20 punkt�w.\n"
				+ " Je�eli nie odgadniesz cyfry, ale b�dziesz w okolicach +/- 2, to otrzymasz 10 punkt�w.\n"
				+ "W ka�dym innym przypadku odj�te Ci zostanie 50 punkt�w.\n"
				+ "Gra ko�czy si�, gdy gracz zdob�dzie 1000 punkt�w (w trybie jednego gacza) lub gdy jeden z graczy straci wszystkie punkty (w trybie dw�ch graczy.\n"
				+ "Wersja: 0.2beta");
		System.out.println("Podaj liczb� graczy (1 lub 2)");
		Scanner keyboard = new Scanner(System.in);
		numberOfPlayers = keyboard.nextInt();
		
		HappyNumber bank = new HappyNumber();
		Player player1 = new Player();
		Player player2 = new Player();
		if (numberOfPlayers ==1) {
			do {	
			b = bank.setRandomNumber(); //wylosowanie liczby w danej rundzie
			System.out.println("Bank wybra� liczb� z zakresu 1-21");
			player1.setNumber(p1);// gracz 1 proponuje liczb�
			System.out.println("Bank wybra� liczb�: " + b);
			player1.compareNumbers(b);//por�wnanie wybranej liczby z liczb� wybran� przez bank
			} while (player1.cash()>=1 && player1.cash()<=999);
		}
		else {
			do {				//ustawi� tu prawdziwy warunek
				b = bank.setRandomNumber(); //wylosowanie liczby w danej rundzie
				System.out.println("Bank wybra� liczb� z zakresu 1-21");
				player1.setNumber(p1);// gracz 1 proponuje liczb�
				player2.setNumber(p2);// gracz 2 proponuje liczb�
				System.out.println("Bank wybra� liczb�: " + b);
				player1.compareNumbers(b);//por�wnanie wybranej liczby z liczb� wybran� przez bank
				player2.compareNumbers(b);//por�wnanie wybranej liczby z liczb� wybran� przez bank
				} while (player1.cash()>=1 && player2.cash()>=1);
		}
		player1Cash = player1.cash();
		player2Cash = player2.cash();
		
		EndGame finish = new EndGame ();
		finish.finalResults(player1Cash, player2Cash, numberOfPlayers);
		System.out.println("");
		System.out.println("Koniec gry");
	}

}
