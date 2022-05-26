package co.edu.umanizales.students_room_api_java.controller;

import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import co.edu.umanizales.students_room_api_java.service.ListDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/listde")
public class ListDeController {
    @Autowired
    private ListDeService ListDeService;

    @GetMapping
    public Node getAllLinked()
    {
        return ListDeService.getAllLinked();
    }

    @PostMapping
    public String createPet(@RequestBody Pet pet)
    {
        return ListDeService.add(pet);
    }

    @PostMapping(path="/tostart")
    public String createPetToStart(@RequestBody Pet pet){
        return ListDeService.addFirst(pet);
    }

    @GetMapping(path = "/invert")
    public String invertList() {return ListDeService.invert(); }
}
