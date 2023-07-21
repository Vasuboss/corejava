// write a programe non fibhanosis numbers with in given reange
package jdbc;

import java.util.Scanner;

public class fibhanocic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,num=0;
		System.out.println("enter stop number");
		int stop=sc.nextInt();
		while(num++<=stop) {
		if(fib(a,b,num)==1) {
			System.out.println("not afibanosis number: "+num);
		}
		}
	}

	public  static int fib(int a, int b,int num) {
		
		while(a+b<=num) {
			int c=a+b;
			if(c==num) {
				return 0;
			}
			a=b;
			b=c;
		}
		return 1;
	}

}
