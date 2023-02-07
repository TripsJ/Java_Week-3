import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.validators.LineValidator;

public class Analyzer implements LineValidator {

    public void readCSV(String File){

    }

    public Trademodel parseToTrademodel(){
        Trademodel target = new Trademodel();
        return target;
    }
    public void getMonthlyTotal() {
        System.out.println("Monthly Total");
    }

    public void getYearlyTotal() {
        System.out.println("Yearly Total");
    }

    public void getYearlyAverage() {
        System.out.println("Yearly average");
    }

    public void getMonthlyAverage() {
        System.out.println("Monthly Average");
    }
// https://opencsv.sourceforge.net/#linevalidator
    @Override
    public boolean isValid(String s) {
        return false;
    }

    @Override
    public void validate(String s) throws CsvValidationException {

    }
    // contains the methods to treat the file contents
    
}
