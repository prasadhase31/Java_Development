public class Duplicate {
    public static void main(String[] args) {

        String str = "programming";

        char[] ch = str.toCharArray();

        System.out.println("Duplicate characters are:");

        for(int i = 0; i < ch.length; i++) {
            for(int j = i + 1; j < ch.length; j++) {

                if(ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    break;  
                }
            }
        }
    }
}