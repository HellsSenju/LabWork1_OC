public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        Kerner kerner = new Kerner(stack);
        kerner.ShowAll();

        stack.push(new Argument("path","String", "disk C: work"));
        stack.push(new Argument("nameFile","String", "labwork"));
        kerner.Call(34);

        stack.push(new Argument("int","Integer", "4454545"));
        stack.push(new Argument("namePer","String", "per1"));
        kerner.Call(15);

        kerner.Call(65);

        stack.push(new Argument("arg1","Integer", "50"));
        stack.push(new Argument("arg2","Integer", "15"));
        stack.push(new Argument("arg3","Integer", "10"));
        stack.push(new Argument("arg4","String", "eeeeeeee"));
        kerner.Call(62);

        stack.push(new Argument("arg1","Integer", "15355"));
        kerner.Call(31);

    }
}