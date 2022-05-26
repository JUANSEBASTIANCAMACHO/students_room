package co.edu.umanizales.students_room_api_java.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String identification;
    private String name;
    private double salary;
    private char gender;
    private boolean job;
    private String phone;
    //Atributos de Clase
    private static String UNIVERSITY;
}
