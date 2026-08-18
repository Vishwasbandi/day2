package daytwo;

public class code7 {

    int a;
    int b;

    void m1(int c, int d) {
        a = c;
        b = d;
    }

    void m2() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        code7 vv = new code7();

        vv.m1(4, 9);
        vv.m2();
    }
}