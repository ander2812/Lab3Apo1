package ui;

import model.*;

import java.util.Scanner;

public class Main {

    private static Company concessionaire;

     static Scanner r = new Scanner (System.in);

     public void welcomeMsg() {
        System.out.println("\n\nBIENVENIDO AL MEJOR CONSECIONARIO PARA ADQUIRIR SU VEHICULO \n");

        System.out.println("********************************************************************");
        System.out.println("********************* Car concessionaire S.A ************************");
        System.out.println("********************************************************************\n\n");

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

        Sellers client[] = new Sellers[quantity];

        r.nextLine();

         int numclient = 0;

        for (int i=0; i<10; i++) {

            if (AddClient()==true){
                
            System.out.println("Cual es el nombre del cliente no. " + (numclient + 1) + "?");
            String name = r.nextLine();
            System.out.println("Cual es el Apellido del cliente no. " + (numclient + 1) + "?");
            String lastName = r.nextLine();
            System.out.println("Cual es el ID " + (numclient + 1) + "?");
            String id = r.nextLine();
            

            client[numclient] = new Sellers(name, lastName, id );

            numclient++;

        
        }else{System.out.println("gracias por utilizar nuestros servicios");}
            

        }

        concessionaire.setClients(client);

        
        
    }

    public void Menu(){

        int opt;

        System.out.println(" que vendedor desea agregarle el cliente? /n (1) Paola (2) Camilo (3) Arturo (4) Andrea (5) Anderson");
        opt=r.nextInt();


        switch(opt){

            case 1:


            seller[1].getclients[i];


        }


    }

    public static void main(String[] args) {

        Main theMain= new Main();

        theMain.welcomeMsg();

        theMain.init();


    }




}