package co.edu.umanizales.students_room_api_java.service;

import co.edu.umanizales.students_room_api_java.model.ListSE;

import co.edu.umanizales.students_room_api_java.model.ListSeCirc;
import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public class ListSeCircService {
    private ListSeCirc list = new ListSeCirc();

    public String add(Pet pet) {
        this.list.add(pet);
        return "Adicionado con éxito";
    }
    public List<String> getPetQuantityOfFleas() {
        return this.list.getPetQuantityOfFleas();
    }
}
