class BasicSwitch {
    int switchValue = 1;

    switch (switchValue){
        case 1: 
                System.out.println("The value was a 1");
                break;
        case 2: 
                System.out.println("The value was a 2");
                break;
        // to avoid repitation, we cause make cases share actions
        case 3: case 4: case 5:
                System.out.println("The value was a 3, 4 or 5");
                System.out.println("The value was actually a "+ switchValue);
                break;
        default:
                System.out.print("The value was not a 1, 2, 3, 4 nor a 5");

    }
}