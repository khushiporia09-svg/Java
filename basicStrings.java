public class basicStrings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String(s1);
       String str = "JAVA";
       String s = new String("JAVA");
       char c[] = {'J','A' ,'V','A'};
       char a[]={65,66,67,68};
       byte b[] = {65,66,67,68};
       String s3 = new String(b);

        System.out.println(b);
        System.out.println(s3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c);

        System.out.println(str.length());

        System.out.println(str==s);

        System.out.println(str.equals(s));

        System.out.println(a);
    }
}
