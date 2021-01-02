
package stp1;
import java.util.Scanner;

public class Stp1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int r = sr.nextInt();
        
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
