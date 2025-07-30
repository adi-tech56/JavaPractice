package IOStream;


import java.io.*;

class Student2 implements Serializable{
    private int rollno ;
    private String name;
    private float avg ;
    private String dept;
    public static int Data=10;
    public transient int t;
    public Student2(){

    }
    public Student2(int r,String n,float a,String d){
        rollno = r;
        name = n;
        avg = a;
        dept= d;
        Data = 500;
        t =500;
    }
    public String toString(){
        return "\nStudent Details\n"+
                "\nRollno"+ rollno+
                "\nname"+ name+
                "\navg"+ avg+
                "\nDept"+dept+
                "\nData"+Data+
                "\nTransient"+t +"\n";
    }
}


public class Practice2 {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fos = new FileOutputStream("/home/adishree@id.argusoft.com/Desktop/Java Tutorial/text.txt");
//        ObjectOutputStream os = new ObjectOutputStream(fos);
//        Student2 s = new Student2(10,"John",89.9f,"CSE");
//        os.writeObject(s);
//        fos.close();
//        os.close();

        FileInputStream fis = new FileInputStream("/home/adishree@id.argusoft.com/Desktop/Java Tutorial/text.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student2 s = (Student2) ois.readObject();
        System.out.println(s);
        fis.close();
        ois.close();


    }
}
