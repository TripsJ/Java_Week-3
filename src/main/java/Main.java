import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CommandChecker checker = new CommandChecker();
        ObjectMapper om = new ObjectMapper("covid_and_trade.csv");
        try {
            om.create();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        Analyzer analyzer = new Analyzer();
        Helper helper = new Helper();
        String input = args[0];
        System.out.println(input);
        String verifiedInput = checker.checkInput(input);
        switch (verifiedInput) {
            case "monthly_total" -> analyzer.getMonthlyTotal();
            case "yearly_total" -> analyzer.getYearlyTotal();
            case "yearly_average" -> analyzer.getYearlyAverage();
            case "monthly_average" -> analyzer.getMonthlyAverage();
            default -> helper.description();
        }


    }


}
