public class stringFunctions {
    public static void main(String[] args) {
        String s = "   Java Programming";
        String s2="Java Programming";
        String x = s.toLowerCase();
        System.out.println("to lower case: "+x);

        x = s.toUpperCase();
        System.out.println("upper Case: "+x);

        System.out.println("length of s: "+s.length());

        x = s.trim();
        System.out.println("trim function: "+x);

        x = s.substring(2);
        System.out.println("substring function: "+x);

        String y=s.substring(2,6);
        System.out.println(y);

        x = s.replace('n','m');
        System.out.println("replace function: "+x);

        System.out.println("endswith function: "+s.endsWith("ing"));
        System.out.println("startswith function: "+s.startsWith("Ja"));

        System.out.println("charAt function: "+s.charAt(3));

        System.out.println("indexof function: "+s.indexOf("va"));

        System.out.println("lastIndexOf function: "+s.lastIndexOf("g"));

        System.out.println("equals function: "+s.equals(s2));

        System.out.println("equalsIgnore function: "+s.equalsIgnoreCase(s2));

        System.out.println("compareto function: "+s.compareTo(s2));

        System.out.println("valueof function: "+s.valueOf(3));


    }


}
