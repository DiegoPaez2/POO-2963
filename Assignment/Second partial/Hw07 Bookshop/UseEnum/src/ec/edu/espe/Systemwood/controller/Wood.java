package ec.edu.espe.Systemwood.controller;

public enum Wood {

    OAK("Greenish brown", 800),
    CAOBA("Dark Brown", 770),
    NOGAL("Reddish Brown", 820),
    CHERRY("Cherry Brown", 790),
    BOJ("Blackish brown", 675);

    private final String color;

    private final int weight;

    Wood(String color, int weight) {

        this.color = color;

        this.weight = weight;

    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}
