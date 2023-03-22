import java.util.Scanner;
class Num
{
	public static void main(String args[])
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = a.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = a.nextInt();
		int k = (num1>num2)?(num1+num2):(num2-num1);
		System.out.println(""+k);
	}
}