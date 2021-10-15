package sample;

public class CarbonCalculator {

    static Double currentCarbon;

    enum WasteType {
        TRASH,
        RECYCLE
    }

    enum DietType {
        VEGAN,
        VEGETARIAN,
        MEAT
    }

    enum TransportationType {
        BUS,
        CAR,
        WALK
    }
    enum ElectricityType{
        YES,
        LESS,
        NO
    }
    enum NaturalGasType{
        YES,
        LESS,
        NO
    }
    enum FuelOilType{
        YES,
        LESS,
        NO
    }
    enum PropaneType{
        YES,
        LESS,
        NO
    }

    static ElectricityType electricityType;
    static TransportationType transportationType;
    static NaturalGasType naturalGasType;
    static FuelOilType fuelOilType;
    static PropaneType propaneType;
    static double miles;
    static double mpg;
    static double dietCarbon;
    static double transportationCarbon;
    static double wasteCarbon;
    static double electricityCarbon;
    static double fuelOilCarbon;
    static double propaneCarbon;
    static double naturalGasCarbon;

    static void init() {
        CarbonCalculator.currentCarbon = 0.0;
    }

    static void addCarbon(float carbon) {
        CarbonCalculator.currentCarbon += carbon;
    }

    static void setDiet(DietType d) {
        if (d == DietType.VEGAN) {
            dietCarbon = calcVegan();
        } else if (d == DietType.VEGETARIAN) {
            dietCarbon = calcVegetarian();
        } else {
            dietCarbon = calcCarnivore();
        }
    }

    static void setWaste(WasteType w) {
        if (w == WasteType.RECYCLE) {
            wasteCarbon = calcRecycle();
        } else {
            wasteCarbon = calcTrash();
        }
    }


    static void setTransportation(TransportationType t) {
        CarbonCalculator.transportationType = t;
    }

    static void setElectricityType(ElectricityType e){
        if(e==ElectricityType.YES){
            electricityCarbon = 6779;
        }
        else if(e == ElectricityType.LESS){
            electricityCarbon = 3389.5;
        }
        else{
            electricityCarbon = 0;
        }
    }

    static void setNaturalGasType(NaturalGasType n){
            if(n==NaturalGasType.YES){
                naturalGasCarbon = 3817;
            }
            else if(n == NaturalGasType.LESS){
                naturalGasCarbon = 1908.5;
            }
            else{
                naturalGasCarbon = 0;
            }
    }
    static void setFuelOilType(FuelOilType f){
       if( f == FuelOilType.YES){
           fuelOilCarbon = 6024;
       }
       else if ( f == FuelOilType.LESS){
           fuelOilCarbon = 3012;
       }
       else{
           fuelOilCarbon = 0;
       }
    }

    static void setPropaneType(PropaneType p){
       if(p == PropaneType.YES){
           propaneCarbon = 2787;
       }
       else if(p == PropaneType.LESS){
           propaneCarbon =  1393.5;
       }
       else{
           propaneCarbon = 0;
       }
    }


    static void calcTransportation() {
        if (CarbonCalculator.transportationType == TransportationType.BUS) {
            transportationCarbon = calcBus(miles);
        } else if (CarbonCalculator.transportationType == TransportationType.CAR) {
            transportationCarbon = calcCar(miles, mpg);
        } else {
            transportationCarbon = calcWalk();
        }
    }

    //diet calculations
    public static double calcCarnivore() {
        return 6212;
    }

    public static double calcVegetarian() {
        return 4224;
    }

    public static double calcVegan() {
        return 3727;
    }

    //waste calculations
    public static double calcTrash() {
        double waste = 860;
        System.out.println(waste);
        return waste;
    }

    public static double calcRecycle() {
        double waste = 498;
        System.out.println(waste);
        return waste;
    }

    //transportation calculations
    static void setMiles(double m) {
        miles = m;
    }

    static void setMPG(double mpgs) {
        mpg = mpgs;
    }

    public static double calcCar(double miles, double efficiency) {
        double carbonCar = miles / efficiency;
        carbonCar = carbonCar * 8887;
        return carbonCar;
    }

    public static double calcBus(double miles) {
        return miles * 100;
    }

    public static double calcWalk() {
        return 0;
    }

}
