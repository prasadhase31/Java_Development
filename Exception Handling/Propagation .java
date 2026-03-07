class Propagation {

    void method1() {
        int a = 10 / 0;
    }

    void method2() {
        method1();
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.method2();
    }
}