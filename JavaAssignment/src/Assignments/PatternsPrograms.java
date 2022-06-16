package Assignments;

public class PatternsPrograms {

	public void pattern(int rows) {
		int R=rows;
		for(int i=0;i<R;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("u");
		}
	}
	public static void main(String[] args) {
		PatternsPrograms p=new PatternsPrograms();
		p.pattern(4);
	}
}
