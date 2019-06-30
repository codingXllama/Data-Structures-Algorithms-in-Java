package JavaTuts;

import java.awt.*;

public class SinglyLinkedList1 {
    private ListNode headNode;

    public static class ListNode {
        private int dataField;
        private ListNode nextField;

        public ListNode(int data) {
            dataField = data;
            this.nextField = null;

        }


    }

    public void DisplayList() {
        ListNode currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.dataField + " -> ");
            currentNode = currentNode.nextField;
        }
        System.out.print("null\n");

    }

    public void RemovingDuplicates() {
        if (headNode == null) {
            return;
        }
        ListNode currentNode = headNode;
        while (currentNode != null && currentNode.nextField != null) {
            //checking if the currentNode and nextNode has the same data
            if (currentNode.dataField == currentNode.nextField.dataField) {
                currentNode.nextField = currentNode.nextField.nextField;
            }
            //if the nodes do not have the same dataField
            else {
                currentNode = currentNode.nextField;
            }
        }
    }

    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(21);
        ListNode fourthNode = new ListNode(31);

        //connecting the nodes together
        firstNode.nextField = secondNode;
        secondNode.nextField = thirdNode;
        thirdNode.nextField = fourthNode;

        //Creating a listCLass object
        SinglyLinkedList1 listObject = new SinglyLinkedList1();
        //attaching the headNodes to the SinglyLinked class objectName
        listObject.headNode = firstNode;

        //Displaying the Linked list without any removal of duplicated nodes
        System.out.print("Before the removal: ");
        listObject.DisplayList();
        System.out.print("After the removal: ");
        listObject.RemovingDuplicates();
        listObject.DisplayList();


    }
}

