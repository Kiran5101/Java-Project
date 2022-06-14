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
		public static void main(String[] args) {
			Programs pg=new Programs();
			pg.fiboSeries(10);
			pg.checkPrime(6);
	}

}
