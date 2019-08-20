package Stack;

import javax.swing.*;
import java.util.Scanner;

public class Stack {
    private ListNode top;
    private int stackSize;

    private class ListNode{
        private ListNode nextField;
        private int dataFiled;

//        Class constructor
        public ListNode(int data)
        {
            this.dataFiled=data;
        }

    }

//    Class constructor
    public Stack()
    {
        top=null;
        stackSize=0;

    }

//    Size method
    public int getStackSize()
    {
        return stackSize;
    }

//    checking if stack is empty
    public boolean isEmpty()
    {
        return stackSize==0;
    }

//    Pushing item onto the stack

    public void Push(int vaL)
    {
        ListNode tempNode= new ListNode(vaL);
        tempNode.nextField=top;
        top=tempNode;
        stackSize+=1;

    }

    public void DisplayStack()
    {
        ListNode currentNode=top;
        while(currentNode!=null)
        {
            System.out.print(currentNode.dataFiled +" --> ");
            currentNode=currentNode.nextField;
        }
        System.out.println("null");
    }

    public static void main (String args[])
    {
//        Creating a stack object
        Stack myStack= new Stack();
        Scanner userInput= new Scanner(System.in);
        System.out.print("Enter element to push onto stack: ");
        int userVal=userInput.nextInt();
        myStack.Push(userVal);
        myStack.DisplayStack();
    }

}
