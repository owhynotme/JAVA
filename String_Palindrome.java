import java.util.Scanner;

class Palindrome {
    String s = new String();
    Scanner sc = new Scanner(System.in);

    Palindrome() {
        System.out.println("Enter String");
        s = sc.nextLine();
        int i, j, flag = 0;
        i = 0;
        j = s.length() - 1;

        while (i < j && flag == 0) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = 1;
            }
            i++;
            j--;
        }

        if (flag == 0) {
            System.out.println("Yes it is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

    }
}

public class String_Palindrome {

    public static void main(String a[]) {
        Palindrome obj = new Palindrome();
    }

}
