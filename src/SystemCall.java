import java.util.ArrayList;

public class SystemCall {
    public String name;
    public int id;
    public ArrayList<Argument> args;
    public SystemCall(String name, int id, ArrayList<Argument> args){
        this.name = name;
        this.id = id;
        this.args = args;
    }
}
