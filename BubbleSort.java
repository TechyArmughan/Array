import java.util.Scanner;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements :");
        int i,t;
        int ar[] = new int[10];
        for( i = 0 ; i < ar.length ; i++)
        {
            ar[i] = sc.nextInt();
        }
        //Bubble sort Technique
        for(i = 0 ;i<ar.length-1 ;i++)
        {
            for(int j = 0 ; j< ar.length - i - 1;j++)
            {
                if(ar[j] > ar[j+1])
                {
                    t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
            }
        }
        System.out.println("Sorted array :");
        for(i= 0 ;i<ar.length;i++)
        {
            System.out.println(ar[i] + " ");
        }
    }
}
