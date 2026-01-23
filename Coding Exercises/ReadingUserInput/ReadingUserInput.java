public class ReadingUserData {
    public static void main(String[] args){
        int currentYear = 2026;
        getInputFromConsole(currentYear);

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, what is your name: ");
        System.out.println("Hello " + name + " thank you for learning java");
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        return "";
    }
}