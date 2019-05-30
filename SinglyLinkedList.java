package DataStructuresAndAlgorithms;

import java.util.List;

public class SinglyLinkedList {
    // Creating the head of the list (Instance variable)
    private ListNode head;

    // Creating the Static inner ListNode class
    private static class ListNode {
        //Creating the data field
        private int data;
        //Creating the nextNode reference
        private ListNode nextNode;

        //Creating a constructor that allows us to create new listNodes
        public ListNode(int data) {
            //Setting the data field for the linked list
            this.data = data;
            //the beginning node (head node) of the list always points at null when the Linked list is empty
            this.nextNode = null;
        }
    }

    public static void main(String[] args) {
        // Once we create the SinglyLinkedList then the head will automatically be null, since there is no other ListNode attach to it
        SinglyLinkedList mySinglyLinkedList_Object = new SinglyLinkedList();
        //Creating the headNode
        mySinglyLinkedList_Object.head = new ListNode(10); // head: 10 --> nextNode: null
        // Creating the secondNode with a data value of 1
        ListNode secondNode = new ListNode(1);
        //Creating the secondNode with a data value of 2
        ListNode thirdNode = new ListNode(20);
        ListNode fourthNode = new ListNode(12);


        //Connecting all the ListNodes together to form a chain which is a singly Linked list
        //In order to form a chain we must assign the value(data field) of secondNode the data field of the headNode (mySinglyList_Object)
        mySinglyLinkedList_Object.head.nextNode=secondNode; // 10 -> 1
        secondNode.nextNode=thirdNode;  //10-> 1 -> 20
        thirdNode.nextNode=fourthNode; //10 -> 1 -> 20 -> 12 --> null

        System.out.println(fourthNode);


    }

}
