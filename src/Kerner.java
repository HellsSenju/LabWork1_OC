import java.util.ArrayList;
public class Kerner {
    ArrayList<SystemCall> listSysCall;
    Stack stack;

    public Kerner(Stack stack){
        this.stack = stack;
        listSysCall = new ArrayList<>();
        ArrayList<Argument> listArgs1 = new ArrayList<>();
        ArrayList<Argument> listArgs2 = new ArrayList<>();
        ArrayList<Argument> listArgs3 = new ArrayList<>();
        ArrayList<Argument> listArgs4 = new ArrayList<>();
        ArrayList<Argument> listArgs5 = new ArrayList<>();

        listArgs1.add(new Argument("path","String", "some things"));
        listArgs1.add(new Argument("nameFile","String", "some things"));
        listSysCall.add(new SystemCall("Save file", 34, listArgs1));

        listArgs2.add(new Argument("int","Integer", "4454545"));
        listArgs2.add(new Argument("namePer","String", "per1"));
        listSysCall.add(new SystemCall("Add value", 15, listArgs2));


        listArgs3.add(new Argument("R", "Integer", "10"));
        listArgs3.add(new Argument("G", "Integer", "15"));
        listArgs3.add(new Argument("B", "Integer", "20"));
        listSysCall.add(new SystemCall("Set color", 62, listArgs3));


        listArgs4.add(new Argument("time", "Float", "123.21"));
        listSysCall.add(new SystemCall("Pause process", 31, listArgs4));


        listArgs5.add(new Argument("path", "String", "D"));
        listArgs5.add(new Argument("nameFile", "String", "labWork"));
        listSysCall.add(new SystemCall("Delete file", 99, listArgs5));

    }

    public void ShowAll(){
        System.out.println("List of system calls:");
        System.out.println("<----------------------------------->");
        for(SystemCall syscall : listSysCall) {
            System.out.println("ID:" + syscall.id);
            System.out.println("NAME:" + syscall.name);
            System.out.print("LIST ARGS:  ");
            int nomer = 1;
            for(int i = 0; i < syscall.args.size() - 1; i++){
                System.out.print(nomer + ":");
                System.out.print(syscall.args.get(i).name + ",  ");
                System.out.print(syscall.args.get(i).type + ",  ");
                System.out.print(syscall.args.get(i).value);
                System.out.println();
                nomer++;
            }
            System.out.println();
        }
        System.out.println("<----------------------------------->");
    }
    public void Call(int id){
        for (SystemCall syscall : listSysCall) {
            if(syscall.id == id) {
                System.out.println("<================================================>");
                System.out.println("CALL NAME:  " + syscall.name + ",   ID:  " + syscall.id);
                for (int i = syscall.args.size() - 1; i >= 0; i--) {
                    Argument element = stack.pop();
                    if (element.type != syscall.args.get(i).type || element.name != syscall.args.get(i).name) {
                        System.out.println("ERROR --> invalid arguments <-- ERROR");
                        return;
                    }
                }
                System.out.println("CALL COMPLETED");
                return;
            }
        }
        System.out.println("<================================================>");
        System.out.println("ERROR --> call (ID: " + id + ") not found <-- ERROR");

    }



}
