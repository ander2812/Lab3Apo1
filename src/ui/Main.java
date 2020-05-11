package ui;

import model.*;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    private Company myCompany;

    public Main() {

        myCompany = new Company("Car consesionaire S.A ", "123456789");

    }

    static Scanner r = new Scanner(System.in);

    public void welcomeMsg() {
        System.out.println("\n\nBIENVENIDO AL MEJOR CONSECIONARIO PARA ADQUIRIR SU VEHICULO \n");

        System.out.println("********************************************************************");
        System.out.println("********************* Car concessionaire S.A ************************");
        System.out.println("********************************************************************\n\n");

    }

    public void pMenu() {

        int opt;

        System.out.println("ingrese una opcion /n (1) agregar cliente (2) agregar vehiculo");
        opt = r.nextInt();

        switch (opt) {
            case 1:

                init();

                System.out.println("");

                 asigVehiculo();

                break;

            case 2:

                addVehicle();

                break;

        }

    }

    public void asigVehiculo() {

        String opt;
        int opt2;
        int opt3;
        String opt4;

        System.out.println("desea asignar un vehiculo a al cliente ?");
        opt = r.nextLine();


        if (opt.equalsIgnoreCase("si")) {

            r.nextLine();

            System.out.println("ingrese (1) motocicletas (2) carros");
            opt2 = r.nextInt();

            r.nextLine();

            switch (opt2) {

                case 1:

                    break;

                case 2:

                    System.out.println("ingrese el nombre del cliente");
                    opt = r.nextLine();
                    r.nextLine();

                    System.out.println("ingrese el modelo del vehiculo");
                    opt3 = r.nextInt();
                    r.nextLine();

                    System.out.println("ingrese la marca del vehiculo");
                    opt4 = r.nextLine();

                    for (int i = 0; i < 10 ; i++) {

                        if (myCompany.getClients()[i].getName().equalsIgnoreCase(opt)
                                && myCompany.getMyVehicles().get(i).getModel() == opt3
                                && myCompany.getMyVehicles().get(i).getBran().equalsIgnoreCase(opt4)) {

                            System.out.println("se le asigno el vehiculo " + myCompany.getMyVehicles().get(i)
                                    + " al cliente " + myCompany.getClients()[i]);

                        }

                    }

                    break;

            }

        }

    }

   public void addVehicle() {

        int opt;

         ArrayList<Vehicle> theVehicle=new ArrayList<Vehicle>();
 

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

                    System.out.println("por favor ingrese si el vehiculo tiene ventanas polarizadas si/no " + (numVeicles + 1) + "?");
                    final String polarized = r.nextLine();

                    r.nextLine();

                    System.out.println("por favor ingrese el tipo de vehiculo carro/camioneta " + (numVeicles + 1) + "?");
                    final String typeOfCar = r.nextLine();

                    Car car = new Car(totalPrice, basePrice, bran, model, displacement, mileaje, newv, plate, doors,
                            typeOfCar, polarized);

                    theVehicle.add(car);

                    numVeicles++;

                }

                myCompany.setMyVehicles(theVehicle);

                for (int j = 0; j < theVehicle.size(); j++) {

                    System.out.println("se agregaron los vehiculos \n " + myCompany.getMyVehicles().get(j));

                }

                break;

            case 2:

                System.out.println("ingrese el tipo de vehiculo \n (1) carro (2)motocicleta");
                opt = r.nextInt();

                switch (opt) {
                    case 1:

                        System.out.println("cuantos vehiculos desea agregar");
                        opt = r.nextInt();

                        int numVeicles2 = 0;

                        r.nextLine();

                        for (int i = 0; i < opt; i++) {

                            System.out.println("Cual es el precio del vehiculo " + (numVeicles2 + 1) + "?");
                            final int totalPrice = r.nextInt();
                            System.out.println("Cual es el precio base del vehiculo " + (numVeicles2 + 1) + "?");
                            final int basePrice = r.nextInt();
                            System.out.println("Cual es la marca del vehiculo " + (numVeicles2 + 1) + "?");
                            final String bran = r.nextLine();
                            r.nextLine();
                            System.out.println("por favor ingrese el modelo del vehiculo un numero " + (numVeicles2 + 1) + "?");
                            final int model = r.nextInt();
                            System.out
                                    .println("por favor ingrese el cilindraje del vehiculo " + (numVeicles2 + 1) + "?");
                            final int displacement = r.nextInt();
                            System.out.println("por favor ingrese el kilometraje del vehiculo del vehiculo "
                                    + (numVeicles2 + 1) + "?");
                            final int mileaje = r.nextInt();
                            System.out.println(
                                    "por favor ingrese si el vehiculo es nuevo o usado " + (numVeicles2 + 1) + "?");
                            final String newv = r.nextLine();
                            r.nextLine();
                            System.out.println("por favor ingrese la placa del vehiculo " + (numVeicles2 + 1) + "?");
                            final String plate = r.nextLine();
                            System.out.println("por favor ingrese el tipo de vehiculo cross/standard/deportiva/scooter "
                                    + (numVeicles2 + 1) + "?");
                            final String typeMotorcicle = r.nextLine();

                            Motorcicle motorcycle = new Motorcicle(totalPrice, basePrice, bran, model, displacement,
                                    mileaje, newv, typeMotorcicle, plate);

                            theVehicle.add(motorcycle);

                            numVeicles2++;

                        }

                       myCompany.setMyVehicles(theVehicle);

                        for (int j = 0; j < theVehicle.size(); j++) {

                            Vehicle e=theVehicle.get(j);

                            System.out.println(e.getBran());

                        } 

                        break;

                }

        }

    }

    public void init() {

        r = new Scanner(System.in);

        int quantity;

        System.out.println("Por favor ingrese cuantos clientes desea agregar: \n");

        quantity = r.nextInt();

        final Clients client[] = new Clients[quantity];

        r.nextLine();

        int numclient = 0;

        for (int i = 0; i < client.length; i++) {

            System.out.println("Cual es el nombre del cliente no. " + (numclient + 1) + "?");
            final String name = r.nextLine();
            System.out.println("Cual es el Apellido del cliente no. " + (numclient + 1) + "?");
            final String lastName = r.nextLine();
            System.out.println("Cual es el ID " + (numclient + 1) + "?");
            final String id = r.nextLine();
            System.out.println("Cual es el numero telefonico del cliente " + (numclient + 1) + "?");
            final String phoneNumber = r.nextLine();

            client[numclient] = new Clients(name, lastName, id, phoneNumber);

            numclient++;

        }

        myCompany.setClients(client);

        

        

        int opt;

        System.out.println(
                "ingrese a que vendedor desea asignarle el cliente \n (1) Paola (2) Camilo (3) Arturo (4) Andrea (5) Anderson (6) Carlos (7) Joe The Champion (8) Juan (9) Esteban (10) Mafe ");

        opt = r.nextInt();

        switch (opt) {
            case 1:
            

                myCompany.getSeller()[0].setMisClients1(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[0].getName()
                            + " el clientes " + myCompany.getSeller()[0].getMisClients1()[i].getName());

                }

                break;

                

            case 2:

                myCompany.getSeller()[1].setMisClients2(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[1].getName() + " el cliente " + myCompany.getSeller()[1].getMisClients2()[i].getName());

                }

                break;

            case 3:

                myCompany.getSeller()[2].setMisClients3(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[2].getName()
                            + " el cliente " + myCompany.getSeller()[2].getMisClients3()[i].getName());

                }

                break;

            case 4:

            myCompany.getSeller()[3].setMisClients4(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[3].getName()
                            + " los clientes " + myCompany.getSeller()[3].getMisClients4()[i].getName());

                }

                break;

            case 5:

            myCompany.getSeller()[4].setMisClients5(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[4].getName()
                            + " los clientes " + myCompany.getSeller()[4].getMisClients5()[i].getName());

                }

                break;

            case 6:

            myCompany.getSeller()[5].setMisClients6(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[5].getName()
                            + " los clientes " + myCompany.getSeller()[5].getMisClients6()[i].getName());

                }

                break;

            case 7:

            myCompany.getSeller()[6].setMisClients7(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[6].getName()
                            + " los clientes " + myCompany.getSeller()[6].getMisClients7()[i].getName());

                }

                break;

            case 8:

            myCompany.getSeller()[7].setMisClients8(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[7].getName()
                            + " los clientes " + myCompany.getSeller()[7].getMisClients8()[i].getName());

                }

                break;

            case 9:

            myCompany.getSeller()[8].setMisClients9(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[8].getName()
                            + " los clientes " + myCompany.getSeller()[8].getMisClients9()[i].getName());

                }

                break;

            case 10:

            myCompany.getSeller()[9].setMisClients10(client);

                for (int i = 0; i < client.length; i++) {

                    System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[9].getName()
                            + " los clientes " + myCompany.getSeller()[9].getMisClients10()[i].getName());

                }

                break;






        }

    }

    public void asignClient(){

        


    }

    public static void main(final String[] args) {

        final Main theMain = new Main();

        theMain.welcomeMsg();

       theMain.pMenu();

    }

}