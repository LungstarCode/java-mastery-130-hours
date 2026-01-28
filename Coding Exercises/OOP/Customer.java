class Customer{

    private String name;
    private double creditLimit;
    public String emailAddress;

    // constructors 
    public Customer(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(){
        this("Lungile", "lungilemawila5@gmail.com", "1500.45");
    }

    public Customer(String name, String emailAddress , double creditLimit){
        this(name, emailAddress , creditLimit = 10000);
    }

    // getters 

    public void getName() {return name;}
    public void getCreditLimit(){return creditLimit;}
    public void getEmailAddress(){return emailAddress;}

}