import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
    Random rM = new Random();

    //Creates a method that returns 10 random numbers between 1 and 20 inclusive
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            rolls.add(rM.nextInt(20) + 1);
        }
        return rolls;
    }

    //creates a method that will create an array within the method that contains all 26 letters of the alphabet
    // and then shuffles the letters in the array and pulls out a random letter from the array
    // return the random letter
    public char getRandomLetter() {

        //creates an array that contains all 26 letters of the alphabet
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        //creates an iterable arraylist for the letters
        List<Character> list = new ArrayList<Character>();

        //adds all the letters to the list
        for (int i = 0; i < letters.length; i ++) {
            list.add(letters[i]);
        }

        //shuffles the letters in the list
        int randomIndex = rM.nextInt(list.size());

        //returns the random letter
        return list.get(randomIndex);
    }

    //creates a method that uses the previous method to create a random string of eight characters, and return that string
    public String generatePassword() {

        //creates a string that will hold the random string
        String ranPassword = "";

        //for loop that iterates 8 times
        for (int i = 0; i < 8; i++) {
            ranPassword += getRandomLetter();
        }

        //returns the random string
        return ranPassword;
    }

    //creates a method that takes an int length as an argument and creates an array
    // of random eight character words
    //the array should be the length passed in as an argument
    //return the array
    public ArrayList<String> getNewPasswordSet(int length) {

        //creates an arraylist that will hold the random strings
        ArrayList<String> newPasswordSet = new ArrayList<String>();

        //for loop that iterates the length of the array
        for (int i = 0; i < length; i++) {
            newPasswordSet.add(generatePassword());
        }

        //returns the array
        return newPasswordSet;
    }


    //sensei bonus
    //creates a method that takes an array and mixes up all the values in a pseudo-random order
    //return the array
    public ArrayList<String> quickFingersArray(ArrayList<String> array) {

        //creates a random number
        int randomIndex = rM.nextInt(array.size());

        //creates a temporary string
        String temp = array.get(randomIndex);

        //removes the random string from the array
        array.remove(randomIndex);

        //adds the random string to the end of the array
        array.add(temp);

        //returns the array
        return array;
    }
    
}
