import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();

		//generator.getTenRolls();
		System.out.println("\n----- Random 10 Rolls Test -----");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);


		//generator.getRandomLetter();
		System.out.println("\n----- Random Letter Test -----");
		char randomLetter = generator.getRandomLetter();
		System.out.println(randomLetter);

		//generator.generatePassword();
		System.out.println("\n----- Password Test -----");
		String password = generator.generatePassword();
		System.out.println(password);

		//generator.getNewPasswordSet(10);
		System.out.println("\n----- New Password Set Test -----");
		ArrayList<String> newPasswordSet = generator.getNewPasswordSet(10);
		System.out.println(newPasswordSet);

		 
		//generator.quickFingersArray(newPasswordSet);
		System.out.println("\n----- Shuffle Array Test -----");
		ArrayList<String> shuffledArray = generator.quickFingersArray(newPasswordSet);
		System.out.println(shuffledArray);
		

		
	}
}



