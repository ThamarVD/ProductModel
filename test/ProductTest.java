import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1;
    @BeforeEach
    void setUp() {
        p1 = new Product("Fish", "For eating", "123456", 1.56);
    }

    @Test
    void setName() {
        p1.setName("Crab");
        assertEquals("Crab", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setName("Crunchy Eatin");
        assertEquals("Crunchy Eatin", p1.getDescription());
    }

    @Test
    void setID() {
        p1.setID("654321");
        assertEquals("654321", p1.getID());
    }

    @Test
    void setCost() {
        p1.setCost(3.12);
        assertEquals("3.12", p1.getCost());
    }
}