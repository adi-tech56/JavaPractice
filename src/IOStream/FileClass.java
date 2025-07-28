package IOStream;

import java.io.File;

public class FileClass {
    public static void main(String[] args) throws Exception {
        File f = new File("/home/adishree@id.argusoft.com/Documents/");
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();
        for(File x : list){
            System.out.print(x.getName()+ " ");
            System.out.println(x + " "+ x.getParent());
        }


    }
}
