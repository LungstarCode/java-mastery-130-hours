public class InstanceVar {
    private String name;

    public static void main(String[] args){
        InstanceVar obj = new InstanceVar();
        obj.name = "Lungile Mawila";
        InstanceVar obj1 = new InstanceVar();
        obj1.name = "Tshepo Serumule";

        System.out.println(obj.name);
        System.out.println(obj1.name);
        
    }


}