class AdvancedSwitch{
    
    public static void main(String args[]){
        String month = "XYZ";
        System.out.println(month + " is in the "+ getQouta(month) + " qouta");
    }

    public static String getQouta(String month){
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "invalid month";
        };
    }
   
}