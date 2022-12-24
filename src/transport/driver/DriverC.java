package transport.driver;


import transport.Truck;

public class DriverC extends Driver<Truck> {

    private String categoryC;

    public DriverC(String name, boolean hasDrivingLicense, int experience, String categoryC) {
        super(name, hasDrivingLicense, experience);

        setCategoryC(categoryC);
    }

    public void setCategoryC(String categoryC) {
        if (categoryC.equals("C")&& categoryC != null)
            this.categoryC = "C";
        else {
            this.categoryC = "C";
        }
    }

    public String getCategoryC() {
        return categoryC;
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.finish();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель" + getName() + " заправляет грузовой автомобиль " + transport.getBrand() + " категория прав водителя " + getCategoryC());

    }

    @Override
    public void driverInfo(Truck transport) {
        System.out.println("водитель " + getName() + " управляет " + transport.getBrand() + " категория прав водителя " + getCategoryC());
        transport.printType();
    }

    @Override
    public String toString() {
        return " категория прав водителя: " + categoryC +
                ", " + super.toString();
    }
}
