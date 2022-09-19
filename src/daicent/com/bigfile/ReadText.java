package daicent.com.bigfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadText {
    public static long fileGetSize(String name) {
        File file= new File(name);
        if (!file.exists()||!file.isFile()){
            System.out.println("không tồn tại");
            return -1;
        }
        return file.length();
    }
    public static void main(String[] args) {


//        File f = new File("D:\\Tranning\\IO\\THIRDPARTYLICENSEREADME.txt");
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while (true){
//                line = br.readLine();
//                if (line == null){
//                    break;
//                }else {
//                    System.out.println(line);
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File f2 = new File("D:\\Tranning\\IO\\THIRDPARTYLICENSEREADME.txt");
        try{
            List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
            for (String str: allText) {
                System.out.println(str);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long size = fileGetSize("D:\\Tranning\\IO\\THIRDPARTYLICENSEREADME.txt");
        System.out.println(size);
    }
}