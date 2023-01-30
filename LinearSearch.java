import java.util.Scanner;
public class MAin
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 10 elements :");
        int arr[] = new int[10];
        int i;
        for(i = 0 ; i < 10;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search :");
        int key = sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Number found on index "+i);
                break;
            }
        }
    }
}
