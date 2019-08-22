import java.util.*;
class Stars{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			for(int j=0;j<i;j++){
			System.out.print("*");
		}
            System.out.println();
		}
	}
}