package co.edu.umanizales.students_room_api_java.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListSeCirc {
    private Node head;
    private int count;

    public Node enlist(){
        ListSE list = new ListSE();
        if (this.head != null) {
            Node temp = this.head;
            list.add(temp.getData());
            while (temp != this.head) {
                list.add(temp.getNext().getData());
                temp = temp.getNext();
            }
        }
        return list.getHead();
    }

    public void add(Pet pet) {
        if (this.head == null) {
            this.head = new Node(pet);
            this.head.setNext(this.head);
        } else {
            Node temp = this.head;
            while (temp.getNext() != this.head) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(pet));
            temp.getNext().setNext(this.head);
        }
        this.count++;
    }

    public List<String> getPetQuantityOfFleas() {
        List<String> getPetQuantityOfFleas = new ArrayList<>();
        Node temp = this.head;
        while (temp.getNext() != this.head){
            getPetQuantityOfFleas.add(temp.getData().getGender());
            getPetQuantityOfFleas.add(temp.getData().getQuantityOfFleas());
            temp.setNext(temp.getNext());
        }
        return getPetQuantityOfFleas;
    }
}