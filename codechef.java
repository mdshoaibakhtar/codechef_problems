/*package mdshoaib.chef;
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

//chessFormat------->Codechef-->starter 7-->problem code CHSFORMT
package mdshoaib.chef;

import java.util.Scanner;

public class codechef
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Test Cases");
        int T = sc.nextInt();

        for (int i = 0;i<T;i++)
        {
            System.out.println("Enter The Value of a & b");
            int a= sc.nextInt();
            int b= sc.nextInt();
            if (a+b<3)
            {
                System.out.println("1");
            }
            else if(a+b>=3 && a+b<=10)
            {
                System.out.println("2");
            }
            else if(a+b>= 11 && a+b <=60)
            {
                System.out.println("3");
            }
            else
            {
                System.out.println("4");
            }
        }
    }
}

//July Cook Off 2021  Div-3(Shoe Fit)
package mdshoaib.chef;
import java.util.Scanner;
public class codechef
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Test Cases");
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A==0 && B==1 || A==0 && C==1 || B==0 && C==1 || A==1 && B==0 || A==1 && C==0 || B==1 && C==0)
            {
                System.out.println("1");
            }
            else
                System.out.println("0");
        }
    }
}*/

package mdshoaib.chef;

import java.util.Scanner;

public class codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of test cases");
        int T = sc.nextInt();
        for (int i=0;i<T;i++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int AB = A+B;
            int BC = B+C;
            int AC = A+C;

            System.out.println(AB);
            System.out.println(BC);
            System.out.println(AC);

            if (AB > BC && AB > AC)
            {
                System.out.println("Greater is "+AB);
            }
            if (BC > AB && BC > AC)
            {
                System.out.println("Greater is "+BC);
            }
            else
            {
                System.out.println("Greater is "+AC);
            }
        }
    }
}





























