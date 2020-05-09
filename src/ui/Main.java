package ui;

import model.*;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {


    private Company myCompany;

    public Main(){

        myCompany=new Company("Car consesionaire S.A ", "123456789");


    }
    

     static Scanner r = new Scanner (System.in);

     public void welcomeMsg() {
        System.out.println("\n\nBIENVENIDO AL MEJOR CONSECIONARIO PARA ADQUIRIR SU VEHICULO \n");

        System.out.println("********************************************************************");
        System.out.println("********************* Car concessionaire S.A ************************");
        System.out.println("********************************************************************\n\n");

    }

    public void  pMenu(){

        int opt;

        System.out.println("ingrese una opcion /n (1) agregar cliente (2) agregar vehiculo");
        opt=r.nextInt();
        

        switch (opt) {
            case 1:

                init();
               


                
            break;

            case 2:

            System.out.println("cuantos vehiculos desea agregar");
            opt=r.nextInt();

            int numVeicles=0;

            final ArrayList<Vehicle> theVehicle;

            theVehicle = new ArrayList<Vehicle>(opt);

            r.nextLine();

            for (int i = 0; i < opt ; i++) {

                System.out.println("Cual es el precio del vehiculo ?");
                final int totalPrice  = r.nextInt();
                System.out.println("Cual es el precio base del vehiculo ?");
                final int basePrice  = r.nextInt();
                System.out.println("Cual es la marca del vehiculo ?");
                final String bran  = r.nextLine();
                r.nextLine();
                System.out.println("por favor ingrese el modelo del vehiculo ?");
                final String model = r.nextLine();
                System.out.println("por favor ingrese el cilindraje del vehiculo ?");
                final int displacement = r.nextInt();
                System.out.println("por favor ingrese el kilometraje del vehiculo del vehiculo ?");
                final int mileaje = r.nextInt();
                System.out.println("por favor ingrese si el vehiculo es nuevo o usado ?");
                final boolean newv = r.nextBoolean();
                System.out.println("por favor ingrese la placa del vehiculo ?");
                final String plate = r.nextLine();

               

                 Vehicle newVehicle=new Vehicle(totalPrice,basePrice,bran,model,displacement,mileaje,newv,plate);

                 theVehicle.add(newVehicle);

                 numVeicles++;

                 

                
            }

            myCompany.getSeller()[0].getClients()[0].setMyVehicles(theVehicle);

            for (int j = 0; j < theVehicle.size(); j++) {

                System.out.println("se agregaron los vehiculos "+ myCompany.getSeller()[0].getClients()[0].getMyVehicles().get(j));
                
            }

            

            

               
                 //myCompany.getSeller()[0].getVehicles()[0].setMyVehicles(newVehicle);
                





            
                
        }


        



    }

    public static boolean AddClient(){

        boolean add;
        String answer;

        System.out.println("desea agregar un cliente ?");
        answer=r.nextLine();

        if (answer.equalsIgnoreCase("si")){

            add=true;

            

            return add;

            
        }else{
            
            add=false;

            return false;
        
        }


        


    }

    public static boolean AddClient2(){

        boolean add;
        String answer;

        System.out.println("desea agregar otro cliente ?");
        answer=r.nextLine();

        if (answer.equalsIgnoreCase("si")){

            add=true;

            

            return add;

            
        }else{
            
            add=false;

            return false;
        
        }


        


    }


    

    public void init() {

        r = new Scanner(System.in);

        int quantity;
        
        
        System.out.println("Por favor agrege cuantos clientes desea agregar: \n");

        quantity=r.nextInt();

        final Clients client[] = new Clients[quantity];

        r.nextLine();

        int numclient = 0;

        for (int i = 0; i < client.length; i++) {

            //if (AddClient() == true) {

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

            //} else { 

               // System.out.println("gracias por utilizar nuestros servicios");
           // }

        }

        

        int opt;

        System.out.println("ingrese a que vendedor desea asignarle el cliente /n (1) Paola (2) Camilo (3) Arturo (4) Andrea (5) Anderson ");
        
        opt=r.nextInt();

        switch (opt) {
            case 1:

             myCompany.getSeller()[0].setClients(client);

             for (int i = 0; i < client.length; i++) {

                System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[0].getName()+ " el clientes " + myCompany.getSeller()[0].getClients()[i].getName());
                 
             }

             break;

            case 2:

            myCompany.getSeller()[1].setClients(client);

            for (int i = 0; i < client.length; i++) {

                System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[1].getName()+ " el cliente " + myCompany.getSeller()[1].getClients()[i].getName());

                
            }

            
            break;

            case 3:

             myCompany.getSeller()[2].setClients(client);

             for (int i = 0; i < client.length; i++) {

                System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[2].getName()+ " el cliente " + myCompany.getSeller()[2].getClients()[i].getName());
                 
             }

             break;

             case 4:

             myCompany.getSeller()[3].setClients(client);

             for (int i = 0; i < client.length; i++) {

                System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[3].getName()+ " los clientes " + myCompany.getSeller()[3].getClients()[i].getName());
                 
             }

             break;

             case 5:

             myCompany.getSeller()[4].setClients(client);

             for (int i = 0; i < client.length; i++) {

                System.out.println(" se le asigno al vendedor " + myCompany.getSeller()[4].getName()+ " los clientes " + myCompany.getSeller()[4].getClients()[i].getName());
                 
             }

             break;



        }



    }

   


    public static void main(final String[] args) {

        final Main theMain = new Main();

        theMain.welcomeMsg();

        theMain.pMenu();

    

        


    }




}