
package stp4_2;
import java.util.Scanner;

public class Stp4_2 {

    public static void main(String[] args) {
      
        Scanner sr = new Scanner(System.in);
	System.out.print("Enter number of rows : ");
	int r = sr.nextInt();
		
	for(int a=1; a<=r; a++){
			
            for(int b=r; b>=a; b--){
				
		System.out.print("*");
            }			
            if(a<r){
				
		System.out.println();
				
		for(int c=1; c<=a; c++){
					
		    System.out.print(" ");
		}
            }
	}
    }
    
}
