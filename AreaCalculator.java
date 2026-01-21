public class AreaCalculator {
    
    
    public static double area(double radius){
        if (radius < 0 ) return -1.0;
        double pi = 3.141592653589793d;
        return pi * (double)(Math.pow(radius , 2.0d));
    }
    
    public static double area(double x , double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        return x*y;
    }
}