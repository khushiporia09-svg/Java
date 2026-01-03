public class stringRegularExpression {
    public static void main(String[] args) {
        String s = "java1";
        String str = "P";
//        System.out.println(s.matches(".")); // for checking single character
//        System.out.println(s.matches("java1"));
////        System.out.println(s.matches("[^java1]"));
//        System.out.println(str.matches("[A-Z]"));
//        System.out.println(str.matches("U|P"));
//        System.out.println(str.matches("[A-Z1-9]"));

        // meta characters
        String s1 = "3";
//        System.out.println(s1.matches("\\d")); //for checking the single digit
//        System.out.println(s1.matches("\\D")); //for checking non digit values
//        System.out.println(s1.matches("\\s")); // for checking space
//        System.out.println(s1.matches("\\S")); //not for space
//        System.out.println(s1.matches("\\w")); //for checking alphabet or digit
//        System.out.println(s1.matches("\\W")); //not for alphabet or digit

        // Quantifiers
        String s2 = "abc";
        System.out.println(s2.matches("[a-z]*")); //for checking multiple characters from 0 to more time
        System.out.println(s2.matches("[a-z]+")); //1  to more
        System.out.println(s2.matches("[a-z]?")); //for only 1 time or 0 time
        System.out.println(s2.matches("[a-z]{3}")); // for fixing the characters
        System.out.println(s2.matches("[a-z]{3,8}")); // giving range


    }
}
