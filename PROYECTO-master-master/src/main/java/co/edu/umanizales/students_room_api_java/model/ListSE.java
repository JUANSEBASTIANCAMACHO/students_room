package co.edu.umanizales.students_room_api_java.model;

import lombok.Data;

@Data
public class ListSE {
    private co.edu.umanizales.students_room_api_java.model.Node head;
    private int count;

    public void add(co.edu.umanizales.students_room_api_java.model.Pet pet){
        if (this.head ==null)
        {
            this.head = new co.edu.umanizales.students_room_api_java.model.Node(pet);
        }
        else
        {
            co.edu.umanizales.students_room_api_java.model.Node temp = this.head;
            while(temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            //Parado en el último
            temp.setNext(new co.edu.umanizales.students_room_api_java.model.Node(pet));
        }
        count++;
    }

    public void addToStart(co.edu.umanizales.students_room_api_java.model.Pet pet)
    {
        if( head == null)
        {
            head = new co.edu.umanizales.students_room_api_java.model.Node(pet);
        }
        else
        {
            co.edu.umanizales.students_room_api_java.model.Node newNode= new co.edu.umanizales.students_room_api_java.model.Node(pet);
            newNode.setNext(head);
            head = newNode;
        }
        count++;
    }

    public void addToPosition(int position, co.edu.umanizales.students_room_api_java.model.Pet pet) throws Exception
    {
        if(position>0 && position <= this.count+1)
        {
            if (position==1)
            {
                this.addToStart(pet);
            }
            else
            {
                co.edu.umanizales.students_room_api_java.model.Node temp = head;
                int count =1;
                while(temp != null)
                {
                    if(count == position -1)
                    {
                        co.edu.umanizales.students_room_api_java.model.Node newNode = new co.edu.umanizales.students_room_api_java.model.Node(pet);
                        newNode.setNext(temp.getNext());
                        temp.setNext(newNode);
                        this.count++;
                        break;
                    }
                    temp = temp.getNext();
                    count++;
                }
            }
        }
        else
        {
            throw new Exception("La posición no es válida");
        }
    }

    public void deleteToPosition(int position) throws Exception
    {
        if(position>0 && position <= this.count)
        {
            if (position==1)
            {
                this.head = this.head.getNext();
                this.count--;
            }
            else
            {
                co.edu.umanizales.students_room_api_java.model.Node temp = head;
                int count =1;
                while(temp != null)
                {
                    if(count == position -1)
                    {
                        temp.setNext(temp.getNext().getNext());
                        this.count--;
                        break;
                    }
                    temp = temp.getNext();
                    count++;
                }
            }
        }
        else
        {
            throw new Exception("La posición no es válida");
        }
    }

    public void deleteById(String id) throws Exception
    {
        co.edu.umanizales.students_room_api_java.model.Node temp = head;
        while(temp.getNext() != null)
        {
            if(temp.getNext().getData().getId().equals(id))
            {
                temp.setNext(temp.getNext().getNext());
                int existing_id = 0;

                if(existing_id != 0)
                {
                    throw new Exception("El id introducido no existe.");
                }
                this.count--;
            }
            temp = temp.getNext();
        }
    }

}
