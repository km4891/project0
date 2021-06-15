public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("pick a number between 1-100");


        int number = UserInput.getInt(1, 100);
        
        System.out.println(number);

    }
}
