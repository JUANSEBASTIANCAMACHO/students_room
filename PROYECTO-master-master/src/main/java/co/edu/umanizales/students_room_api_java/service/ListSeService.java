package co.edu.umanizales.students_room_api_java.service;

import co.edu.umanizales.students_room_api_java.model.ListSE;

import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public class ListSeService {
    private ListSE list = new ListSE();

    public Node getAllLinked(){
        return this.list.getHead();
    }

    public String add(Pet pet){
        this.list.add(pet);
        return "Adicionado con éxito";
    }

    public String addToStart(Pet pet){
        this.list.addToStart(pet);
        return "Adicionado con éxito";
    }

    public String addToPosition(int position, Pet pet)
    {
        try {
            this.list.addToPosition(position, pet);
            return "Adicionado con éxito";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }

    public String deleteToPosition(int position)
    {
        try {
            this.list.deleteToPosition(position);
            return "Eliminado con éxito";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }

    public String deleteById(String id)
    {
        try {
            this.list.deleteById(id);
            return "Eliminado con éxito";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }

}
