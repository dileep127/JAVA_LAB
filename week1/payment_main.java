import java.util.Scanner;

class payment {
    int hrs_worked;
    double rate;
    double payment_amount = 0;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("enter no of hrs worked: ");
        hrs_worked = sc.nextInt();
        System.out.println("enter the hourly rate: ");
        rate = sc.nextDouble();
    }

    void calc() {
        if (hrs_worked <= 40) {
            payment_amount = hrs_worked * rate;
        } else if (hrs_worked > 40) {
            int ot = 0;
            ot = hrs_worked - 40;
            payment_amount = 40 * rate + (ot * (rate * 1.5));
        }
        System.out.println("the total pay" + payment_amount);
        sc.close();
    }
}

class payment_main {
    public static void main(String[] args) {
        payment pmnt = new payment();
        pmnt.input();
        pmnt.calc();
    }
}
