public class Method_Practice {
//    for the calling the static method from the main method and in the non static method could be calld using the
//    object creation
int max(int x,int y)
 {
     if(x>y)
     return x;
     else
     return y;

 }
    public static void main(String[] args) {
        int a =10,b=15,c;
        Method_Practice mp = new Method_Practice();
        c =mp.max(a,b);
        System.out.println(c);
    }
}
