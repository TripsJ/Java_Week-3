public class CommandChecker {
    private enum primaryCmd {
        MONTHLY_TOTAL("monthly total"),
        YEARLY_TOTAL("yearly total"),
        HELP("help"),
        YEARLY_AVERAGE("yearly average"),
        MONTHLY_AVERAGE("monthly average")
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

