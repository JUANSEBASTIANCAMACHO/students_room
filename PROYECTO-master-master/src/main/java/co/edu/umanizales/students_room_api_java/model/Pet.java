package co.edu.umanizales.students_room_api_java.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
    private String id;
    private String name;
    private byte age;
    private String gender;
    private String quantityOfFleas;
}
