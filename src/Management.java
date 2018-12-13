
import java.util.*;

public class Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter no of employees: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		Employee []employees= new Employee[no];
		for(int i=0;i<no;i++) {
			Employee e = new Employee();
			employees[i]=e;
			System.out.println("*********************");
		}
	}

}
