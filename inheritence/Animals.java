class Animals {


    private String type;
    private String name;
    private String speed;

    public Animals(String name, String type, String speed){
        this.name = name;
        this.type = type;
        this.speed = speed;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Dog dog = new Dog();

        System.out.println("The name of the dog is "+ dog.getName());
    }
}

public class Dog extends Animals {
    public Dog(){
        super("Mill", "Puppy", "Fast");
    }
}