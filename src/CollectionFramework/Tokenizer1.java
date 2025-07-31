package CollectionFramework;

import java.util.StringTokenizer;

public class Tokenizer1 {
    public static void main(String[] args) {


    String data= "name=vijacy;address=Delhi;country=India";
        StringTokenizer skt = new StringTokenizer(data,";");
        String s;
        while(skt.hasMoreTokens()){
            s = skt.nextToken();
            System.out.println(s);
        }

    }
}
