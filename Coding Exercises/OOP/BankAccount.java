class BankAccount{

    private static int acc_number;
    private static double acc_balance;
    private static String customer_name;
    private static String email;
    private static int phone_number;

    public void setAccountNumber(int acc){
        this.acc_number = acc;
    }

    public void setBalance(double balance){
        this.acc_balance = balance;
    }

    public void setCustomerName(String name){
        this.customer_name = name;
    }

    public void setPhoneNumber(int phone){
        if (phone.length() != 10){
            System.out.println("Invalid phone number! ")
        } else this.phone_number = phone;
    }

    public void setEmail(String mail){
        this.email = mail;
    }

    // Getters 

    public int getAccountNumber(){
        return this.acc_number;
    }

    public double getBalance(){
        return this.acc_balance;
    }

    public String getName(){
        return this.customer_name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhoneNumber(){
        return this.phone_number;
    }

    // methods 

    public static void deposit(double amount ){
        if (amount > 0 ){
            acc_balance += amount;
        } else {
            System.out.println("You can not deposit an invalid amount (negative funds)");
        }
    }

    public static void withdraw(double amount){
        if (acc_balance > amount){
            acc_balance -= amount;
        }
        else {
            System.out.println("You have insufient funds for this withdrawal, your balance is R"+ acc_balance);
        }
    }
    

}