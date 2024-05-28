

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStockService {

    @DisplayName("Test deduct stock")
    @Test
    public void testDeduct() {
        StockService obj = new StockService(100);
        assertEquals(90, obj.deduct(10));
        assertEquals(0, obj.deduct(90));
        assertEquals(0, obj.deduct(0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.deduct(-1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.deduct(100);
        });

    }

    @DisplayName("Test add stock")
    @Test
    public void testAdd() {
        StockService obj = new StockService(100);
        assertEquals(110, obj.add(10));
        assertEquals(110, obj.add(0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.add(-1);
        });
    }

    @DisplayName("Test add stock2")
    @Test
    public void testAdd2() {
        StockService obj = new StockService(50);
        assertEquals(100, obj.add(50));
        assertEquals(100, obj.add(0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.add(-1);
        });
    }
    @DisplayName("Test deduct stock")
    @Test
    public void testDeduct1() {
        StockService obj = new StockService(10);
        assertEquals(5, obj.deduct(5));
        assertEquals(3, obj.deduct(2));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.add(-1);
        });
    }


}