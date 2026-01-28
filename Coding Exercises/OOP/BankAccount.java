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
}