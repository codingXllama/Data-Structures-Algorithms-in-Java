package DoublyLinkedList;

public class DoublyLinkedList {

//  Each DoublyLinkedList contains the head and tail ptr.
    private ListNode headPtr;
    private ListNode tailPtr;
    private int length;


    private class ListNode{

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

}
