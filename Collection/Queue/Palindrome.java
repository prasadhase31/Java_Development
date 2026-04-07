import java.util.*;
class Palindrome{

    public static void main(String[] args) {

 Queue<Integer> q = new LinkedList<>();
q.offer(1);
q.offer(2);
q.offer(2);
q.offer(1);

Stack<Integer> st = new Stack<>();

for(int num : q){
    st.push(num);
}

boolean isPalindrome = true;

for(int num : q){
    if(num != st.pop()){
        isPalindrome = false;
        break;
    }
}

System.out.println(isPalindrome); 
}
}




       