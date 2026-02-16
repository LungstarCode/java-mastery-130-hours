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

    public String getSpeed(){
        return speed;
    }

    public String getType(){
        return type;
    }

    public static void main(String[] args){
        Dog dog = new Dog();

        System.out.println("The name of the dog is "+ dog.getName() + " it is of type "+ dog.getType() + " and it is "+ dog.getSpeed());
    }
}

public class Dog extends Animals {
    public Dog(){
        super("Mill", "Puppy", "Fast");
    }
}