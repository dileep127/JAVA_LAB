import java.util.Scanner;

public class fuel {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float kmpl, km, fl;
        String str;
        System.out.println("enter km travelled");
        km = inp.nextInt();
        System.out.println("enter fuel required");
        fl = inp.nextInt();

        kmpl = km / fl;
        System.out.println("km per letre is:"+kmpl);
        System.out.println("a) find required fuel");
        System.out.println("b) find km travelled");
        System.out.println("enter choice to convert");
        str = inp.next();
        switch (str) {
        case "a":
            System.out.println("enter km");
            km = inp.nextFloat();
            fl = km / kmpl;
            System.out.println(fl);
            break;

        case "b":
            System.out.println("enter fuel");
            fl = inp.nextFloat();
            km = fl * kmpl;
            System.out.println(km);

            break;

        default:
            break;
        }

        inp.close();

    }
}