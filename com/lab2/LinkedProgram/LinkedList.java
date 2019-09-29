package com.lab2.LinkedProgram;
public class LinkedList {
	private ListElement head, tail, le;
    private int _nElements;

    public LinkedList() {
        le = head = tail = null;
        _nElements = 0;
    }

    public void addElement(ListElement le) {
        this.le = new ListElement();
        this.le.setData(le.getData());
        if (head == null) {
            this.head = this.tail = this.le;
        } else {
            this.tail.setNext(this.le);
            this.tail = this.le;
        }
        _nElements++;
    }

    public ListElement getElement(int index) {
        if (index > _nElements) {
            return null;
        }
        le = head;
        for (int i = 0; i < index; i++) {
            le = le.getNext();
        }
        return le;
    }

    public ListElement deleteElement(int index) {
        // check if the list is empty
        if (index > _nElements) {
            return null;
        }
        ListElement temp;
        le = head;
        temp = null;
        // interate through the list to find the element by its index
        if (index == 0) {
            head = null;
        } else {
            for (int i = 0; i < index; i++) {
                temp = le;
                le = le.getNext();
            }
        }
        // Remove the element
        if (temp != null) {
            temp.setNext(le.getNext());
        }
        _nElements--;
        temp = le;
        le = null;
        return temp;
    }
    
    public void printLinkedListHead() {
        if (head == null) {
            System.out.println("Empty list!");
            return;
        }
        le = head;
        for (int i = 0; i < _nElements - 1; i++) {
            System.out.print(le.getData() + "-->");
            le = le.getNext();
        }
        System.out.println(le.getData());
    }
}