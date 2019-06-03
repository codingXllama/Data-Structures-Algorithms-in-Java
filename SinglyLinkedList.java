import java.util.List;

public class SinglyLinkedList {
    private ListNode headNode;

    private static class ListNode {
        private int dataField;
        private ListNode nextNode;

        //Creating the constructor for ListNode - this allows us to create Nodes for our Linked list
        public ListNode(int data) {
            dataField = data;
            this.nextNode = null;
        }
    }

    /*
        1->3->15->6-->20


     */

    public void DisplayLinkedList() {
//Displaying the SinglyLinked list linkedList elements
        ListNode currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.dataField + " --> ");
            currentNode = currentNode.nextNode;
        }
        System.out.print("null ");
    }

    public int LinkedListSize() {

        //checking if the headNode is empty
        if (headNode == null) {
            return 0;
        }

        ListNode currentNode = headNode;
        int listSizeCounter = 0;
        while (currentNode != null) {
            listSizeCounter += 1;
            currentNode = currentNode.nextNode;
        }
        return listSizeCounter;
    }


    public void InsertFront(int newNodeValue) {
        //ListNode tempNode = headNode;
        ListNode newNode = new ListNode(newNodeValue);
        newNode.nextNode = headNode;
        headNode = newNode;
    }


    public static void main(String[] args) {
//      Creating a SinglyLinked list object and nodes for the SinglyLinked list
        SinglyLinkedList linkListObject = new SinglyLinkedList();
        linkListObject.headNode = new ListNode(1);
        ListNode firstNode = new ListNode(3);
        ListNode secondNode = new ListNode(15);
        ListNode thirdNode = new ListNode(6);
        ListNode fourthNode = new ListNode(20);


//      Connecting all the nodes together by linking each nextNode field with the dataField
        linkListObject.headNode.nextNode = firstNode; //1->3
        firstNode.nextNode = secondNode;//1->3->15
        secondNode.nextNode = thirdNode;//1->3->15->6
        thirdNode.nextNode = fourthNode;//1->3->15->6->null

        //        Adding a new Node value in the beginning of linked list
        linkListObject.InsertFront(21);
        linkListObject.InsertFront(89);


//      Displaying the Singly Linked list by calling the DisplayLinkedList method on the LinkedList object
        linkListObject.DisplayLinkedList();


//       Displaying the size of the linkedList by calling the
        System.out.println("\nThe linked list size is: " + linkListObject.LinkedListSize());

    }


}
