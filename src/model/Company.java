package model;

import java.util.ArrayList;

public class Company {

    private String name;

    private String id;

    private int totalProfist;

    private int totalSales;

     ArrayList<Vehicle> theVehicle;

    ArrayList<Vehicle> myVehicleAdd;

    private Sellers[] seller = new Sellers[10];

    public Company(String name, String id) {

        this.name = name;
        this.id = id;
        seller[0] = new Sellers("Paola", "12345", "Osorio", 0);
        seller[1] = new Sellers("Camilo", "12345", "Charro", 0);
        seller[2] = new Sellers("Arturo", "12345", "Rueda", 0);
        seller[3] = new Sellers("Andrea", "12345", "Osorio", 0);
        seller[4] = new Sellers("Anderson", "12345", "Rueda", 0);
        seller[5] = new Sellers("Carlos", "12345", "Rueda", 0);
        seller[6] = new Sellers("Joe", "12345", "The Champion", 0);
        seller[7] = new Sellers("Juan", "12345", "Reyes", 0);
        seller[8] = new Sellers("Esteban", "12345", "Yusunguaira", 0);
        seller[9] = new Sellers("Mafe", "12345", "Cordoba", 0);

        theVehicle = new ArrayList<Vehicle>();
        myVehicleAdd = new ArrayList<Vehicle>();
        theVehicle.add(new Car(25000000, 20000000, "chevrolet", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina",
                "si", "camioneta"));
        theVehicle.add(
                new Car(25000000, 35000000, "kia", 2019, 1600, 17000, "nuevo", "12345", 4, "electrico", "si", "sedan"));
        theVehicle.add(
                new Car(25000000, 20000000, "audi", 2019, 1600, 17000, "nuevo", "12345", 4, "hibrido", "si", "sedan"));
        theVehicle.add(new Car(25000000, 20000000, "bmw", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina", "si",
                "camioneta"));
        theVehicle.add(new Car(25000000, 20000000, "nissan", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina", "si",
                "camioneta"));
        theVehicle.add(new Car(25000000, 20000000, "toyota", 2019, 1600, 17000, "nuevo", "12345", 4, "gasolina", "si",
                "camioneta"));
        theVehicle.add(new Motorcicle(35000000, 20000000, "ducati", 2019, 1600, 17000, "nuevo", "123456", "cross"));

        totalProfist = 0;
        totalSales = 0;

    }

    public void totalPriceVehicle() {

    }

    public void calculateTotalpCar(Vehicle myVehicle, Car car, Motorcicle motorcicle) {

        double calculateTotalp;

        if (myVehicle instanceof Car) {

            if (car.getTypeOfCar().equalsIgnoreCase("electrico")) {

                if (car.getNew().equalsIgnoreCase("nuevo")) {

                    calculateTotalp = ((myVehicle.getBasePrice() * 0.2) + myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

                if (car.getNew().equalsIgnoreCase("usado")) {

                    calculateTotalp = (((myVehicle.getBasePrice() * 0.2) + myVehicle.getBasePrice()) * 0.10)
                            + ((myVehicle.getBasePrice() * 0.2) + myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

            }

            if (car.getTypeOfCar().equalsIgnoreCase("hibrido")) {

                if (car.getNew().equalsIgnoreCase("nuevo")) {

                    calculateTotalp = ((myVehicle.getBasePrice() * 0.15) + myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

                if (car.getNew().equalsIgnoreCase("usado")) {

                    calculateTotalp = (((myVehicle.getBasePrice() * 0.15) + myVehicle.getBasePrice()) * 0.10)
                            - (myVehicle.getBasePrice() * 0.15) + myVehicle.getBasePrice();

                    myVehicle.setTotalPrice(calculateTotalp);

                }

            }

            if (car.getTypeOfCar().equalsIgnoreCase("gasolina")) {

                if (car.getNew().equalsIgnoreCase("nuevo")) {

                    calculateTotalp = myVehicle.getBasePrice();

                    myVehicle.setTotalPrice(calculateTotalp);

                }

                if (car.getNew().equalsIgnoreCase("usado")) {

                    calculateTotalp = ((myVehicle.getBasePrice() * 0.10) - myVehicle.getBasePrice());

                    myVehicle.setTotalPrice(calculateTotalp);

                }

            }

        }

        if (myVehicle instanceof Motorcicle) {

            if (motorcicle.getNew().equalsIgnoreCase("usado")) {

                calculateTotalp = (((myVehicle.getBasePrice() * 0.04) + myVehicle.getBasePrice()) * 0.02)
                        - ((myVehicle.getBasePrice() * 0.04) + myVehicle.getBasePrice());

                myVehicle.setTotalPrice(calculateTotalp);

            }

            if (car.getNew().equalsIgnoreCase("nuevo")) {

                calculateTotalp = ((myVehicle.getBasePrice() * 0.04) + myVehicle.getBasePrice());

                myVehicle.setTotalPrice(calculateTotalp);

            }

        }

    }

    public Sellers[] getSeller() {

        return seller;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;
    }

    public void setNit(String id) {

        this.id = id;

    }

    public String getNit() {

        return id;
    }

    public void setTotalProfist(int totalProfist) {

        this.totalProfist = totalProfist;

    }

    public int getTotalProfist() {

        return totalProfist;
    }

    public void setTotalSales(int totalSales) {

        this.totalSales = totalSales;

    }

    public int getTotalSales() {

        return totalSales;
    }

    public ArrayList<Vehicle> getMyVehicleAdd() {
        return myVehicleAdd;
    }

    public void setMyVehicleAdd(ArrayList<Vehicle> myVehicleAdd) {
        this.myVehicleAdd = myVehicleAdd;
    }

    public ArrayList<Vehicle> getTheVehicle() {
        return theVehicle;
    }

    public void setTheVehicle(ArrayList<Vehicle> theVehicle) {
        this.theVehicle = theVehicle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSeller(Sellers[] seller) {
        this.seller = seller;
    }

}