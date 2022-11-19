public class Stack {
    private int size;
    private Argument[] stack;
    private int head;
    public Stack(int size) {
        this.size = size;
        stack = new Argument[size];
        head = -1;
    }
    public void push(Argument arg) {
        if(head < size) stack[++head] = arg;
    }
    public Argument pop() {return stack[head--];}
}
