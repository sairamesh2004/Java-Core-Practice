import java.util.Scanner;

class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int isPrime = 1;
        int i;

        if (num <= 1)
        {
            isPrime = 0;
        }
        else
        {
            for (i = 2; i <= num / 2; i++)
            {
                if (num % i == 0)
                {
                    isPrime = 0;
                    break;
                }
            }
        }

        if (isPrime == 1)
        {
            System.out.println(num + " is a Prime Number");
        }
        else
        {
            System.out.println(num + " is Not a Prime Number");
        }
    }
}
