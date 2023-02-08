
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
public class ObjectMapper {
    String fileName = "";

    ObjectMapper(String fileName){
        this.fileName = fileName;
    }
    public List<Trademodel> create() throws IOException {


        List<Trademodel> beans = new CsvToBeanBuilder(new FileReader(this.fileName))
                .withType(Trademodel.class)
                .build()
                .parse();

        beans.forEach(System.out::println);
        return beans;

    }

}