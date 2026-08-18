package daytwo;

public class code3 {

    class Parents {

        void property() {
            System.out.println("Property");
        }

        void marry() {
            System.out.println("Family selected girl/boy");
        }
    }

    class Demo extends Parents {
        void marry() {
            System.out.println("Campus selected girl/boy");
        }

        public static void main(String[] args) {

            code3 obj = new code3();
            Demo test = obj.new Demo();

            test.marry();
            test.property();
        }
    }
}