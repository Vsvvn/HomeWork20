package transport.driver;


import transport.Car;

public class DriverB extends Driver<Car> {
    private String categoryB;

    public DriverB(String name, boolean hasDrivingLicense, int experience, String categoryB) {
        super(name, hasDrivingLicense, experience);
        setCategoryB(categoryB);
    }

    public void setCategoryB(String categoryB) {
        if (categoryB.equals("B") && categoryB != null)
            this.categoryB = "B";
        else {
            this.categoryB = "B";
        }
    }

    public String getCategoryB() {
        return categoryB;
    }

    @Override
    public void startMove(Car transport) {
        transport.start();
    }

    @Override
    public void stopMove(Car transport) {
        transport.finish();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель " + getName() + " заправляет легковой автомобиль " + transport.getBrand() + "" +
                " категория прав " + getCategoryB());

    }

    @Override
    public void driverInfo(Car transport) {
        System.out.println("водитель " + getName() + " управляет " + transport.getBrand() + " категория прав водителя " + getCategoryB());
        transport.printType();
    }

    @Override
    public String toString() {
        return " категория прав водителя: " + categoryB +
                ", " + super.toString();
    }
}
