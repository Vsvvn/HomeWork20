package transport;

public class Bus extends Transport implements Competing {


    public Capacity capacity;

    public Bus(String brand) {
        super(brand);
    }

    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " начаинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Автобус" + getBrand() + " заканчивает движение");
    }

    @Override
    public void printType() {

        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() + "  от " + capacity.getFrom() + " до " + capacity.getTo() + " человек.");

        }

    }

    @Override
    public boolean diagnostic() {

        System.out.println("Автобус " + getBrand() + " " + getModel() + " диагностику проходить не будет");

        return true;
    }

    @Override
    public void pitStop() {
        System.out.println("На пит-стоп заезжает автобус марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга показывает " + ((int) (Math.random() * 15)) +
                " мин, автобус марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальную скорость " + ((int) (Math.random() * 100)) +
                " км/ч, показывает автобус марки " + getBrand() + " модели " + getModel());

    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }

    @Override
    public void repair() {
        System.out.println("автобус " + getBrand() + " модели " + getModel() + " починен");
    }
}
