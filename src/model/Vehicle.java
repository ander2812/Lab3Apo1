package model;

import java.util.ArrayList;

public class Vehicle {

    private double totalPrice;

    private double basePrice;

    private String bran;

    private String type;

    private int model;

    private int displacement;

    private int mileaje;

    private String newv;

    private String plate;

    private Docs docs;

    private static ArrayList<Car> misCars;

    public Vehicle(double totalPrice, double basePrice, String bran, int model, int displacement, int mileaje,
            String newv, String plate, String type) {

        this.totalPrice = totalPrice;
        this.basePrice = basePrice;
        this.type = type;
        this.bran = bran;
        this.model = model;
        this.displacement = displacement;
        this.mileaje = mileaje;
        this.newv = newv;
        this.plate = plate;

        docs = new Docs(0, "", 0, 0);

        misCars = new ArrayList<Car>();

    }

    public void addCar(Car misCars) {

    }

    public String cDocuments() {

        int[][] code = new int[4][4];
        String chine, chine2, chine3, chine4, chine5, chine6, chine7, chine8 = "";

        int num, num2, num3, num4, num5, num6, num7, num8 = 0;

        String dCode = "";

        num = code[0][0];
        num2 = code[1][0];
        num3 = code[2][0];
        num4 = code[3][0];
        num5 = code[3][0];
        num6 = code[3][1];
        num7 = code[3][2];
        num8 = code[3][3];

        chine = Integer.toString(num);
        chine2 = Integer.toString(num2);
        chine3 = Integer.toString(num3);
        chine4 = Integer.toString(num4);
        chine5 = Integer.toString(num5);
        chine6 = Integer.toString(num6);
        chine7 = Integer.toString(num7);
        chine8 = Integer.toString(num8);

        dCode = chine + chine2 + chine3 + chine4 + chine5 + chine6 + chine7 + chine8;

        return dCode;

    }

    public void genDocs() {

    }

   

    public void setTotalPrice(double totalPrice) {

        this.totalPrice = totalPrice;

    }

    public double getTotalPrice() {

        return totalPrice;
    }

    public void setBasePrice(double basePrice) {

        this.basePrice = basePrice;

    }

    public double getBasePrice() {

        return basePrice;
    }

    public void setBran(String bran) {

        this.bran = bran;

    }

    public String getBran() {

        return bran;
    }

    public void setModel(int model) {

        this.model = model;

    }

    public int getModel() {

        return model;
    }

    public void setDisplacemment(int displacement) {

        this.displacement = displacement;

    }

    public int getDisplacement() {

        return displacement;
    }

    public void setMileage(int mileaje) {

        this.mileaje = mileaje;

    }

    public int getMileaje() {

        return mileaje;
    }

    public void setNew(String newv) {

        this.newv = newv;

    }

    public String getNew() {

        return newv;
    }

    public void setPlate(String plate) {

        this.plate = plate;

    }

    public String getPlate() {

        return plate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}