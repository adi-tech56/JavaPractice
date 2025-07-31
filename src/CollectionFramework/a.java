package CollectionFramework;
// public class a{
//    public class b{
//        public static void c(){
//            System.out.println("hii");
//        }
//    }
//}
// class st {
//    public static void main(String[] args) {
//        a.b.c();
//
//    }
//}

//public class a{
//    public class b{
//        public class c{
//            public void d() {
//                System.out.println("hii");
//            }
//        }
//    }
//}
//class st {
//    public static void main(String[] args) {
////        a A = new a();
////        a.b B = A.new b();
//        new a().new b().new c().d();
////        C.d();
//
//
//    }
//}
public class a{
    public class b{
        public class c{
            public static void d() {
                System.out.println("hii");
            }
        }
    }
}
class st {
    public static void main(String[] args) {

       a.b.c.d();
//        C.d();


    }
}