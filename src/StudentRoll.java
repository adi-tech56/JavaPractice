import java.util.Date;

class Student{
    private String Rollno;

    public String getRollno() {
        return Rollno;
    }

    private static int count=1;
    private String genarateRoll(){
        Date d= new Date();
        String rn = "Univ"+(d.getYear()+1900)+"_"+count;
        count ++;
        return rn ;

    }
    public Student(){
        Rollno = genarateRoll();
    }
}


public class StudentRoll {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getRollno());
        Student s2 = new Student();
        System.out.println(s2.getRollno());
    }
}
