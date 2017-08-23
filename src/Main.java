/**
 * Created by benaissa on 8/23/17.
 */
public class Main {
    public static void main(String [] args)
    {
        String s1 = "Welcome to California!";
        System.out.println("Length to string: "+s1.length());

        int position = s1.indexOf("California");
        System.out.println("Position of substring: "+position);

        String sub = s1.substring(11);
        System.out.println(sub);
    }
}
