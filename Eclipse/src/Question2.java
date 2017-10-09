import java.util.Scanner;


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
        
        System.out.print("Please enter first number:");
        float n1 = sn.nextFloat();       
        
        System.out.print("Please enter second number:");
        float n2 = sn.nextFloat();
        
        float product = n1 + n2;
        System.out.println(n1+"+"+n2+"="+product);
	}

}
