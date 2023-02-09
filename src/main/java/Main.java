import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CommandChecker checker = new CommandChecker();
        List<Trademodel> data;
        ObjectMapper om = new ObjectMapper("covid_and_trade.csv");
        try {
            data  = om.create();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        Analyzer analyzer = new Analyzer();
        Helper helper = new Helper();
        String input = args[0];
        System.out.println(input);
        String verifiedInput = checker.checkInput(input);
        if(args.length>1){
        data = analyzer.preselect(data,args[1]);}
        switch (verifiedInput) {
            case "monthly_total" -> analyzer.getMonthlyTotal(data);
            case "yearly_total" -> analyzer.getYearlyTotal(data);
            case "yearly_average" -> analyzer.getYearlyAverage(data);
            case "monthly_average" -> analyzer.getMonthlyAverage(data);
            default -> helper.description();
        }


    }


}
