package transport;

public enum CargoCapacity {
    N1(0F,3.5F),
    N2(3.5F,12F),
    N3(12F, null);

    private final Float from;
    private final Float to;

    public Float getFrom() {
        return from;
    }

    public Float getTo() {
        return to;
    }

    CargoCapacity(Float from, Float to) {
        this.from = from;
        this.to = to;
    }
}
