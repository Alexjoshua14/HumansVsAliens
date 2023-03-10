package app.src.main.java.humansvsaliens.components;

import java.util.List;
import java.util.ArrayList;

public class Human extends Entity {
    private List<Armor> armor;
    private List<Boost> boosts;

    public Human(String name, int hp, double weight) {
        super(name, hp, weight);
        this.armor = new ArrayList<>();
        this.boosts = new ArrayList<>();
    }

    public void putOnArmor(Armor armorPiece) {
        armor.add(armorPiece);
    }

    public void addBoost(Boost boost) {
        boosts.add(boost);
    }

    public List<Armor> getArmor() {
        return this.armor;
    }

    public List<Boost> getBoosts() {
        return this.boosts;
    }
}