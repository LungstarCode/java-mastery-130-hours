public class ReadingUserData {
    public static void main(String[] args){
        int currentYear = 2026;
        getInputFromConsole(currentYear);

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, what is your name: ");
        String year = System.console().readLine("In what year were you born: ");

        int age = currentYear - Integer.parseInt(year);

        System.out.println("So you are "+ age + " years old!");
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        return "";
    }
}