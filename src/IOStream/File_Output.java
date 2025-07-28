package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output {
    public static void main(String[] args) {
        try{
//            FileOutputStream f  =  new FileOutputStream("/home/adishree@id.argusoft.com/Desktop/Java Tutorial/text.txt");
//            System.out.println("Hii");
//            String str = "Learn Java Now";
//            byte b[] = str.getBytes();
//            f.write(str.getBytes());
//            f.write(b,6,str.length()-6);
//f.close();
            FileInputStream f = new FileInputStream("/home/adishree@id.argusoft.com/Desktop/Java Tutorial/text.txt");
             byte b[] = new byte[f.available()];
             f.read(b);
             String str = new String(b);
            System.out.println(str);

        }
     catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
