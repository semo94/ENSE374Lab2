public class ListElement {
    private int data;
    private ListElement next;

    // class constructor
    public ListElement() {
        this.setData(0);
        this.setNext(null);
    }

    // define getters and setters
    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getNext() {
        return next;
    }
}