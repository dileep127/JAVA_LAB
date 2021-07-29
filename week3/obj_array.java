import java.util.Scanner;

class stud_det {
    String reg;
    int m1, m2, m3;
    double tot = 0, avg = 0;
    Scanner sc = new Scanner(System.in);

    stud_det(String regn, int ma1, int ma2, int ma3) {
        reg = regn;
        m1 = ma1;
        m2 = ma2;
        m3 = ma3;
    }

    void put() {
        System.out.println(reg + "\t" + m1 + "\t" + m2 + "\t" + m3 + "\t" + tot + "\n");
    }
}

class td1 extends Thread {
    stud_det std[];

    td1(stud_det st[], int n) {
        std = st;
    }

    public void run() {
        total();
    }

    void total() {
        for (stud_det i : std) {
            i.tot = i.m1 + i.m2 + i.m3;
            System.out.println("total of student " + i.reg + "is" + i.tot);
            i.tot = 0;
        }

    }
}

// second thread
class td2 extends Thread {
    stud_det std[];
    double avg1, avg2, avg3;
    int n;

    td2(stud_det st[], int n) {
        std = st;
        this.n = n;
    }

    public void run() {
        avg();
    }

    void avg() {
        for (stud_det i : std) {
            avg1 += i.m1;
            avg2 += i.m2;
            avg3 += i.m3;
        }
        System.out.println("avge of sub1: " + avg1 / n);
        System.out.println("avge of sub2: " + avg2 / n);
        System.out.println("avge of sub1: " + avg3 / n);

    }
}

public class obj_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("enter number of students: ");
        n = sc.nextInt();
        stud_det obj[] = new stud_det[n];
        int m1, m2, m3;
        String reg;

        for (int i = 0; i < n; i++) {
            System.out.println("enter reg no: ");
            reg = sc.next();
            System.out.println("enter marks of 3 sub:");
            m1 = sc.nextInt();
            m2 = sc.nextInt();
            m3 = sc.nextInt();
            obj[i] = new stud_det(reg, m1, m2, m3);
        }
        for (int i = 0; i < n; i++) {
            obj[i].put();
        }

        // thread start
        /*
         * td1 ob = new td1(obj, n); ob.start(); try { ob.join(); } catch (Exception e)
         * { System.out.println("error" + e); }
         */
        td2 ob2 = new td2(obj, n);
        ob2.start();
        try {
            ob2.join();
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

}
