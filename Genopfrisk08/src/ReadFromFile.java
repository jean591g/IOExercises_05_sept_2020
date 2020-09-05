import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromFile {

    private static final String FILE_PATH = "Genopfrisk08/Resources/genopfrisk08_textfile.txt";

    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil(FILE_PATH);
        System.out.println("\nNumber of lines in text file: " + fileUtil.getLineCount() + "\n");

        try {
            File myObj = new File("Genopfrisk08/Resources/genopfrisk08_textfile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred");
            e.printStackTrace();
        }
    }
}

class FileUtil {
    static BufferedReader reader = null;
    public FileUtil(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        reader = new BufferedReader(input);
    }

    public static int getLineCount() throws IOException {
        int lineCount = 0;
        String data;
        while((data = reader.readLine()) != null) {
            lineCount++;
        }
        return lineCount;
    }
}
