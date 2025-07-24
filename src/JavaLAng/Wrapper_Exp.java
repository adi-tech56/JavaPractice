package JavaLAng;

public class Wrapper_Exp {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b =10;
        Byte c =15;
        Byte d= Byte.valueOf("15");
        byte bb =15;
        Byte e = Byte.valueOf(bb); //Wrapping of the primitive in the object e
        Short f = Short.valueOf("123");
        Float g = Float.valueOf("13.5");
        float x = g.floatValue(); //Unboxing from the onject to primitive
        float h = g;//Autounboxing
int m =10;
Integer n =m ;//Auto boxing
int p = n;//Auto unboxing
        Integer m4 = Integer.valueOf("10",2);
        System.out.println(m4);
        System.out.println(Integer.toHexString(30));
    }
}
