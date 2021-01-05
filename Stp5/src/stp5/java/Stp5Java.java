
package stp5.java;
import java.util.Scanner;

public class Stp5Java {

    public static void main(String[] args) {
      
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
	int r = sr.nextInt();
        
		
	for(int a=1; a<=r; a++){
			
            for(int b=r; b>=a; b--){
		System.out.print(" ");
            }
            for(int c=1; c<(a*2); c++){
		System.out.print("*");
                
            }
            System.out.println();
        }        
    }
    
}
