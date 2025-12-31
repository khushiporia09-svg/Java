import java.sql.SQLOutput;

public class WideningNarrowing {
    public static void main(String[] args){
        byte b = 12;
        int i = 345;

        b = (byte)i; //narrowing
        float f =i; //widening

        System.out.println(f);
        System.out.println(Integer.parseInt("23"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Integer.toBinaryString(32));
        System.out.println(Integer.toHexString(167));
        System.out.println(Integer.toOctalString(011));
        System.out.println(Integer.parseInt("a7",16));




    }
}
