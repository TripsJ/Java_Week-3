import com.opencsv.bean.CsvBindByName;

public class Trademodel {

    //Attributes
    static int lines = 0;
    @CsvBindByName(column = "start ip")
    private String direction;
    @CsvBindByName(column = "start ip")
    private String year;
    @CsvBindByName(column = "start ip")
    private String date;
    @CsvBindByName(column = "start ip")
    private String day;
    @CsvBindByName(column = "start ip")
    private String country;
    @CsvBindByName(column = "start ip")
    private String commodity;
    @CsvBindByName(column = "start ip")
    private String transport;
    @CsvBindByName(column = "start ip")
    private String measure;
    @CsvBindByName(column = "start ip")
    private String value;
    @CsvBindByName(column = "start ip")
    private String cumulative;



//Constructor
// Just increment the line count on the class attribute use Setters to initiate values
// That way i can implement parsing if need be.
    public Trademodel(){
        lines++;
    }


//Getters and Setters
    public static int getLines() {
        return lines;
    }

    public String getDirection() {
        return direction;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public String getCountry() {
        return country;
    }

    public String getCommodity() {
        return commodity;
    }

    public String getTransport() {
        return transport;
    }

    public String getMeasure() {
        return measure;
    }

    public String getValue() {
        return value;
    }

    public String getCumulative() {
        return cumulative;
    }

    //Direction,Year,Date,Weekday,Country,Commodity,Transport_Mode,Measure,Value,Cumulative
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setYear(int year) {this.year = year;}

    public void setDate(String date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCumulative(String cumulative) {
        this.cumulative = cumulative;
    }







}
