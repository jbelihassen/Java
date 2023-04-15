import java.util.ArrayList;
import java.util.Random;
public class TestPuzzle {
    
	public static void main(String[] args) {

		Puzzle generator = new Puzzle();

       //! getTenRolls

		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		

    //! getRandomLetter
        String randomLetter = generator.getRandomLetterWithArray();
        System.out.println("Random letter: " + randomLetter);
        
    //! generatePassword

        String password  =  generator.generatePassword();
        System.out.println("Password: " + password);

     //! getNewPasswordSet
        

        ArrayList<String> passwordSet = generator.getNewPasswordSet(10);
        System.out.println("PasswordSet: " + passwordSet);

	}
}
