import java.util.Scanner;

public class box {

    double height, width, depth;

    box(Double h, Double w, Double d) {
        height = h;
        width = w;
        depth = d;
    }

    void volume() {
        double volume = height * depth * width;
        System.out.println("volume is: " + volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h, w, d;
        System.out.print("enter values for height,width,depth: ");
        h = sc.nextDouble();
        w = sc.nextDouble();
        d = sc.nextDouble();
        box obj = new box(h, w, d);
        sc.close();
        obj.volume();

    }
}
