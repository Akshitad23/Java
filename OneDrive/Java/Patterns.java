import java.util.*;
public class Patterns {
    public static void SolidRect(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        int l= sc.nextInt();
        int b= sc.nextInt();
        for(int i=0; i<b; i++){
            for(int j=0; j<l; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void HalfPyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void InvertedHalfPyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void FlippedHalfPyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void NumHalfPyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void NumInvertedHalfPyramid(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void HollowRect(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        int l= sc.nextInt();
        int b= sc.nextInt();
        for(int i=0; i<l; i++){
            for(int j=0; j<b; j++){
                if (i==0 || i==l-1 || j==0 || j==b-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                //System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void FloydsTri(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        
    }
    public static void ZeroOneTri(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the triangle: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sl. no. of the desired pattern: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                SolidRect(args);
                break;
            case 2:
                HalfPyramid(args);
                break;
            case 3:
                InvertedHalfPyramid(args);
                break;
            case 4:
                FlippedHalfPyramid(args);
                break;
            case 5:
                NumHalfPyramid(args);
                break;
            case 6:
                NumInvertedHalfPyramid(args);
                break;
            case 7:
                HollowRect(args);
                break;
            case 8:
                FloydsTri(args);
                break;
            case 9:
                ZeroOneTri(args);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
