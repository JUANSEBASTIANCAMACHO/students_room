package co.edu.umanizales.students_room_api_java.controller;

import co.edu.umanizales.students_room_api_java.model.ListSeCirc;
import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import co.edu.umanizales.students_room_api_java.service.ListSeCircService;
import co.edu.umanizales.students_room_api_java.service.ListSeService;
import co.edu.umanizales.students_room_api_java.service.ListSeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/listseC")
public class ListSeCircController {
    @Autowired
    private ListSeCircService listSeCircService;
    @PostMapping
    public String createPet(@RequestBody Pet pet)
    {
        return listSeCircService.add(pet);
    }
    @GetMapping(path = "/petsQuantityOfFleas")
    public List<String> getPetQuantityOfFleas()
    {
        return listSeCircService.getPetQuantityOfFleas();
    }
}
