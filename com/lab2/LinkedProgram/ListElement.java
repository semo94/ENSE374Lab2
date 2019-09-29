package com.lab2.LinkedProgram;
public class ListElement {
    private int data;
    private ListElement next, prev;

    // class constructor
    public ListElement() {
        this.setData(0);
        this.setNext(null);
        this.setPrev(null);
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

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }
    
    public ListElement getPrev() {
        return prev;
    }
}