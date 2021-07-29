import java.util.Scanner;

class emp {

    String name, code;
    double basic, hra, it, pf, net_sal, gross_sal;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("enter employee name");
        name = sc.nextLine();
        System.out.println("enter emp code");
        code = sc.nextLine();
        System.out.println("enter basic sal of employee");
        basic = sc.nextDouble();
    }

    // calculate function
    public void sal_calc() {
        hra = basic * 0.075;
        it = 200;
        pf = basic * 0.12;

        gross_sal = basic + hra;
        net_sal = gross_sal - (it + pf);
    }

    public void disp() {
        System.out.println("employeee name is: " + name);
        System.out.println("employee code is: " + code);
        System.out.println("gross salary of " + name + " is " + gross_sal);
        System.out.println("net salary of " + name + " is " + net_sal);
        sc.close();
    }
     public static void main(String[] args) {
	        emp obj = new emp();
	        obj.input();
	        obj.sal_calc();
	        obj.disp();
    }
}

