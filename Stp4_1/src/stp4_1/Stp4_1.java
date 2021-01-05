
package stp4_1;
import java.util.Scanner;

public class Stp4_1 {

 
    public static void main(String[] args) {
        
        Scanner sr = new Scanner(System.in);
	System.out.print("Enter number of rows : ");
	int r = sr.nextInt();
		
            for(int a=1; a<=r; a++){
		for(int b=1; b<=a; b++){
                    System.out.print(" ");
		}
		for(int c=r; c>=a; c--){
                    System.out.print("*");
		}
                    System.out.println();
            } 
           
    }
    
}
