package models;

public class Toolbox{

	public static final int BINARY_ZERO = 0;
	public static final int BINARY_ONE = 1;
	public static final String IS_BINARY = "El numero ingresado es Binario";
	public static final String NO_IS_BINARY = "El numero ingresado no es Binario";
	public static final char CHARACTER_POINTS = ':';
	public static final char CHARACTER_EMOTICON = 'v';
	public static final int CHARACTER_SPACE = 32;
	public static final int MIN_NUMBER = 48;
	public static final int MAX_NUMBER = 58;
	public static final int CHARACTER_SLASH = 47;
	public static final int CHARACTER_TWO_POINTS = 58;
	public static final int CHARACTER_CLOSED_INTERROGATION = 63;
	public static final int CHARACTER_PARENTHESIS = 91;
	public static final int CHARACTER_POINT = 96;


	//Part one
	public int getChar(String phrase, char character){
		int sometimesItAppears = 0;
		for (int i = 0; i <  phrase.length(); i++) {
			if (phrase.charAt(i) ==  character){
				sometimesItAppears++;
			}
		}
		return sometimesItAppears;
	}

	//Part two
	public String getBinary(String phrase){
		String isBinary = NO_IS_BINARY;
		for (int i = 0; i <  phrase.length(); i++) {
			if (BINARY_ZERO == phrase.charAt(i) || (BINARY_ONE == phrase.charAt(i))){
				isBinary = IS_BINARY;
			}else{
				isBinary = NO_IS_BINARY;
			}
		}
		return isBinary;
	}

	//Part three
	public int getNumberWord(String phrase){
		int wordNumber = 0;
		for (int i = 0; i <  phrase.length(); i++) {
			if (phrase.charAt(i) > CHARACTER_SPACE && (phrase.charAt(i) < CHARACTER_SLASH)){
				wordNumber++;
			}else if (phrase.charAt(i) > CHARACTER_TWO_POINTS && (phrase.charAt(i) < CHARACTER_CLOSED_INTERROGATION)){
				wordNumber++;
			}else if (phrase.charAt(i) > CHARACTER_PARENTHESIS && (phrase.charAt(i) < CHARACTER_POINT)){
				wordNumber++;
			}else{
				
			}

		}
		return wordNumber;
	}

	//Part four
	public int getCharV(String phrase){
		int sometimesItAppears = 0;
		for (int i = 0; i <  phrase.length(); i++) {
			if (phrase.charAt(i) ==  CHARACTER_POINTS){
				i++;
				if (phrase.charAt(i) ==  CHARACTER_EMOTICON){
					sometimesItAppears++;
				}
			}
		}
		return sometimesItAppears;
	}

	//Part five
	public int getresult(String phrase){
		int result = 0;
		for (int i = 0; i <  phrase.length(); i++) {
			if (phrase.charAt(i) > MIN_NUMBER && phrase.charAt(i) < MAX_NUMBER){
				result += i;
			}
		}
		return result;
	}

	//Part Six
	public int getNumberBigger(String phrase){
		int numberBigger = 0;
		for (int i = 0; i <  phrase.length(); i++) {
			if (phrase.charAt(i) > numberBigger){
				numberBigger = i;
			}
		}
		return numberBigger;
	}

	public static void main(String[] args) {
		Toolbox uptc = new Toolbox();
		System.out.println(uptc.getChar("Hooola", 'o'));
		System.out.println(uptc.getBinary("111002"));
		System.out.println(uptc.getNumberWord("Ingenieria de Sistemas y Computacion"));
		System.out.println(uptc.getCharV("Los mejoores: :v"));
		System.out.println(uptc.getresult("2rwt6we2"));
		System.out.println(uptc.getNumberBigger("1,2,3,"));
	}
}