package DoublyLinkedList;

public class DoublyLinkedList {

//  Each DoublyLinkedList contains the head and tail ptr.
    private ListNode headPtr;
    private ListNode tailPtr;
    private int length;


    private class ListNode{

//      Each ListNode contains the following instance variables
        private int dataField;
        private ListNode prevPtr;
        private ListNode nextPtr;

//      Class Constructor
        public ListNode(int dataField)
        {
            this.dataField=dataField;
        }

    }

//  Creating DLL constructor
    public DoublyLinkedList()
    {
        this.headPtr=null;
        this.tailPtr=null;
        this.length=0;
    }

//  Method to check if the DLL is empty or not
    public boolean isEmpty()
    {
//        return length==0; // same as headPtr=null, which means that the headPtr is not holding any node, which means the DLL is empty.
        return  headPtr==null;
    }

//  Finding the length of the DLL
    public int getLength()
    {
        return length;
    }


//    Displaying the Nodes in the DLL from the tail
    public void insertLast(int value)
    {
        ListNode newNode = new ListNode(value);
        if(isEmpty())
        {
            headPtr=newNode;
        }
        else{
            tailPtr.nextPtr=newNode;
        }
//      Attaching the tailPtr to the newNode.prevPtr and then making the newNode to be our TailPtr
        newNode.prevPtr=tailPtr;
        tailPtr=newNode;

//      Update the DLL size
        length++;
    }


//   Displaying DLL in forward direction

    public void ForwardDisplay()
    {
//      Checking if the headPtr is empty, this tells us the DLL is empty since it's not holding any nodes
        if(headPtr==null)
        {
            return;
        }
        ListNode tempNode=headPtr;
        while (tempNode!=null)
        {
            System.out.print(tempNode.dataField+" => ");
            tempNode=tempNode.nextPtr;
        }
        System.out.print("null");
    }


    public static void  main(String[] args)
    {
    DoublyLinkedList myDLL = new DoublyLinkedList();
    myDLL.insertLast(1);
    myDLL.insertLast(2);
    myDLL.ForwardDisplay();
    }

}
