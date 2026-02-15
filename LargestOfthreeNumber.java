import java.util.Scanner;

public class LargestOfthreeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int max = a;

        if(max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        System.out.println(max +" is the Largest number.");
    }
}
