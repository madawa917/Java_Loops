

package stp3;
import java.util.Scanner;


public class Stp3 {

   
    public static void main(String[] args) {
      
                Scanner sr = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r = sr.nextInt();
		
		for(int a=1; a<=r; a++){
			
			for(int b=r-1; b>=a; b--){
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++){
				System.out.print("*");
			}
			System.out.println();
                }        
    }
    
}
