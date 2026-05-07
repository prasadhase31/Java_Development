import java.util.function.Supplier;

class Demo3 {
    public static void main(String[] args) {

        Supplier<String> s = () -> "Java";

        System.out.println(s.get());
    }
}