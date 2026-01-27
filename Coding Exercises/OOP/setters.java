public class Setters {

    private static String name;
    private static int age;
    private static String location;
    private static String program;


    // setter for each field
    public setName(String name ){
        this.name = name; // Assigning the passed parameter to the name field
    }

    public setAge(int age){
        if (age < 0 || age > 125){
            System.out.println("The age passes is invalid");
            this.age = -1;
        } else  this.age = age;

    }

    public setProgram(String program){
        this.program = program;
    }

    public setLocation(String location){
        this.location = location;
    }
}
