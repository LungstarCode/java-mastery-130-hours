class DayOfTheWeek {
    public static void main(String [] dayofweek){
        System.out.println("Today's is a "+ printDayOfWeek(0));
    }

    public static String printDayOfWeek(int day){
        return switch(day){
            case 0 -> {yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}
            default -> {yield "Invalid day";}
        };
    }
}