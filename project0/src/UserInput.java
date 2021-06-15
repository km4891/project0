import java.util.*; 
public class UserInput {

    static int result; 
    static Scanner input = new Scanner (System.in);


    public static int getInt(int min,  int max) {
        int intValue = input.nextInt();
            if ( intValue >= min  && intValue <= max) {
                result = intValue;
            
            
        } else {
           System.out.println("hey you! pick a number between 1-100");
        }
        return result;
    }

    public static int getInt() {
        int intValue = input.nextInt();

        return intValue;
    }

    

    


}
