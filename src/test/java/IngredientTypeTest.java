import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertNotNull;

public class IngredientTypeTest {
    @Test
    public void fillingIsNotNull() {
        assertNotNull("Такой начинки нет", IngredientType.valueOf("FILLING"));
    }

    @org.junit.jupiter.api.Test
    public void sauceIsNotNull() {
        assertNotNull("Такого соуса нет", IngredientType.valueOf("SAUCE"));
    }
}