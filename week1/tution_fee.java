public class tution_fee {
    double fee = 50000;

    public void calc() {
        double pay = fee;
        for (int i = 0; i < 10; i++) {

            fee = fee + pay * 0.05;
            System.out.println(fee);
        }
    }

    public static void main(String[] args) {

        tution_fee tf = new tution_fee();
        tf.calc();

    }
}
