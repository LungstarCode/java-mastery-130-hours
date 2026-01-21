public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            int minutesPerDay = 1440;
            int minutesPerYear = 525600;

            long years = minutes / minutesPerYear;
            long remainingMinutes = minutes % minutesPerYear;
            long days = remainingMinutes / minutesPerDay;
            
            System.out.println(minutes + " min = "+ years +" y and "+ days + " d");
        }
    }
}