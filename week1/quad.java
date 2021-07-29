import java.util.Scanner;
public class quad {

  public static void main(Double[] args) {


    double a,b,c;
    //Scanner sc=new Scanner(System.in);
    System.out.println("enter value for a"+args[0]);
    //a=sc.nextDouble();
    a=args[0];

    System.out.println("enter value for b"+args[1]);
   // b=sc.nextDouble();
   b=args[1];

    System.out.println("enter value for c"+args[2]);
   // c=sc.nextDouble();
   c=args[2];

    double root1, root2;


    double determinant = b * b - 4 * a * c;


    if (determinant > 0) {


      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 ="+root1+"root2 = "+root2);
    }


    else if (determinant == 0) {

      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = "+ root1);
    }


    else {


      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.println("roots are imaginary");
    }
  }
}