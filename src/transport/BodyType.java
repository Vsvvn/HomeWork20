package transport;

public enum BodyType {

    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COUPE("Купэ"),
    UNIVERSAL("Универсал"),
    OFFROAD("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String typeBody;

    BodyType(String typeBody) {
        this.typeBody = typeBody;
    }

    public String getTypeBody() {
        return typeBody;
    }
}
