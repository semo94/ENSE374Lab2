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
}