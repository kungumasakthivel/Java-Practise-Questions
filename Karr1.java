import java.lang.*;
import java.util.*;

class Karr1{
	
	public static void main(String args[]){
		// Q1
		System.out.println("Answer for Q1");
		Scanner sc=new Scanner(System.in);
		int index;
		for(index=0;index<5;index++){
			System.out.print(index+" ");
			if(index==1){
				break;
			}
		}
		System.out.println();
		
		// Q2
		System.out.println("Answer for Q2");
		int x,y;
		for(x=5; x>0; x--){
			for(y=1; y<=x; y++){
				System.out.print(y);
			}
		}
		System.out.println();
		
		//Q3
		System.out.println("Answer for Q3");
		x=7;
		y = 1 << x;
		System.out.println(x + " " + y);
		
		//Q4
		System.out.println("Answer for Q4");
		int a = 3;
		switch(a){
			default:
			a=5;
			System.out.println("Default :"+a);
			case 4:
			a = a++;
			System.out.println("Case 4 :" +a);
			case 3:
			a = a + 2;
			System.out.println("Case 3 :"+a);
			case 2:
			a = a + 1;
			System.out.println("Case 2 :"+a);
		}
		System.out.println(a);
		
		// Q5
		System.out.println("Annswer for Q5");
		int num = 10;
		if(num++ > 9 && num++!=10 && num++>11){
			System.out.println(num);
		}else{
			System.out.println(num+1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}