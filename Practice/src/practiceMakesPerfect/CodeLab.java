package practiceMakesPerfect;

import java.util.Scanner;

public class CodeLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Scanner stdin=new Scanner(System.in);
//		int n=0;
//
//		while(stdin.hasNextInt() && n>=0) {
//			n=stdin.nextInt();
//			if (n>100)
//			System.out.print(n+" ");
//			}
//		stdin.close();
		
//		int i =1;
//
//		int sum=0;
//
//
//		while(i>0){
//
//			i = stdin.nextInt();
//
//			if(i%2==0 && i >0){
//
//			sum = sum + i;	
//
//			}
//
//		}
//
//
//		System.out.println(sum);
//

//		int i = 1;
//		int sumEven=0;
//		int sumOdd=0;
//		
//		while(i>0) {
//			i = stdin.nextInt();
//			if(i%2==0 && i>0)
//				sumEven=sumEven+i;
//			else if (i%2 != 0 && i>0)
//				sumOdd=sumOdd+i;
//		}
//		System.out.println(sumEven+" "+sumOdd);
		
		
//		int i = 1;
//		int sumEven = 0;
//		int sumOdd = 0;
//		int evenCounter=0;
//		int oddCounter=0;
//
//		while( i > 0 ) {
//			i = stdin.nextInt();
//			if( i % 2 == 0 && i > 0) {
//				sumEven=sumEven+i;
//				evenCounter++;
//			}
//			else if ( i % 2 != 0 && i > 0) {
//				sumOdd=sumOdd+i;
//				oddCounter++;
//			}
//		}
//			System.out.print(sumEven+" "+sumOdd+" "+evenCounter+" "+oddCounter);
	
//		int land = 0;
//		int water = 0;
//		int air = 0;
//		String terminate = "a";
//
//		while (!(terminate.equals("xxxxx"))) {
//			terminate = stdin.next();
//			if (terminate.equals("land")) {
//				land++; 
//				}
//			else if (terminate.equals("air")) {
//				air++;
//				}
//			else if (terminate.equals("water")) {
//				water++;
//				}
//		}
//		System.out.println("land:"+land);
//		System.out.println("air:"+air);
//		System.out.println("water:"+water);
//				
//		int firstNum = 0;
//		int secondNum = -1;
//		int duplicate = 0;
//
//		do {
//			firstNum=stdin.nextInt();
//			if(firstNum>0 && firstNum == secondNum) 
//				duplicate++;
//			else 
//				secondNum=firstNum;
//			}
//		while(firstNum>=0);
//		
//		System.out.print(duplicate);
//		int str1 = 0;
//		int str2 = 0;
//		int n=0;
//
//
//		do {
//			str1=stdin.nextInt();
//			if(str1 != str2)
//				n++;
//			else if (str1 == str2) {
//				if (n != 0)
//					n--;
//			}
//				str2=str1;
//				System.out.println(n);
//		}
//		while (str1>0);
//		
//		System.out.println(n);
//			
//		String str1 = " ";
//		String str2 = " ";
//		String str3 = " ";
//		int n=0;
//
//
//		while(!(str1.equals("xxxxx"))) {
//			str1=stdin.next();
//			if (!(str1.equals("xxxxx")))
//			{
//				if(!(str1.equals(str2)))
//					n++;
//				else if ((str1.equals(str2)) && (n != 0) && !(str1.equals(str3))) {
//						n--;
//						str3=str1;
//			}
//			str2=str1;
//			System.out.println(n);
		System.out.println(CodeLab.add(15, 25, 5));
		}

 public static int add(int a, int b, int c) {
	 int result = a+b+c;
	 return result;
 }
				
		
	}


