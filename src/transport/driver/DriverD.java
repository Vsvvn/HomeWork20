package transport.driver;


import transport.Bus;

public class DriverD extends Driver<Bus> {

    private String categoryD;

    public DriverD(String name, boolean hasDrivingLicense, int experience, String categoryD) {
        super(name, hasDrivingLicense, experience);
        setCategoryD(categoryD);
    }

    public void setCategoryD(String categoryD) {
        if (categoryD.equals("D") && categoryD != null)
            this.categoryD = "D";
        else {
            this.categoryD = "D";
        }
    }


    public String getCategoryD() {
        return categoryD;
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.finish();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель" + getName() + " заправляет автобус " + transport.getBrand());

    }

    @Override
    public void driverInfo(Bus transport) {
        System.out.println("водитель " + getName() + " управляет " + transport.getBrand() + " категория прав водителя " + getCategoryD());
        transport.printType();
    }

    @Override
    public String toString() {
        return " категория прав водителя: " + categoryD +
                ", " + super.toString();
    }
}
