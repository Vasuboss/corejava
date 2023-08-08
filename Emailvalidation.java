// check given email corect or not ask agine email
package first;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you email");
		boolean b=true;
		do {
			String email=sc.next();
			String a="@gmail.com";
			String c="";
			int te=email.length()-1;
			
			for(int i=0;i<a.length();i++) {
				c=email.charAt(te--)+c;
			}
			if(c.equals(a)) {
				System.out.println("valid email");
				b=false;
			}else {
				System.out.println("invalid email enter  agine");
			}
			
		}while(b);

	}

}
