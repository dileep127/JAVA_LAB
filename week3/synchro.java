//import java.util.Scanner;
class myt {
    public synchronized void pnt(String msg) {
        for (int i = 0; i < 5; i++) {
            System.out.println(msg);
        }
    }
}

class mt extends Thread {
    String msg;
    myt tar;

    mt(myt targ, String s) {
        tar = targ;
        msg = s;
    }

    public void run() {
        tar.pnt(msg);
    }

}

public class synchro {
    public static void main(String[] args) throws Exception {

        myt targ = new myt();
        mt o = new mt(targ, "hello");
        mt o2 = new mt(targ, "byee");
        o.start();
        o2.start();

        o.join();
        o2.join();

    }
}
