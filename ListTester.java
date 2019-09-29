import com.lab2.LinkedProgram.*;

public class ListTester {
    public static void main(String[] args) {
        // print splash screen
        System.out.println("***************** WELCOME TO THE TEST RUNNER *****************");
        // create linkedlist object and a node object
        ListElement le = new ListElement();
        LinkedList ll = new LinkedList();
        // populate data and add the element to the list
        le.setData(69);
        ll.addElement(le);
        // Retrieve the added node
        System.out.println("Retrieving node 0 from list, expecting 69...");
        System.out.println(ll.getElement(0).getData());
        // Delete the node
        System.out.println("Deleting node 0 from list, expecting 69...");
        System.out.println(ll.deleteElement(0).getData());
        // check if the list has been emptied correctly
        System.out.println("Retrieving node from an empty list, expecting null...");
        if (ll.getElement(0) == null) {
            System.out.println("null");
        } else {
            System.out.println("not null");
        }
        // generate list with 5 elements
        System.out.println("Populating list with values 1 to 5...");
        for (int i = 1; i <= 5; i++) {
            le.setData(i);
            ll.addElement(le);
        }
        // print the generated list
        System.out.println("Printing the list starting from the head:");
        ll.printLinkedListHead();
        System.out.println("Printing the list starting from the tail:");
        ll.printLinkedListTail();
    }
}
