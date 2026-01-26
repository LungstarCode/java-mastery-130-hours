class IntEqualityPrinter {
    // write your code here!
   
    public static void printEqual(int x, int y, int z){
        // condition that checks if the parameters are corect and displays a message!
        if (x < 0 || y < 0 || z < 0) System.out.println("Invalid Value");
        else if (x == y && y == z) System.out.println("All numbers are equal");
        else if (x != y && y != z && x != z) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}
