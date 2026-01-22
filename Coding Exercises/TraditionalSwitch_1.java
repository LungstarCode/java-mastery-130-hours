/*
    This program uses a traditiona switch statments to translates a letter into a NATO's keywprd that represents that letter
*/
class TraditionalSwitch_1 {
    public static void main(String[] args){
        char alphabet = 'A';
        char[] letters = {'A', 'B', 'C', 'D', 'E'};

        for (char letter : letters){
            alphabet = letter;
            switch (alphabet) {
                case 'A': 
                        System.out.println("The letter is "+ alphabet + " and the NATO word is Able");
                        break;
                case 'B':
                        System.out.println("The letter is "+ alphabet + " and the NATO word is Baker");
                        break;
                case 'C':
                        System.out.println("The letter is "+ alphabet + " and the NATO word is Charlie");
                        break;
                case 'D':
                        System.out.println("The letter is "+ alphabet + " and the NATO word is Dog");
                        break;
                case 'E':
                        System.out.println("The letter is "+ alphabet + " and the NATO word is Easy");;
                        break;
                default: 
                        System.out.println("The NATO word for "+ alphabet + " is not found!");
                        break;
                
            }

        }
    }
}