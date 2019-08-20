package Stack;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
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
        return  stackSize==0;
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

        Scanner userInput= new Scanner(System.in);
        boolean menuExit=false;

        Stack myStack= new Stack();
        //Creating the Stack Menu.
        System.out.println("<-------- MENU --------->");
        System.out.println("Press 1 to Push Element");
        System.out.println("Press 2 to Pop Element");
        System.out.println("Press 3 to Check Stack Size");
        System.out.println("Press 4 to Check if Stack is Empty");
        System.out.println("Press 5 to Display the Stack");
        System.out.println("Press 6 to Exit Menu\n");

        while(!menuExit)
        {
            //taking user Input
            System.out.print("Your Choice: ");
            int userOption=userInput.nextInt();

            switch (userOption)
            {
                case 1:
                    System.out.print("Enter element to push onto the stack: ");
                    int userVal=userInput.nextInt();
                    myStack.Push(userVal);
                        break;
                case 2:
                case 3:
                    System.out.println("The Stack size: "+myStack.getStackSize());

                break;
                case 4:
                    if (myStack.isEmpty())
                {
                    System.out.printf("Stack is Empty\n");
                }
                else {
                    System.out.printf("The Stack is NOT Empty\n");
                }

                break;
                case 5:myStack.DisplayStack();break;
                case 6: menuExit=true; break;
                default:
                    System.out.println("Invalid option, please try again!");
                break;
            }

        }
        System.out.println("Have a good life!");

















//        Creating a stack object







    }

}
