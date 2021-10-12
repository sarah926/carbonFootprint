package sample;

import javafx.scene.Parent;

public class CarbonCalculator {

    static Double currentCarbon;
    enum WasteType{
        TRASH,
        RECYCLE
    }
    enum DietType{
        VEGAN,
        VEGETARIAN,
        MEAT
    }
    enum TransportationType{
        BUS,
        CAR,
        WALK
    }


    static TransportationType transportationType;
    static double miles;
    static double mpg;
    static double dietCarbon;
    static double transportationCarbon;
    static double wasteCarbon;

    static void init() {
        CarbonCalculator.currentCarbon = 0.0;
    }

    static void addCarbon(float carbon) {
        CarbonCalculator.currentCarbon += carbon;
    }

    static void setDiet(DietType d){
        if(d== DietType.VEGAN){
            dietCarbon=calcVegan();
        }
        else if(d == DietType.VEGETARIAN){
            dietCarbon=calcVegetarian();
        }
        else{
            dietCarbon=calcCarnivore();
        }
    }
    static void setWaste(WasteType w){
        if(w == WasteType.RECYCLE){
            wasteCarbon=calcRecycle();
        }
        else{
            wasteCarbon=calcTrash();
        }
    }
    static void setTransportation(TransportationType t){
        CarbonCalculator.transportationType = t;
    }
    static void calcTransportation(){
        if(CarbonCalculator.transportationType == TransportationType.BUS){
            transportationCarbon = calcBus(miles);
        }
        else if(CarbonCalculator.transportationType == TransportationType.CAR){
            transportationCarbon = calcCar(miles,mpg);
        }
        else{
            transportationCarbon = calcWalk();
        }
    }

    //diet calculations
    public static double calcCarnivore(){
        return 6212;
    }
    public static double calcVegetarian(){
        return 4224;
    }
    public static double calcVegan(){
        return 3727;
    }

    //waste calculations
    public static double calcTrash(){
        double waste = 860;
        System.out.println(waste);
        return waste;
    }
    public static double calcRecycle(){
        double waste = 498;
        System.out.println(waste);
        return waste;
    }

    //transportation calculations
    static void setMiles(double m){
        miles = m;
    }
    static void setMPG(double mpgs){
        mpg = mpgs;
    }

    public static double calcCar(double miles, double efficiency){
        double carbonCar = miles / efficiency;
        carbonCar = carbonCar * 8887;
        return carbonCar;
    }

    public static double calcBus(double miles){
        double carbonBus = miles * 100;
        return carbonBus;
    }

    public static double calcWalk(){
        return 0;
    }

}
