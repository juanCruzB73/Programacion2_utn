package tp1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        //create arrayList
        ArrayList<Object> vehicles = new ArrayList<>();
        //add obbjects to  array list
        vehicles.add(new Car("blue", 4, 300, 1.0));
        vehicles.add(new Car("blue", 4, 300, 1.0));
        vehicles.add(new Truck("blue", 6, 300, 1.0, 1000));
        vehicles.add(new Byke("blue", 2, "urban"));
        vehicles.add(new Motorcycle("blue", 2, "urban", 500, 1.0));
        //para llamar la funcion que cuenta cuantos vehiculos con x ruedas hay las ruedas tienen que ser mayores o iguales a 0
        catalog(vehicles,-1);
        //EJERCICIO 2
        Bird bird1 = new Bird("piolin",10,"masculino","canario","amarillo");
        Cat cat1 = new Cat("tom",15,"masculino","blue and white");
        Dog dog1 = new Dog("scooby",6,"masculino","brown","labrador");
        bird1.showinfo();
        bird1.doSound();
        cat1.showinfo();
        cat1.doSound();
        dog1.doSound();
        dog1.showinfo();
    }

    public static void catalog(ArrayList<Object> vehicles,int wheels) {
        int counter=0;
        if(wheels>=0){
            for(Object vehicle : vehicles){
                if (vehicle instanceof Car && ((Car) vehicle).getWheels() == wheels) {
                    counter++;
                } else if (vehicle instanceof Truck && ((Truck) vehicle).getWheels() == wheels) {
                    counter++;
                } else if (vehicle instanceof Byke && ((Byke) vehicle).getWheels() == wheels) {
                    counter++;
                } else if (vehicle instanceof Motorcycle && ((Motorcycle) vehicle).getWheels() == wheels) {
                    counter++;
                }
            }
            System.out.println("hay "+counter+" vehiculos con "+wheels+" ruedas");
        }else{
            for (Object vehicle : vehicles) {
                System.out.println(vehicle.getClass().getSimpleName());
                switch (vehicle.getClass().getSimpleName()) {
                    // Handle different types of vehicles here
                    case "Car":
                        Car car = (Car) vehicle;
                        System.out.println(" color: "+car.getColor()+
                                " wheels: "+car.getWheels()+
                                " speed: "+car.getSpeed()+
                                " displacement: "+car.getDisplacement()
                        );
                        break;
                    case "Truck":
                        Truck truck = (Truck) vehicle;
                        System.out.println(" color: "+truck.getColor()+
                                " wheels: "+truck.getWheels()+
                                " speed: "+truck.getSpeed()+
                                " displacement: "+truck.getDisplacement()+
                                " loan: "+truck.getLoan()
                        );
                        break;
                    case "Byke":
                        Byke byke = (Byke) vehicle;
                        System.out.println(" color: "+byke.getColor()+
                                " wheels: "+byke.getWheels()+
                                " type: "+byke.getType()
                        );
                        break;
                    case "Motorcycle":
                        Motorcycle motorcycle = (Motorcycle) vehicle;
                        System.out.println(" color: "+motorcycle.getColor()+
                                " wheels: "+motorcycle.getWheels()+
                                " type: "+motorcycle.getType()+
                                " speed: "+motorcycle.getSpeed()+
                                " displacement: "+motorcycle.getDisplacement()
                        );
                        break;
                }
            }
        }
    }
}