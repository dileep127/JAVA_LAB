import java.util.Scanner;

class points {
	private int x, y;

	points(int a, int b) {
		x = a;
		y = b;
	}

	double dist(points p2) {
		double dis;
		dis = Math.sqrt(Math.pow((x - p2.x), 2) + Math.pow((y - p2.y), 2));
		return dis;
	}

	void dist(int c, int d) {
		double dis;
		dis = Math.sqrt(Math.pow((x - c), 2) + Math.pow((y - d), 2));
		System.out.println("distance from p1 and p2 is: " + dis);
	}
}

class distance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, f;
		points p1, p3;

		System.out.println("Input the quardinates for p1:");
		a = sc.nextInt();
		b = sc.nextInt();
		p1 = new points(a, b);
		System.out.println("Inputthe quardinates for p2:");
		c = sc.nextInt();
		d = sc.nextInt();
		p1.dist(c, d);

		System.out.println("Input the quardinates for p3:");
		e = sc.nextInt();
		f = sc.nextInt();
		p3 = new points(e, f);
		sc.close();

		System.out.println("Distance between p1 and p3:" + p1.dist(p3));
	}
}