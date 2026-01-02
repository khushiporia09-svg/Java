public class stringRegularExpression {
    public static void main(String[] args) {
        String s = "java1";
        String str = "P";
        System.out.println(s.matches(".")); // for checking single character
        System.out.println(s.matches("java1"));
        System.out.println(s.matches("^java1"));
        System.out.println(s.matches("[a-z]"));
        System.out.println(str.matches("U|P"));
    }
}
