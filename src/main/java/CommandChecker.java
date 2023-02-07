public class CommandChecker {
     enum primaryCmd {
        MONTHLY_TOTAL("monthly_total"),
        YEARLY_TOTAL("yearly_total"),
        HELP("help"),
        YEARLY_AVERAGE("yearly_average"),
        MONTHLY_AVERAGE("monthly_average")
        // Maximun T_MAX,
        ;

        private final String expectedInput;

        primaryCmd(String expectedInput) {
            this.expectedInput = expectedInput;
        }
    }

    public String checkInput(String input) {
        String checkedInput = "";
        for (primaryCmd cmd : primaryCmd.values()) {
            if (cmd.expectedInput.equals(input.toLowerCase())) {
                checkedInput = cmd.expectedInput;
            }
        }
        return checkedInput;
    }
}


