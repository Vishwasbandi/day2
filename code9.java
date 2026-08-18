package daytwo;

public class code9 {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        code9 test = new code9();

        test.setA(11);

        int aa = test.getA();

        System.out.println(aa);
    }
}