package Pract;
class InalidValueException extends Exception{
    public String toString(){
        return "Dimesions can't be negative";
    }
}
public class Exception_2 {
   static int area(int l, int b) throws InalidValueException {
       if(l<0 || b<0)
           throw new InalidValueException();
       return l*b;
   }
static void meth1() throws InalidValueException {
    System.out.println(area(-9,3));
}
    public static void main(String[] args) {
        try {
            meth1();
        }
        catch (InalidValueException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Program is completed");
        }




    }}
