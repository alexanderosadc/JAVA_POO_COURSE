package OOP_univer.lab_4_done;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyTextFile {
    String fileContent = "";

    CopyTextFile(String filePath) throws FileNotFoundException {

        File inputFile = new File(filePath);
        Scanner fileReader = new Scanner(inputFile);
        while (fileReader.hasNextLine()) {
            fileContent = fileContent.concat(fileReader.nextLine() + "\n");
        }
        fileReader.close();
    }
}

