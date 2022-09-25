import java.lang.*;
import java.util.*;

class Karr2{
	// for Q8
	static public int func(int var){
		var = ~var^~4;
		return var++;
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		// Q6 
		System.out.println("Answer for Q6");
		int i=1;
		do{
			i=5;
			System.out.println(--i);
		}while(i==0);
		System.out.println();
		
		// Q7
		System.out.println("Answeer for Q7");
		int num=4;
		
		System.out.println(num & num);
		System.out.println(num | num);
		System.out.println(num ^ num);
		System.out.println(~num);
		
		// Q8
		System.out.println("Answer for Q8");
		
		int a = 10;
		System.out.println(func(a++));
		
		//Q9
		
		System.out.println("Answer for Q9");
		int ctr;
		for(ctr=0; ctr<=7; ctr++){
			System.out.print(ctr+" ");
		}
		System.out.println();
		
		// Q10
		System.out.println("Answer for Q10");
		i=3;
		switch(i & 1){
			case 0:
			System.out.println("Even");
			break;
			case 1:
			System.out.println("Odd");
			break;
			default:
			System.out.println("Default");		
		}	
	}
}