
public class EndGame {

	private int p1points;
	private int p2points;
	private int players;
	public void finalResults(int player1Cash, int player2Cash, int numberOfPlayers) {
		p1points = player1Cash;
		p2points = player2Cash;
		players = numberOfPlayers;
		
		if (numberOfPlayers==2) {
		if (p1points>p2points) {
			System.out.println("Gratulacje Graczu 1! Zwyci�y�e� z wynikiem" + p1points);
		}
			else { if (p1points<p2points) {
				System.out.println("Gratulacje Graczu 2! Zwyci�y�e� z wynikiem" + p2points);	
				
			}
			else {
				System.out.println("Pora�ka, ale remisowa! Zdobyli�cie po" + p1points);
			}
		} 
		} else {
			if (p1points<=0) {
				System.out.println("Przykro mi, sko�czy�y Ci si� punkty!");
			} else {
				System.out.println("Gratulacje! Przekroczy�e� 1000 punkt�w i wygra�e�!");
			}
		}
		
	}
	}

