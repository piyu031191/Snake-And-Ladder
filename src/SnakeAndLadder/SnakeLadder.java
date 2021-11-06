package SnakeAndLadder;

public class SnakeLadder {

	public static void main(String[] args) {
		int position1 = 0;
		int position2 = 0;
		int diceCopy1 = (int) Math.floor( (Math.random() * 10) % 6 + 1 );
		int diceCopy2 = (int) Math.floor( (Math.random() * 10) % 6 + 1 );
		System.out.println("Welcome to snake and ladder game:-");
		System.out.println("Starting position of first player is :" + position1+" "+ diceCopy1);
	    System.out.println("Starting position of second player is :" + position2+" "+ diceCopy2);
	}

}
