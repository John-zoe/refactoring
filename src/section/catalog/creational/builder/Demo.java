package section.catalog.creational.builder;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built: \n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built :\n" + carManual.print());

    }

}
