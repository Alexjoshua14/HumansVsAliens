package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.components.Armor;

public class ArmorTest {
    String name;
    double resistance;
    Armor armor;

    @BeforeEach
    void createArmor() {
        name = "Shadow Cloak";
        resistance = 95;
        armor = new Armor(name, resistance);
    }

    @Test
    void armorHasName() {
        assertEquals(name, armor.getName());
    }

    @Test
    void armorHasResistance() {
        assertEquals(resistance, armor.getResistance());
    }
    
}
