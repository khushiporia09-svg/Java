// program to separate username and domain from an email
public class stringProblem_1 {
    public static void main(String[] args) {
        String str = "khushiporia@gmail.com";
        String username;
        String domain;
        int index = str.indexOf("@");

        System.out.println(index);

        username = str.substring(0,index);

        System.out.println("Username is: "+username);

        domain = str.substring(index+1,str.length());

        System.out.println("Domain is: "+domain);
    }
}
