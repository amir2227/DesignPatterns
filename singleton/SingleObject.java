
public class SingleObject {
 
    private static SingleObject instance = new SingleObject();

    private String msg;
    
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void setMessage(String msg){
        this.msg = msg;
    }
    public String getMessage(){
        return msg;
    }

}
