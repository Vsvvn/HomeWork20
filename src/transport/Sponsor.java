package transport;

public class Sponsor {

    private final String name;
    private int sum;

    public Sponsor(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public void sponsorRace() {
        System.out.printf("Спосносор \"%s\" проспонсировал заед на %d%n", name, sum);
    }


    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }


    @Override
    public String toString() {
        return "имя или навзвание спонсора " + name +
                ", сумма поддержки " + sum +
                " руб.";
    }
}


