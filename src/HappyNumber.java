import java.util.Random;

public class HappyNumber {
private int x;

public int setRandomNumber() {
	Random num = new Random();
	x = num.nextInt(21)+1;
	return x;
}
}
