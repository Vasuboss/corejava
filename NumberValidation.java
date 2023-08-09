import java.util.Scanner;

public class NumberValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		System.out.println("enter your phone number");
		 do {
				long mobile=sc.nextLong();
			 int co=0;
			while(mobile!=0){
					long r=mobile%10;
					co++;
					mobile/=10;
							
			}
			if(co==10) {
				System.out.println("valid mobile number ");
				b=false;
			}else {
				System.out.println("invalid mobile number enter agine");
			}
		}while(b);

	}

}
