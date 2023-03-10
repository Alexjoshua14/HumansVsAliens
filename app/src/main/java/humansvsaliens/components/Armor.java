package app.src.main.java.humansvsaliens.components;

public class Armor {
    private String name;
    private double resistance;
    
    public Armor(String name, double resistance) {
        this.name = name;
        this.resistance = resistance;
    }

    public String getName() {
        return this.name;
    }

    public double getResistance() {
        return this.resistance;
    }
}
