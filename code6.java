package daytwo;

public class code6 {

    int a = 20;
    int b = 10;

    void m1(int a, int b) {
        System.out.println("v " + (this.a + this.b));
        System.out.println("v " + (a + b));
    }

    public static void main(String[] args) {

        code6 vv = new code6();

        vv.m1(4, 3);
    }
}