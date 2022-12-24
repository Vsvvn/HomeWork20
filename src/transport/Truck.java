package transport;

public class Truck extends Transport implements Competing {

    public CargoCapacity cargoCapacity;

    public Truck(String brand) {
        super(brand);
    }

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 CargoCapacity cargoCapacity) {
        super(brand, model, engineVolume);
        this.cargoCapacity = cargoCapacity;
    }

    public CargoCapacity getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(CargoCapacity cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль" + getBrand() + " начаинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Грузовой автомобиль" + getBrand() + " заканчивает движение");
    }

    @Override
    public void printType() {
        if (cargoCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = cargoCapacity.getFrom() == null ? " " : " от " + cargoCapacity.getFrom();
            String to = cargoCapacity.getTo() == null ? " " : " до " + cargoCapacity.getTo();

            System.out.println("Грузоподъемность грузового автомобиля " + getBrand() + from
                    + to + " тонн.");
        }
    }

    @Override
    public boolean diagnostic() {

        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("грузовой автомобиль " + getBrand() + " модели " + getModel() + " починен");
    }

    @Override
    public void pitStop() {
        System.out.println("На пит-стоп заезжает грузовой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга показывает " + ((int) (Math.random() * 12)) +
                " мин, грузовой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальную скорость " + ((int) (Math.random() * 120)) +
                " км/ч, показывает грузовой автомобиль марки " + getBrand() + " модели " + getModel());
    }
}
