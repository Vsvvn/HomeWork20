package transport;

public class Mechanic<T extends Transport> {

    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean service(T t) {

        return t.diagnostic();
    }

    public void repair(T t) {
        t.repair();
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "имя " + name +
                ", фамилия " + surname +
                ", компания " + company;
    }
}
