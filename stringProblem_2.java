public class stringProblem_2 {
    public static void main(String[] args) {
        String n = "hello@$%#@23";
        String n1 = n.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(n1);

    }
}
