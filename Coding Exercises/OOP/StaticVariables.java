class StaticVar {
    private static String name;
    public static void main(String[] args){
        StaticVar name1 = new StaticVar();
        StaticVar name2 = new StaticVar();

        name1.name = "Tshepo Serumule";
        name2.name = "Lungile Mawila";

        System.out.println(name1.name);
        System.out.println(name2.name);
    }
}