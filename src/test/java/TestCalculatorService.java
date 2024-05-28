import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculatorService {

    @Test
    public void testPositive() {

        CalculatorService obj = new CalculatorService();
        assertEquals(true, obj.isPositive(10));
        //kill mutation #1
        assertEquals(true, obj.isPositive(0));

    }

}
