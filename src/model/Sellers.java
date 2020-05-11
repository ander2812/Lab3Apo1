package model;

import java.util.ArrayList;


public class Sellers{ 

    private String name;

    private String lastName;

    private String id;

    private int totalSales;

    private Clients[] client;

    private Clients[] misClients1= new Clients[5];
    private Clients[] misClients2= new Clients[5];
    private Clients[] misClients3= new Clients[5];
    private Clients[] misClients4= new Clients[5];
    private Clients[] misClients5= new Clients[5];
    private Clients[] misClients6= new Clients[5];
    private Clients[] misClients7= new Clients[5];
    private Clients[] misClients8= new Clients[5];
    private Clients[] misClients9= new Clients[5];
    private Clients[] misClients10= new Clients[5];



     private static ArrayList<Clients> misClients;

   

    public Sellers (String name, String id, String lastName,int totalSales){

        this.name=name;
        this.id=id;

        misClients=new ArrayList<Clients>();



        
    }

    public void setClients(Clients[] client){

        this.client=client;


    }

    public Clients[] getClients(){

        return client;
    }

    public void setName(String name) {

        this.name=name;
        
    }

    public String getName(){

        return name;
    }

    public void setLastName(String lastName) {

        this.lastName=lastName;
        
    }

    public String getLastName(){

        return lastName;
    }

    public void setId(String id) {

        this.id=id;
        
    }

    public String getId(){

        return id;
    }

    public void setTotalSales(int totalSales) {

        this.totalSales=totalSales;
        
    }

    public int getTotalSales(){  

        return totalSales;
    }

    public static ArrayList<Clients> getMisClients() {
        return misClients;
    }

    public static void setMisClients(ArrayList<Clients> misClients) {
        Sellers.misClients = misClients;
    }

    public Clients[] getMisClients1() {
        return misClients1;
    }

    public void setMisClients1(Clients[] misClients1) {
        this.misClients1 = misClients1;
    }

    public Clients[] getMisClients2() {
        return misClients2;
    }

    public void setMisClients2(Clients[] misClients2) {
        this.misClients2 = misClients2;
    }

    public Clients[] getMisClients3() {
        return misClients3;
    }

    public void setMisClients3(Clients[] misClients3) {
        this.misClients3 = misClients3;
    }

    public Clients[] getMisClients4() {
        return misClients4;
    }

    public void setMisClients4(Clients[] misClients4) {
        this.misClients4 = misClients4;
    }

    public Clients[] getMisClients5() {
        return misClients5;
    }

    public void setMisClients5(Clients[] misClients5) {
        this.misClients5 = misClients5;
    }

    public Clients[] getMisClients6() {
        return misClients6;
    }

    public void setMisClients6(Clients[] misClients6) {
        this.misClients6 = misClients6;
    }

    public Clients[] getMisClients7() {
        return misClients7;
    }

    public void setMisClients7(Clients[] misClients7) {
        this.misClients7 = misClients7;
    }

    public Clients[] getMisClients8() {
        return misClients8;
    }

    public void setMisClients8(Clients[] misClients8) {
        this.misClients8 = misClients8;
    }

    public Clients[] getMisClients9() {
        return misClients9;
    }

    public void setMisClients9(Clients[] misClients9) {
        this.misClients9 = misClients9;
    }

    public Clients[] getMisClients10() {
        return misClients10;
    }

    public void setMisClients10(Clients[] misClients10) {
        this.misClients10 = misClients10;
    }





}