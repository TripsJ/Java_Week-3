import com.opencsv.bean.CsvBindByName;

public class Trademodel {

    //Attributes
    // Direction,Year,Date,Weekday,Country,Commodity,Transport_Mode,Measure,Value,Cumulative
    static int lines = 0;
    private int entry = lines;
    @CsvBindByName(column = "Direction")
    private String direction;
    @CsvBindByName(column = "Year")
    private String year;
    @CsvBindByName(column = "Date")
    private String date;
    @CsvBindByName(column = "Weekday")
    private String day;
    @CsvBindByName(column = "Country")
    private String country;
    @CsvBindByName(column = "Commodity")
    private String commodity;
    @CsvBindByName(column = "Transport_Mode")
    private String transport;
    @CsvBindByName(column = "Measure")
    private String measure;
    @CsvBindByName(column = "Value")
    private String value;
    @CsvBindByName(column = "Cumulative")
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

    public String getYear() {
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

    public void setYear(String year) {this.year = year;}

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


// Format the printed output of the object
    @Override
    public String toString() {
        return "Trademodel " + entry +" / "+lines + " : \n{ " +
                "direction='" + direction + '\'' +
                ", year='" + year + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", country='" + country + '\'' +
                ", commodity='" + commodity + '\'' +
                ", transport='" + transport + '\'' +
                ", measure='" + measure + '\'' +
                ", value='" + value + '\'' +
                ", cumulative='" + cumulative + '\'' +
                '}';
    }




}
