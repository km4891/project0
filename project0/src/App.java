public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("pick a number between 1-100");

        // int number1 = UserInput.getInt();
        int number2 = UserInput.getInt(1, 100);
        // char char1 = UserInput.getChar();
        // char char2 = UserInput.getChar("A", "Z");

        
        System.out.println(number2);
        // System.out.println(UserInput.getChar());
        // System.out.println(char2);


    }
}
