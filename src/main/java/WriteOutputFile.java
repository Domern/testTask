import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class WriteOutputFile {
    private final ArrayList<String> outPutArr;

    public WriteOutputFile(ArrayList<String> outPutArr) {
        this.outPutArr = outPutArr;
        try {
            Path outPutFile = Path.of("output.txt");
           Files.write(outPutFile,outPutArr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
