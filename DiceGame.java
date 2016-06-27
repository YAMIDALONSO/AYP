package models;

import java.util.Scanner;

public class DiceGame{

	public static final String WINNER = "GANADOR";
	public static final int ONE_POINT = 1;
	public static final int LIMIT_GENERATED = 7;
	private Scanner sc;
	private String firstWord;
	private String secondWord;
	private String wordRegistor = "";


	public DiceGame(){
		sc = new Scanner(System.in);
	}

	public int generateNumber(){
		System.out.println("Ingrese el numero que salio en su dado...");
		return (int) (Math.random() * (ONE_POINT - LIMIT_GENERATED) + LIMIT_GENERATED);
	}

	public int getUserNumber(){
		return sc.nextInt();
	}

	public String addLetterToWinner(){
		if (generateNumber() < getUserNumber()) {
			for (int i = 0;i < WINNER.length();i++){
				wordRegistor += WINNER.charAt(i);
			}
		}
		return wordRegistor;
	}

	public String deleteLetterToWinner(){
		if (generateNumber() > getUserNumber()){
			for (int i = 0;i < WINNER.length();i++){
				wordRegistor = WINNER.substring (0, WINNER.length() - 1);
			}
		}
		return wordRegistor;
	}


	public void reejecute(){
		if (wordRegistor != WINNER) {
			System.out.println(wordRegistor);
			generateNumber();
			getUserNumber();
			addLetterToWinner();
			deleteLetterToWinner();
		}
	}

	public String getFirstWord(String firstWord){
		return this.firstWord = firstWord;
	}

	public String getSecondWord(String secondWord){
		return this.secondWord = secondWord;
	}

	public boolean verifyLengthEqualsWords(){
		return	firstWord.length() == secondWord.length();
	}

	public boolean verifyIsAnagram(){
		boolean isAnagram = false;
		if (verifyLengthEqualsWords()){
			for (int i = 0;i < firstWord.length();i++) {
				if (firstWord.charAt(i) == secondWord.charAt(i)) {
					isAnagram = true;
				}
			}
		}
		return isAnagram;
	}

	/*public boolean orderWords(){
		char[] orderFirstword = firstWord.toCharArray();
		java.util.Arrays.sort(orderFirstword);
		String firstPhrase = new String (orderFirstword);
		char[] orderSecondword = secondWord.toCharArray();
		java.util.Arrays.sort(orderSecondword);
		String secondPhrase = new String (orderSecondword);
		return (firstPhrase.equals(secondPhrase));
	}*/


	public static void main(String[] args) {
		DiceGame t = new DiceGame();
		//t.reejecute();
		t.getFirstWord("hola");
		t.getSecondWord("luca");
		System.out.println(t.orderWords());
	}
	
}