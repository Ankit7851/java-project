import java.util.Scanner;
public class ReversANumber {
    public static void main(String args[]){
        System.out.println("Enter the nu");
        Scanner sc=new Scanner(System.in);
        int nu=sc.nextInt();
        int rem, rev = 0;
        while(nu != 0) {
            rem = nu%10;
            rev = rev*10+rem;
            nu = nu/10;
        }
        System.out.println(rev);
    }
}