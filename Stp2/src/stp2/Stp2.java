
package stp2;
import java.util.Scanner;

public class Stp2 {

    public static void main(String[] args) {
        
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int r = sr.nextInt();
        
        for(int i=1; i<=r; i++){
            for(int j=r; j>=i; j--){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
