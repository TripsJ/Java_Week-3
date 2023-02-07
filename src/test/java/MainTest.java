import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest{

    @BeforeEach
    void setUp() {
        String [] args = {"monthly_total", "yearly_total", "help", "yearly_average", "monthly_average", "MONTHLY_TOTAL", "YeARLY_TOTal", "", "Some random BullShit 56", "monthly total"};
    }

    @Test
    void Testmain() {



    }
}