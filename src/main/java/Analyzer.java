import java.util.Scanner;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Analyzer {

public List<Trademodel> preselect (List<Trademodel>dataset,String filterBy){
    List<Trademodel>filteredList;

    return filteredList;
}

    public void getMonthlyTotal(List<Trademodel> data) {
        System.out.println("Monthly Total");
        Scanner sc=new Scanner(System.in);
        System.out.print("Specify a 4 Digit Year: ");
        String year = sc.nextLine();
        System.out.println();
        System.out.println("Specify a 2 Digit Month: ");
        String month = sc.nextLine();
        String pattern ="/"+month+"/"+year;
        AtomicInteger Total = new AtomicInteger();
        Stream<Trademodel>selection = data.stream().filter(d->d.getDate().contains(pattern));
        selection.forEach(d-> Total.addAndGet(Integer.parseInt(d.getValue())));
        System.out.println(Total.intValue());
        sc.close();
        selection.close();

    }

    public void getYearlyTotal(List<Trademodel> data) {
        System.out.println("Yearly Total");
        Scanner sc=new Scanner(System.in);
        System.out.print("Specify a 4 Digit Year: ");
        String year = sc.nextLine();
        System.out.println();
        String pattern ="/"+year;
        AtomicInteger Total = new AtomicInteger();
        Stream<Trademodel>selection = data.stream().filter(d->d.getDate().contains(pattern));
        selection.forEach(d-> Total.addAndGet(Integer.parseInt(d.getValue())));
        System.out.println(Total.intValue());
        sc.close();
        selection.close();
    }

    public void getYearlyAverage(List<Trademodel> data) {
        System.out.println("Yearly average");
        Scanner sc=new Scanner(System.in);
        System.out.print("Specify a 4 Digit Year: ");
        String year = sc.nextLine();
        System.out.println();
        String pattern ="/"+year;
        AtomicInteger Total = new AtomicInteger();
        Stream<Trademodel>selection = data.stream().filter(d->d.getDate().contains(pattern));
        long count = selection.count();// Stream closes after being counted so i need to build it  again
        Stream<Trademodel>same = data.stream().filter(d->d.getDate().contains(pattern));
        same.forEach(d-> Total.addAndGet(Integer.parseInt(d.getValue())));
        System.out.println(Total.doubleValue()/count);
        sc.close();
        selection.close();
    }

    public void getMonthlyAverage(List<Trademodel> data) {
        System.out.println("Monthly Average");
        Scanner sc=new Scanner(System.in);
        System.out.print("Specify a 4 Digit Year: ");
        String year = sc.nextLine();
        System.out.println();
        System.out.print("Specify a 2 Digit Month: ");
        String month = sc.nextLine();
        String pattern ="/"+month+"/"+year;
        AtomicInteger Total = new AtomicInteger();
        Stream<Trademodel>selection = data.stream().filter(d->d.getDate().contains(pattern));
        long count = selection.count();// Stream closes after being counted so i need to build it  again
        Stream<Trademodel>same = data.stream().filter(d->d.getDate().contains(pattern));
        same.forEach(d-> Total.addAndGet(Integer.parseInt(d.getValue())));
        System.out.println(Total.doubleValue()/count);
        sc.close();
        selection.close();
    }
/*// https://opencsv.sourceforge.net/#linevalidator
    @Override
    public boolean isValid(String s) {
        return false;
    }

    @Override
    public void validate(String s) throws CsvValidationException {

    }
    // contains the methods to treat the file contents*/
    
}
