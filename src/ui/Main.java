package ui;

import model.*;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    static Scanner r = new Scanner(System.in);
    Company myCompany;

    ArrayList<Vehicle> theVehicle = new ArrayList<Vehicle>();
    ArrayList<Vehicle> myVehiclesAdd = new ArrayList<Vehicle>();

    public Main() {
        myCompany = new Company("Car consesionaire S.A ", "123456789");
        welcomeMsg();

    }

    public static void main(final String[] args) {
        new Main();

    }

    public void welcomeMsg() {
        System.out.println("\n\nBIENVENIDO AL MEJOR CONSECIONARIO PARA ADQUIRIR SU VEHICULO \n");

        System.out.println("********************************************************************");
        System.out.println("********************* Car concessionaire S.A ************************");
        System.out.println("********************************************************************\n\n");

        pMenu();
        welcomeMsg();

    }

    public void pMenu() {

        int opt;

        System.out.println(
                "INGRESE UNA OPCION \n\n (1) agregar cliente (2) agregar vehiculo (3) ver registros (4) salir");
        opt = r.nextInt();

        switch (opt) {
            case 1:

                init();

                break;

            case 2:

                addVehicle();

                break;

            case 3:

                genInforme();

                break;

            case 4:
                System.out.println(
                        "-----------------------gracias por utilizar nuestros servicios-------------------------------");

                break;

        }

    }

    public void asigVehiculo(ArrayList<Vehicle> myVehiclesAdd) {
        int opt2;

        System.out.println(" ");

        System.out.println("ASIGNACION DE VEHICULO");
        System.out.println("");

        System.out.println("ingrese (1) motocicletas (2) carros");
        opt2 = r.nextInt();

        r.nextLine();

        switch (opt2) {

            case 1:

                for (int i = 0; i < myCompany.getTheVehicle().size(); i++) {

                    Vehicle myVehicle = myCompany.getTheVehicle().get(i);

                    if (myVehicle instanceof Motorcicle) {

                        Motorcicle motorcicle = (Motorcicle) myVehicle;

                        System.out.println("Motorcycle # " + i);
                        System.out.println("Marca: " + motorcicle.getBran());
                        System.out.println("Modelo :" + motorcicle.getModel());
                        System.out.println("Precio Base: " + motorcicle.getBasePrice());
                        System.out.println("Cilindraje: " + motorcicle.getDisplacement());
                        System.out.println("Placa: " + motorcicle.getPlate());
                        System.out.println("Vehiculo usado?: " + motorcicle.getNew());
                        System.out.println("El precio total es: " + motorcicle.getTotalPrice());
                        System.out.println("");

                    }

                }

                System.out.println("INGRESE EL NUMERO DEL VEHICULO EL CUAL DESEA ASIGNAR");

                int opt3 = r.nextInt();

                myVehiclesAdd.add(myCompany.getTheVehicle().get(opt3));
                r.nextLine();

                System.out.println("");

                System.out.println("desea agregar otro vehiculo ?");
                String answer = r.nextLine();

                if (answer.equalsIgnoreCase("si")) {

                    asigVehiculo(myVehiclesAdd);

                }

                break;

            case 2:

                System.out.println("");

                for (int i = 0; i < myCompany.getTheVehicle().size(); i++) {

                    Vehicle myVehicle = myCompany.getTheVehicle().get(i);

                    if (myVehicle instanceof Car) {

                        Car car = (Car) myVehicle;

                        System.out.println("Carro # " + i);
                        System.out.println("Marca: " + car.getBran());
                        System.out.println(":tipo de carro " + car.getType());
                        System.out.println("Modelo :" + car.getModel());
                        System.out.println("tipo de carro :" + car.getTypeOfCar());
                        System.out.println("Precio Base: " + car.getBasePrice());
                        System.out.println("Cilindraje: " + car.getDisplacement());
                        System.out.println("Placa: " + car.getPlate());
                        System.out.println("Vehiculo usado?: " + car.getNew());
                        System.out.println("Numero de puertas: " + car.getDoors());
                        System.out.println("Ventanas polarizadas: " + car.getPolarized());
                        System.out.println("Tipo de combustible: " + car.getTypeOfCar());
                        System.out.println("El precio total es: " + car.getTotalPrice());
                        System.out.println(" ");

                    }

                }

                System.out.println("INGRESE EL NUMERO DEL VEHICULO EL CUAL DESEA ASIGNAR");

                int opt4 = r.nextInt();
                r.nextLine();

                myVehiclesAdd.add(myCompany.getTheVehicle().get(opt4));
                r.nextLine();

                System.out.println("");

                System.out.println("desea agregar otro vehiculo ?");
                String answer2 = r.nextLine();

                if (answer2.equalsIgnoreCase("si")) {

                    asigVehiculo(myVehiclesAdd);

                }

                break;

        }

    }

    public void addVehicle() {

        int opt;

        System.out.println("ingrese el tipo de vehiculo \n (1) carro (2)motocicleta");
        opt = r.nextInt();

        switch (opt) {
            case 1:

                System.out.println("cuantos vehiculos desea agregar");
                opt = r.nextInt();

                int numVeicles = 0;

                r.nextLine();

                for (int i = 0; i < opt; i++) {

                    System.out.println("Cual es el precio del vehiculo " + (numVeicles + 1) + "?");
                    final int totalPrice = r.nextInt();
                    System.out.println("Cual es el precio base del vehiculo " + (numVeicles + 1) + "?");
                    final int basePrice = r.nextInt();
                    System.out.println("Cual es la marca del vehiculo " + (numVeicles + 1) + "?");
                    final String bran = r.nextLine();
                    r.nextLine();
                    System.out.println("por favor ingrese el modelo del vehiculo " + (numVeicles + 1) + "?");
                    final int model = r.nextInt();
                    System.out.println("por favor ingrese el cilindraje del vehiculo " + (numVeicles + 1) + "?");
                    final int displacement = r.nextInt();
                    System.out.println(
                            "por favor ingrese el kilometraje del vehiculo del vehiculo " + (numVeicles + 1) + "?");
                    final int mileaje = r.nextInt();
                    System.out.println("por favor ingrese si el vehiculo es nuevo o usado " + (numVeicles + 1) + "?");
                    final String newv = r.nextLine();
                    r.nextLine();
                    System.out.println("por favor ingrese la placa del vehiculo " + (numVeicles + 1) + "?");
                    final String plate = r.nextLine();

                    System.out.println("por favor ingrese el numero de puertas del vehiculo " + (numVeicles + 1) + "?");
                    final int doors = r.nextInt();

                    System.out.println("por favor ingrese si el vehiculo tiene ventanas polarizadas si/no "
                            + (numVeicles + 1) + "?");
                    final String polarized = r.nextLine();

                    r.nextLine();

                    System.out.println("por favor ingrese el tipo de combustible hibrido/gasolina/electrico "
                            + (numVeicles + 1) + "?");
                    final String typeOfCar = r.nextLine();

                    System.out
                            .println("por favor ingrese el tipo de vehiculo carro/camioneta " + (numVeicles + 1) + "?");
                    final String type = r.nextLine();

                    Car cars = new Car(totalPrice, basePrice, bran, model, displacement, mileaje, newv, plate, doors,
                            typeOfCar, polarized, type);

                    theVehicle.add(cars);

                    Vehicle myVehicle = myCompany.getTheVehicle().get(i);

                    if (myVehicle instanceof Car) {

                        cars = (Car) myVehicle;

                        System.out.println("Carro # " + i);
                        System.out.println("Marca: " + cars.getBran());
                        System.out.println(":tipo de carro " + cars.getType());
                        System.out.println("Modelo :" + cars.getModel());
                        System.out.println("tipo de carro :" + cars.getTypeOfCar());
                        System.out.println("Precio Base: " + cars.getBasePrice());
                        System.out.println("Cilindraje: " + cars.getDisplacement());
                        System.out.println("Placa: " + cars.getPlate());
                        System.out.println("Vehiculo usado?: " + cars.getNew());
                        System.out.println("Numero de puertas: " + cars.getDoors());
                        System.out.println("Ventanas polarizadas: " + cars.getPolarized());
                        System.out.println("Tipo de combustible: " + cars.getTypeOfCar());
                        System.out.println("El precio total es: " + cars.getTotalPrice());
                        System.out.println(" ");

                    }

                }

                break;

            case 2:

                System.out.println("cuantos vehiculos desea agregar");
                opt = r.nextInt();

                int numVeicles2 = 0;

                r.nextLine();

                for (int i = 0; i < opt; i++) {

                    System.out.println("Cual es el precio del vehiculo " + (numVeicles2 + 1) + "?");
                    final double totalPrice = r.nextDouble();
                    System.out.println("Cual es el precio base del vehiculo " + (numVeicles2 + 1) + "?");
                    final double basePrice = r.nextDouble();
                    System.out.println("Cual es la marca del vehiculo " + (numVeicles2 + 1) + "?");
                    final String bran = r.nextLine();
                    r.nextLine();
                    System.out.println("por favor ingrese el modelo del vehiculo un numero " + (numVeicles2 + 1) + "?");
                    final int model = r.nextInt();
                    System.out.println("por favor ingrese el cilindraje del vehiculo " + (numVeicles2 + 1) + "?");
                    final int displacement = r.nextInt();
                    System.out.println(
                            "por favor ingrese el kilometraje del vehiculo del vehiculo " + (numVeicles2 + 1) + "?");
                    final int mileaje = r.nextInt();
                    System.out.println("por favor ingrese si el vehiculo es nuevo o usado " + (numVeicles2 + 1) + "?");
                    final String newv = r.nextLine();
                    r.nextLine();
                    System.out.println("por favor ingrese la placa del vehiculo " + (numVeicles2 + 1) + "?");
                    final String plate = r.nextLine();
                    System.out.println("por favor ingrese el tipo de vehiculo cross/standard/deportiva/scooter "
                            + (numVeicles2 + 1) + "?");
                    final String type = r.nextLine();

                    Motorcicle motorcycles = new Motorcicle(totalPrice, basePrice, bran, model, displacement, mileaje,
                            newv, plate, type);

                    theVehicle.add(motorcycles);

                        Vehicle myVehicle1 = myCompany.getTheVehicle().get(i);

                        if (myVehicle1 instanceof Motorcicle) {

                            motorcycles = (Motorcicle) myVehicle1;

                            System.out.println("Motorcycle # " + i);
                            System.out.println("Marca: " + motorcycles.getBran());
                            System.out.println("Modelo :" + motorcycles.getModel());
                            System.out.println("Precio Base: " + motorcycles.getBasePrice());
                            System.out.println("Cilindraje: " + motorcycles.getDisplacement());
                            System.out.println("Placa: " + motorcycles.getPlate());
                            System.out.println("Vehiculo usado?: " + motorcycles.getNew());
                            System.out.println("El precio total es: " + motorcycles.getTotalPrice());
                            System.out.println("");

                        }

                }

        }

    }

    public void init() {

        r = new Scanner(System.in);

        int numclient = 0;

        System.out.println("INGRESE CLIENTE AL CUAL LE VA HACER LA COTIZACION");
        System.out.println(" ");

        System.out.println("Cual es el nombre del cliente ?");
        final String name = r.nextLine();
        System.out.println("Cual es el Apellido del cliente ?");
        final String lastName = r.nextLine();
        System.out.println("Cual es el ID " + (numclient + 1) + "?");
        final String id = r.nextLine();
        System.out.println("Cual es el numero telefonico del cliente ?");
        final String phoneNumber = r.nextLine();

        Clients client = new Clients(name, lastName, id, phoneNumber);

        asigVehiculo(client.getTheVehicle());

        System.out.println("SELECCIONE EL NUMERO DEL VENDEDOR QUE LO ATENDIO");

        sSeller(client);

    }

    public void sSeller(Clients client) {

        for (int i = 0; i < myCompany.getSeller().length; i++) {

            System.out.println("");

            System.out.println("vendedor #: " + i);
            System.out.println("Nombre: " + myCompany.getSeller()[i].getName());
            System.out.println("Apellido: " + myCompany.getSeller()[i].getLastName());

        }
        int select = r.nextInt();

        if (myCompany.getSeller()[select].canClients()) {
            myCompany.getSeller()[select].addClient(client);
        } else {
            System.out.println("este vendedor ya tiene su cupo maximo de clientes");
            sSeller(client);
        }

        System.out.println("Se ha registrado la cotacion correctamente");

        System.out.println(" ");
    }

    public void genInforme() {

        System.out.println("EL VENDEDOR QUE LO ATENDIO ES: ");

        for (int i = 0; i < myCompany.getSeller()[i].getMisClients().size(); i++) {

            Sellers mySeller = myCompany.getSeller()[i];

            if (mySeller.getMisClients().size() > 0) {

                System.out.println("vendedor #: " + i);
                System.out.println("Nombre: " + mySeller.getName());
                System.out.println("Apellido: " + mySeller.getLastName());
                System.out.println(" ");

                System.out.println("EL CLIENTE ES:");

                for (int j = 0; j < mySeller.getMisClients().size(); j++) {

                    Clients client = mySeller.getMisClients().get(i);

                    System.out.println("client # " + i);
                    System.out.println("Nombre: " + client.getName());
                    System.out.println("Apellido :" + client.getLastName());
                    System.out.println("ID: " + client.getId());
                    System.out.println("Telefono: " + client.getPhoneNumber());
                    System.out.println(" ");
                    System.out.println("EL VEHICULO ES:");

                    for (int z = 0; z < client.getTheVehicle().size(); z++) {

                        Vehicle myVehicle = client.getTheVehicle().get(i);

                        if (myVehicle instanceof Car) {

                            Car car = (Car) myVehicle;

                            System.out.println("Carro # " + i);
                            System.out.println("Marca: " + car.getBran());
                            System.out.println(":tipo de carro " + car.getType());
                            System.out.println("Modelo :" + car.getModel());
                            System.out.println("Precio Base: " + car.getBasePrice());
                            System.out.println("Cilindraje: " + car.getDisplacement());
                            System.out.println("Placa: " + car.getPlate());
                            System.out.println("Vehiculo usado?: " + car.getNew());
                            System.out.println("Numero de puertas: " + car.getDoors());
                            System.out.println("Ventanas polarizadas: " + car.getPolarized());
                            System.out.println("Tipo de combustible: " + car.getTypeOfCar());
                            System.out.println("El precio total es: " + car.getTotalPrice());
                            System.out.println("");

                            System.out.println("quiere comprar el vehiculo");

                            String resp = r.nextLine();

                            r.nextLine();

                            if (resp.equalsIgnoreCase("si")) {

                                System.out.println("el valor a pagar es " + car.getTotalPrice());
                            }

                        }
                        System.out.println(" ");

                        if (myVehicle instanceof Motorcicle) {

                            Motorcicle motorcicle = (Motorcicle) myVehicle;

                            System.out.println("Motorcycle # " + i);
                            System.out.println("Marca: " + motorcicle.getBran());
                            System.out.println("Modelo :" + motorcicle.getModel());
                            System.out.println("Precio Base: " + motorcicle.getBasePrice());
                            System.out.println("Cilindraje: " + motorcicle.getDisplacement());
                            System.out.println("Placa: " + motorcicle.getPlate());
                            System.out.println("Vehiculo usado?: " + motorcicle.getNew());
                            System.out.println("El precio total es: " + motorcicle.getTotalPrice());
                            System.out.println("");

                            System.out.println("quiere comprar el vehiculo ?");

                            String respuesta = r.nextLine();

                            r.nextLine();

                            if (respuesta.equalsIgnoreCase("si")) {

                                System.out.println("el valor a pagar es " + motorcicle.getTotalPrice());
                            }

                        }

                    }

                }

            }
        }
    }

}