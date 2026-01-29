import java.util.Scanner;
class P5 {
    public static void main(String[] args) {
         
         
        int arr[]=new int[n];

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Reversed array =");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
