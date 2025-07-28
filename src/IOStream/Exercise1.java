package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("/home/adishree@id.argusoft.com/IdeaProjects/Practice/src/IOStream/Source1.txt");
        FileOutputStream f1= new FileOutputStream("/home/adishree@id.argusoft.com/IdeaProjects/Practice/src/IOStream/Source2.txt");
        int b ;
        while ((b = f.read())!= -1){
            if(b>=65 && b <=90)f1.write(b+32);
            else f1.write(b);
        }
        f.close();
        f1.close();
    }
}
