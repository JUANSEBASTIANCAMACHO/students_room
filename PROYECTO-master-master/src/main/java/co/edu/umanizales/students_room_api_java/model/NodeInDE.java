package co.edu.umanizales.students_room_api_java.model;

import lombok.Data;

@Data
public class NodeInDE {
    private Pet data;
    private NodeInDE next;
    private NodeInDE previous;

    public NodeInDE(Pet data) {
        this.data = data;
    }
}
