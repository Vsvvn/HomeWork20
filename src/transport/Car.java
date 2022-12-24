package transport;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand) {
        super(brand);
    }

    public Car(String brand,
               String model,
               double engineVolume,
               BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль " + getBrand() + " начаинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Легковой автомобиль " + getBrand() + " заканчивает движение");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова легкового автомобиля " + getBrand() + ": " + bodyType.getTypeBody());
        }
    }

    @Override
    public boolean diagnostic() {

        return Math.random() > 0.7;
    }

    @Override
    public void repair() {
        System.out.println("легковой автомобиль " + getBrand() + " модели " + getModel() + " починен");
    }

    @Override
    public void pitStop() {
        System.out.println("На пит-стоп заезжает легковой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + ((int) (Math.random() * 7)) +
                " мин, показывает легковой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальную скорость " + ((int) (Math.random() * 150)) +
                " км/ч, показывает легковой автомобиль марки " + getBrand() + " модели " + getModel());

    }
}
