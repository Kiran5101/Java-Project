package Assignments;

public class Programs {
	public void fiboSeries(int count) {
		int n1=0,n2=1;
		int temp;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=count;i++) {
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
		}
	}
	public void checkPrime(int n) {
		int Number=n,temp=0;
		for(int i=2;i<n;i++) {
			if(Number%2==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println("Is not a prime");
		}
		else {
			System.out.println("is a prime");
		}
	}
	public void checkPrimeRange(int count) {
		int max=count;
		if(max<=1) {
			System.out.println("Prime numbers are"+max);
		}else {
		for(int i=2;i<=max;i++) {
			 {
				 if(!(i%2==0))
					System.out.print(i+" ");
				}
			}
		}
		}
	public void isArmstrong(int num) {
		int Temp=num;
		int Sum=0,LastDigit=0,number,Power; 
		while(Temp !=0) {
			LastDigit=Temp%10;
			Power=(int) Math.pow(LastDigit, 3);
			Sum+=Power;
			Temp/=10;
		}
		if(Sum==num) {
			System.out.println("Given Number is a armstrong number");
		}
		else {
			System.out.println("Given Number is NOT armstrong number");
		}
	}
	
		public static void main(String[] args) {
			Programs pg=new Programs();
			//pg.fiboSeries(10);
			//pg.checkPrime(6);
			//pg.checkPrimeRange(10);
			pg.isArmstrong(1);
	}

}
