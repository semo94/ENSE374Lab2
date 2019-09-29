import com.lab2.LinkedProgram.*;

public class ListTester {
    public static void main(String[] args) {
        // create linkedlist object and a node object
        ListElement le = new ListElement();
        LinkedList ll = new LinkedList();
        // populate data and add the element to the list
        le.setData(69);
        ll.addElement(le);
        // Retrieve the added node
        System.out.println("Retrieving node 0 from list, expecting 66...");
        System.out.println(ll.getElement(0).getData());
    }
}
