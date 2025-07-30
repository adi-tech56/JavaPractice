package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
   private String name;
   private int rollno;
   public Student (String name,int rollno){
       this.name=name;
       this.rollno= rollno;
   }
   public String getName(){
       return name;
   }
   public int getRollno(){
       return rollno;}
     
   @Override 
   public String toString(){
       return "Student Name"+ name+ "   rollno:"+ rollno+" ";
   }
    @Override
    public int compareTo(Student other) {
//        return this.rollno - other.rollno;
        return this.getName().compareTo(other.getName());
    }
           
}
 class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}
class RollComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return s1.getRollno()-s2.getRollno();
    }
}



public class Practice2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Glice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));
        Collections.sort(students);
//        Collections.sort(students, new NameComparator()); // Sorts by name
//        Collections.sort(students, new RollComparator());
        System.out.println(students);
    }
}
