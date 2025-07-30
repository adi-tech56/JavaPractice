package IOStream;

import java.io.*;

class Student{
    int rollno;
    String name;
    String dept;
}
public class Practice1{

    public static void main(String[] args) throws Exception {
//        FileOutputStream fs = new FileOutputStream("/home/adishree@id.argusoft.com/Desktop/Java Tutorial/text.txt");
//        PrintStream ps =new PrintStream(fs);
//        Student s = new Student();
//        s.rollno = 12;
//        s.name="Ram";
//        s.dept= "CSE";
//        ps.println(s.rollno);
//        ps.println(s.dept);
//        ps.println(s.name);
//        ps.close();
//        fs.close();
        FileInputStream fis = new FileInputStream("/home/adishree@id.argusoft.com/Desktop/Java Tutorial/text.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println(s.name + " " + s.dept + " "+s.rollno);
        
   
    }

}
