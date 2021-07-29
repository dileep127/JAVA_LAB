import java.util.Scanner;

public class shop {
    Scanner sc = new Scanner(System.in);
    String item_name;
    int quantity;
    double unit_price;
    double total;

    void purchase() {
        System.out.print("enter item name: ");
        item_name = sc.nextLine();
        System.out.println("enter quantity: ");
        quantity = sc.nextInt();
        System.out.println("enter unit price: ");
        unit_price = sc.nextDouble();
    }

    void calc() {
        total = unit_price * quantity;
    }

    void discount() {
        double disc = 0.0;
        if (total < 500) {
            disc = 0;
            System.out.println("total payment: " + total);
        } else if (total > 500 && total < 1000) {
            disc = total * 0.10;
            total = total - disc;
            System.out.println("amount payable after getting " + disc + " discount is: " + total);
        } else if (total > 1000 && total < 2000) {
            disc = total * 0.12;
            total = total - disc;
            System.out.println("amount payable after getting " + disc + " discount is: " + total);
        } else if (total > 2000) {
            disc = total * 0.15;
            total -= disc;
            System.out.println("amount payable after getting " + disc + " discount is: " + total);
        }
    }

    public static void main(String[] args) {
        shop obj = new shop();
        obj.purchase();
        obj.calc();
        obj.discount();
    }
}
