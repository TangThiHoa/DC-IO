package daicent.com.bigfile;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadBigFile {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "daicent.txt";
        File file = new File(url);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            while ((line != null)) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            Logger.getLogger(WriteBigFile.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                Logger.getLogger(WriteBigFile.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }
}
