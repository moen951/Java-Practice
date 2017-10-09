import java.util.Scanner;


public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		float mark;
		float total= 0;
		
		Scanner sn = new Scanner(System.in);
        
        System.out.print("How many mark you want to insert:");
        n1 = sn.nextInt();  
		
		for(int i=1; i<=n1; i++){
            System.out.println("Please insert your mark " + i);
            
            mark = sn.nextFloat();
            System.out.print("Mark: " + mark);
            System.out.println(" Has been inserted");
            
            total += mark;
       }
		System.out.println("Total is mark: " + total);
	}

}
