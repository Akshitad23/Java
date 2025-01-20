import java.util.*;
public class AdvancedPatterns {
    public static void FullPyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void FullNumPyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
    public static void PalindromePyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(j<=i?j:2*i-j);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        //FullPyramid(args);
        //FullNumPyramid(args);
        PalindromePyramid(args);
    }
}
