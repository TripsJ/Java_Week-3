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
        String[] inputs = {"monthly total", "yearly total", "help", "yearly average", "monthly average","MONTHLY TOTAL","YeARLY TOTal","","Some random BullShit 56"};
        String[] expected = {"monthly total", "yearly total", "help", "yearly average", "monthly average","monthly total","yearly total","",""};
        for (int i = 0; i < inputs.length; i++) {

            assertEquals(expected[i], commandChecker.checkInput(inputs[i]));
        }
    }

    }