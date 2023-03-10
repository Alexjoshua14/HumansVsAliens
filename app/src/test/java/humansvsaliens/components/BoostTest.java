package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.components.Boost;
import app.src.main.java.humansvsaliens.components.Effect;
import java.util.List;
import java.util.ArrayList;

public class BoostTest {
    String name;
    String type;
    Effect effect;
    Boost boost;

    @BeforeEach
    void createBoost() {
        name = "Magic Healing";
        type = "Regeneration";
        effect = new Effect("hp", 40);

        boost = new Boost(name, type);
        boost.addEffect(effect);
    }

    @Test 
    void BoostHasName() {
        assertEquals(name, boost.getName());
    }

    @Test 
    void BoostHasType() {
        assertEquals(type, boost.getType());
    }

    @Test
    void BoostHasEffects() {
        assertEquals(effect, boost.getEffects().get(0));
    }
}
