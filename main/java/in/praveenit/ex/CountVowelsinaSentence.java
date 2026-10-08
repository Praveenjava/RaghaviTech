package in.praveenit.ex;

public class CountVowelsinaSentence {
	
	    public static void main(String[] args) {

	        String str = "I need to finish my assigenment today";

	        int count = 0;
//
//	        for (int i = 0; i < str.length(); i++) {
//
//	            char ch = str.charAt(i);
//
//	            if (ch == 'A' || ch == 'E' || ch == 'I' ||
//	                ch == 'O' || ch == 'U' ||
//	                ch == 'a' || ch == 'e' || ch == 'i' ||
//	                ch == 'o' || ch == 'u') {
//
//	                count++;
//	            }
//	        }
//
//	        System.out.println("Number of vowels: " + count);
	      //  ===================
	        
//	        int count = 0;
//
//	        for (int i = 0; i < str.length(); i++) {
//
//	            char ch = Character.toLowerCase(str.charAt(i));
//
//	            switch (ch) {
//	                case 'a':
//	                case 'e':
//	                case 'i':
//	                case 'o':
//	                case 'u':
//	                    count++;
//	                    break;
//	            }
//	        }
//
//	        System.out.println("Vowel count: " + count);
	        


	                for (int i = 0; i < str.length(); i++) {

	                    char ch = Character.toLowerCase(str.charAt(i));

	                    if ("aeiou".indexOf(ch) != -1) {
	                        count++;
	                    }
	                }

	                System.out.println("Vowel count: " + count);
	    }
	}

