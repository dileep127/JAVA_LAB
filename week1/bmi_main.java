
import java.util.Scanner;

class bmi {
    float kg;
    float height_in_cm;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("enter ur weight in kg: ");
        kg = sc.nextFloat();
        System.out.println("enter ur weight in cm ");
        height_in_cm = sc.nextFloat();
    }

    float calc() {
        float meter = height_in_cm / 100;
        // System.out.println(meter);
        meter = meter * meter;
        // System.out.println(meter);
        float bmi = kg / meter;
        // System.out.println("bmi=" + bmi);
        sc.close();
        return bmi;
    }

    void disp() {
        if (calc() < 18.5) {
            System.out.println("underweight");

        } else if (calc() > 18.5 && calc() < 24.9) {
            System.out.println("normal");
        } else if (calc() > 25 && calc() < 29.9) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
    }
}

class bmi_main {
    public static void main(String[] args) {
        bmi bmi_obj = new bmi();
        bmi_obj.input();
        System.out.println("bmi= " + bmi_obj.calc());
        bmi_obj.disp();
    }
}
