

public class DesignPatterns{
    public static void main(String[] args){
    // singleton test
        SingleObject obj = SingleObject.getInstance();
        SingleObject obj2 = SingleObject.getInstance();
        obj.setMessage("hi");
        System.out.println(obj.getMessage());
        System.out.println(obj2.getMessage()); 
        obj2.setMessage("salam");
        System.out.println(obj.getMessage());
        System.out.println(obj2.getMessage());
    }
}