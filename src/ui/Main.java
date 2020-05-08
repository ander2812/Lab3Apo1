package ui;

import model.*;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {


    private Company myCompany;

    private Sellers myClients; 

    private ArrayList<Vehicle> theVehicle;

    public Main(){


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


           

                System.out.println("Cual es el precio del vehiculo ?");
                final int totalPrice  = r.nextInt();
                System.out.println("Cual es el precio base del vehiculo ?");
                final int basePrice  = r.nextInt();
                System.out.println("Cual es la marca del vehiculo ?");
                final String bran  = r.nextLine();
                System.out.println("por favor ingrese el modelo del vehiculo ?");
                final String model = r.nextLine();
                System.out.println("por favor ingrese el cilindraje del vehiculo ?");
                final int displacement = r.nextInt();
                System.out.println("por favor ingrese el kilometraje del vehiculo del vehiculo ?");
                final int mileaje = r.nextInt();
                System.out.println("por favor ingrese si el vehiculo es nuevo o usado ?");
                final boolean newv = r.nextBoolean();
                System.out.println("por facor ingrese la placa del vehiculo ?");
                final String plate = r.nextLine();

                r.nextLine();

                 Vehicle newVehicle=new Vehicle(totalPrice,basePrice,bran,model,displacement,mileaje,newv,plate);

                 theVehicle.add(newVehicle);
                 
                System.out.println(theVehicle.size());





            
                
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

        myClients.setClients(client);

        menuSeller();  



    }

    public void menuSeller(){

        int opt;

        System.out.println("ingrese a que vendedor desea asignarle el cliente /n (1) Paola (2) Camilo (3) Arturo (4) Andrea (5) Anderson ");
        
        opt=r.nextInt();

        switch (opt) {
            case 1:
           

               // if (myClients.addClient().equalsIgnoreCase("cliente asignado")) {

                    System.out.println("se le asigno al vendedor" + myCompany.getSeller()[0].getName()+ "el cliente" + myCompany.getClients()[0].getName());


                
                //} else { 
                    
               // }
                
            
            
            
                
            break;

        }



    }



    public static void main(final String[] args) {

        final Main theMain = new Main();

        theMain.welcomeMsg();

        theMain.pMenu();

    

        


    }




}