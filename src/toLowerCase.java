import java.util.Scanner;

public class toLowerCase {
    public static String toLowerCase(String str) {
        str = str.toLowerCase();
        return str;
    }
    public static void main(String[] args){
        String str = new String();
        Scanner input = new Scanner(System.in);
        str = input.next();
        System.out.println(toLowerCase(str));
    }
}
