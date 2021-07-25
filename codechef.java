package mdshoaib.Array;
import java.util.Scanner;
public class codechef
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter the w1,r1,c1");
            int w1 = sc.nextInt();
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            System.out.println("Enter the w2,r2,c2");
            int w2 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int sum;
            sum= w1+r1+c1;
            System.out.println(sum);
            int summ;
            summ = w2+r2+c2;
            System.out.println(summ);

            if (sum < summ)
            {
                System.out.println("B is won");
            }
            else
                System.out.println("A is won");

        }
    }
}


