import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
      
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i,j;
        for(i=1;i<=num;i++){
            for(j=1;j<=num-2 ;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
    }
}
