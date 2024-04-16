package EjerciciosRelaciones.Composicion;

import java.util.List;

public class Main {
    public static void main(String[] args) {

            House myHouse = new House(3, "roble");

            List<Door> houseDoors = myHouse.getDoors();
            System.out.println("Materiales de las puertas:");
            for (int i = 0; i < houseDoors.size(); i++) {
                System.out.println("Puerta " + (i + 1) + ": " + houseDoors.get(i).getMaterial());
            }
        }
    }

