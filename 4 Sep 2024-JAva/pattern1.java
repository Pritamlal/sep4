import java.util.Scanner;

class pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i,j;
        for(i=1;i<=num;i++){
            for(j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}