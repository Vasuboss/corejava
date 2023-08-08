// write a programe to print number pretterns
package jdbc;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int f=sc.nextInt();
		System.out.println("enter last number");
		int l=sc.nextInt();
		if(f>l) {
			System.out.println("invalid inputs");
		}else {
			num(f,l);
		}

	}

	public static void num(int f, int l) {
			if(f!=l) {
				System.out.println(f);
				num(f+1,l);
			}
			System.out.println(f);
		
	} 

}
