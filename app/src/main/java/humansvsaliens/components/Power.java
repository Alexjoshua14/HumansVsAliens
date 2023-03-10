package app.src.main.java.humansvsaliens.components;

public class Power {
    private String name;
    private String description;

    public Power(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }
}
