public class Car{

    private String make ="Omoda";
    private String model = "C5 Elegence X";
    private int year = 2025;
    private String color = "Silver Black 2 toned";


    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }

    public void printCarInfo(){
        System.out.println("The car is a "+ color + " "+ year + " "+ make + " "+ model )
    }


}