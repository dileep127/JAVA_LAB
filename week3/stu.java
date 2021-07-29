import java.util.Scanner;

class t1 extends Thread {
    int star[][] = new int[2][5];
    int sum = 0;

    t1(int a[][]) {
        star = a;
        start();
    }

    public void run() {
        System.out.println("total marks: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 4; j++) {
                sum += star[i][j];
            }
            System.out.println("sum of " + (i + 1) + " student is " + sum);
            sum = 0;
        }
    }
}

class t2 extends Thread {
    int star[][] = new int[2][5];
    double avg = 0, sum = 0;

    t2(int a[][]) {
        star = a;
        start();
    }

    public void run() {

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                sum += star[j][i];
            }
            avg = sum / 2;
            System.out.println("avg: " + avg);
            sum = avg = 0;
        }
    }
}

class t3 extends Thread {
    int star[][] = new int[2][5];
    int fin[] = new int[2];
    int m1[] = new int[2];
    int m2[] = new int[2];
    int m3[] = new int[2];
    int sum, mk1, mk2, mk3;

    t3(int a[][]) {
        star = a;
        start();
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 4; j++) {
                sum += star[i][j];
            }
            fin[i] = sum;
            // System.out.println("sum of " + (i + 1) + " student is " + sum);
            sum = 0;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 4; j++) {
                mk1 = star[i][1];
                mk2 = star[i][2];
                mk3 = star[i][3];
            }
            m1[i] = mk1;
            m2[i] = mk2;
            m3[i] = mk3;
            mk1 = mk2 = mk3 = 0;

        }

        for (int i = 0; i < 1; i++) {
            if (fin[i] < fin[i + 1]) {
                int temp = fin[i + 1];
                fin[i + 1] = fin[i];
                fin[i] = temp;

                int tmp1 = m1[i + 1];
                m1[i + 1] = m1[i];
                m1[i] = tmp1;

                int tmp2 = m2[i + 1];
                m2[i + 1] = m2[i];
                m2[i] = tmp2;

                int tmp3 = m3[i + 1];
                m3[i + 1] = m3[i];
                m3[i] = tmp3;
            }
        }
        System.out.println("descending order: ");
        for (int i = 0; i < 2; i++) {
            System.out.println(m1[i] + "\t" + m2[i] + "\t" + m3[i] + "\t" + fin[i] + "\n");
        }
    }

    public class stu {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // int n;
            // System.out.println("enter number of students: ");
            // n = sc.nextInt();
            int st[][] = new int[2][5];
            double total = 0;
            System.out.println("enter array elements: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    st[i][j] = sc.nextInt();
                }
            }

            System.out.println("regno\t" + "mark1\t" + "mark2\t" + "mark3\t" + "total");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(st[i][j] + "\t");

                }
                System.out.print(total);
                System.out.println();
            }
            t1 t1obj = new t1(st);
            t2 t2obj = new t2(st);
            t3 t3obj = new t3(st);

            try {
                t1obj.join();

                t2obj.join();
                t3obj.join();
            }

            catch (Exception e) {
                System.out.println("error" + e);
            }

        }
    }
}