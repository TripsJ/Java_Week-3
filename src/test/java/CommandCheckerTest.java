import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*MONTHLY_TOTAL("monthly total"),
        YEARLY_TOTAL("yearly total"),
        HELP("help"),
        YEARLY_AVERAGE("yearly average"),
        MONTHLY_AVERAGE("monthly average"),*/
class CommandCheckerTest {
    private CommandChecker commandChecker;

    @BeforeEach
    void setUp() {
        commandChecker = new CommandChecker();
    }

    @Test
    void TestprimaryCmd() {
        String[] inputs = {"monthly_total", "yearly_total", "help", "yearly_average", "monthly_average","MONTHLY_TOTAL","YeARLY_TOTal","","Some random BullShit 56","monthly total"};
        String[] expected = {"monthly_total", "yearly_total", "help", "yearly_average", "monthly_average","monthly_total","yearly_total","","",""};
        for (int i = 0; i < inputs.length; i++) {

            assertEquals(expected[i], commandChecker.checkInput(inputs[i]));
        }
    }

    }