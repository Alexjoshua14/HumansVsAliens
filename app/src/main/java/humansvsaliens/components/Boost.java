package app.src.main.java.humansvsaliens.components;

import java.util.List;
import java.util.ArrayList;

public class Boost {
    private String name;
    private String type;
    private List<Effect> effects;

    public Boost(String name, String type) {
        this.name = name;
        this.type = type;
        this.effects = new ArrayList<Effect>();
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public List<Effect> getEffects() {
        return this.effects;
    }

    public void addEffect(Effect e) {
        effects.add(e);
    }

    @Override
    public String toString() {
        String str = "Boosts:\n";
        for (Effect e : effects) {
            str += "\t" + e + "\n";
        }

        return str;
    }

}
