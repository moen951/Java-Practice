import java.util.Scanner;


public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1="19.81", strVar2="15.5";
		
		float fltVar1 = Float.parseFloat(strVar1);
		float fltVar2 = Float.parseFloat(strVar2);
		
		float sum = fltVar1 + fltVar2;
		System.out.println(fltVar1+"+"+fltVar2+"="+sum);
		
		float multiply = fltVar1 * fltVar2;
		System.out.println(fltVar1+"*"+fltVar2+"="+multiply);
		
	}

}
