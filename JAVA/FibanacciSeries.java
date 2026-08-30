import java.util.Scanner;
public class FibanacciSeries {
    public static void main(String[] args){
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i ++){
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }

    
}
