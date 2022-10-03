import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReadInputFile {

    public ReadInputFile() throws IOException {
        Path inputFile = Path.of("input.txt");
        String inputString = Files.readString(inputFile, StandardCharsets.UTF_8);
        inputString.toLowerCase(Locale.ROOT);
        String[] split = inputString.split("\r\n");
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second=new ArrayList<>();
        int firstPart = Integer.parseInt(split[0]);
        int secondPart= Integer.parseInt(split[firstPart+1]);
        for (int i = 1; i <1+firstPart ; i++) {
            first.add(split[i]);
        }
        for (int i = firstPart+2; i <firstPart+secondPart+2 ; i++) {
            second.add(split[i]);
        }
        if(first.size()>second.size()) {
            new ComparisonFirstAndSecond(first, second);
        }else new ComparisonFirstAndSecond(second,first);

    }


}
