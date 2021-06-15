import java.util.*; 
public class UserInput {

    static int intResult; 
    static char charResult;
    static Scanner input = new Scanner (System.in);


    public static int getInt(int min,  int max) {
        while (true) {
            int intValue = input.nextInt();
            if ( intValue >= min  && intValue <= max) {
                intResult = intValue;
            
            
        } else {
           System.out.println("hey you! pick a number between 1-100");
           intResult = getInt(min, max);
        }
    
        return intResult;
    }
    }

    public static int getInt() {
        int intValue = input.nextInt();

        return intValue;
    }

    public static char getChar() {
        char charValue = input.next().charAt(0);

        return  charValue;
    }

    public static char getChar(char min,  char max) {
        char charValue = input.next().charAt(0);
            if ( charValue >= min  && charValue <= max) {
                charResult = charValue;
            
            
        } else {
           System.out.println("hey you! pick a letter between A -Z");
        }
        return charResult;
    }


}
