package co.edu.umanizales.students_room_api_java.model;

import lombok.Data;

@Data
public class ListDE {
    private NodeInDE head;
    private int count;

    public Node enlist(){
        ListSE list = new ListSE();
        if (this.head != null) {
            NodeInDE temp = this.head;
            while (temp != null) {
                list.add(temp.getData());
                temp = temp.getNext();
            }
        }
        return list.getHead();
    }

    public void add(Pet pet) {
        if (this.head == null) {
            NodeInDE newNode = new NodeInDE(pet);
            this.head = newNode;
        }
        else {
            NodeInDE temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            NodeInDE newNode = new NodeInDE(pet);
            temp.setNext(newNode);
            newNode.setPrevious(temp);
        }
        this.count++;
    }

    public void addFirst(Pet pet) {
        if (this.head == null) {
            NodeInDE newNode = new NodeInDE(pet);
            this.head = newNode;
        }
        else {
            NodeInDE newNode = new NodeInDE(pet);
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        }
        this.count++;
    }

    public void invert() throws Exception {
        if (this.count > 1) {
            ListDE new_list = new ListDE();
            NodeInDE temp = this.head;
            while (temp != null) {
                new_list.addFirst(temp.getData());
                temp = temp.getNext();
            }
            this.head = new_list.head;
        }
        else {
            throw new Exception("La lista no tiene elementos suficientes para invertir.");
        }
    }
}
