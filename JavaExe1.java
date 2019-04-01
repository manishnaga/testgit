package Exe1.module1;

public class JavaExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
//using for loop in this case..!!!
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

	}

}
