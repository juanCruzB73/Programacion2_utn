package EjerciciosRelaciones.Composicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House {
    private List<Door> doors;

    public House(int numDoors, String doorMaterial) {
        this.doors = new ArrayList<>();
        for (int i = 0; i < numDoors; i++) {
            doors.add(new Door(doorMaterial));
        }
    }

    public List<Door> getDoors() {
        return doors;
    }
}
