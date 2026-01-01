

import java.util.Scanner;
class triangles{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three angles");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total=a+b+c;
         
        if(total==180){
            System.out.println("Triangle is valid ");
        }else{
            System.out.println("Triangle is not valid ");
            
        }

       

    }
}