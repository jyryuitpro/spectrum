package collection;

import java.util.ArrayList;

class MyStack {

    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        int len = arrayStack.size();

        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.remove(len-1);
    }

    public ArrayList<String> getArrayStack() {
        return arrayStack;
    }

    public void setArrayStack(ArrayList<String> arrayStack) {
        this.arrayStack = arrayStack;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arrayStack=" + arrayStack +
                '}';
    }
}

public class StackTest {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        System.out.println(myStack);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}

