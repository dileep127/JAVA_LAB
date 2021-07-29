import java.util.Scanner;

class string_operation {
    public static void main(String args[]) {
        String str1, str2;
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        str1 = sc.next();
        System.out.println("enter second string: ");
        str2 = sc.next();
        System.out.println("enter starting string and number of characters");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        String up = str1.toUpperCase();
        String low = str2.toLowerCase();
        System.out.println("uppercase: " + up);
        System.out.println("lowecase: " + low);
        System.out.println("substring is: " + str1.substring(n1, n2));
        StringBuffer strbfr = new StringBuffer(str1);
        StringBuffer strbfr2 = new StringBuffer(str1);
        System.out.println("after inserting: " + strbfr.insert(n1, str2));
        System.out.println("after append: " + strbfr2.append(" " + str2));

        sc.close();
    }
}
