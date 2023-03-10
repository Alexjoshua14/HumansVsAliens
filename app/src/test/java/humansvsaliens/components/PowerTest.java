package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.components.Power;

public class PowerTest {
    String name;
    String description;
    Power power;

    @BeforeEach
    void createPower() {
        name = "Telekinesis";
        description = "Spooky action from a distance";
        power = new Power(name, description);
    }

    @Test
    void powerHasName() {
        assertEquals(name, power.getName());
    }

    @Test
    void powerHasDescription() {
        assertEquals(description, power.getDescription());
    }
}
