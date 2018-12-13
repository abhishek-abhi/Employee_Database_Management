import java.util.*;

public class Employee {
   private String firstName;
   private String lastName;
   private String department;
   private int experienceYears;
   private String employeeId;
   private String course;
   private int balanceFees = 0;
   private static int courseFee =600 ;
   
   private static int id= 1215;
   
   // Constructor
   public Employee(){
	   System.out.println("Enter Employee details...");
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter First name");
	   this.firstName = sc.nextLine();
	   System.out.println("Enter Last name");
	   this.lastName = sc.nextLine();
	   System.out.println("Enter the department \n 1 -> Accounting \n 2 -> Marketing "
	   		+ "\n 3 -> Product developers \n 4 -> Services section");
	   String depart;
	   int en=sc.nextInt();
	   if(en==1) {
		   depart= "Accounting";
	   }
	   else if(en==2) {
		   depart= "Marketing";
	   }
	   else if(en==3) {
		   depart= "Product developers";
	   }
	   else if(en==4) {
		   depart= "Services Section";
	   }
	   else {
		   depart= "Other department";
	   }
	   this.department = depart;
	   System.out.println("Enter experience years");
	   this.experienceYears = sc.nextInt();
	   
	   this.employeeId= setEmployeeId();
	   enrollTraining();
	   showInfo();
	   payCost();
	   showInfo();
	   id++;
   }

   // Generate Employee Id
   private String setEmployeeId() {
	   return this.department +" " + this.id;
   }
   
   // Enroll in training
   private void enrollTraining() {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter course to opt training...");
	   String t= sc.nextLine();
	   this.course=t;
	   this.balanceFees += this.courseFee; 
   }
   
   // Viewing bill details
   private void viewBill() {
	   System.out.println("Your remaining balance is : "+ this.balanceFees);
   }
   
   // Payment cost 
   private void payCost() {
	   System.out.println("Enter your payment amount : ");
	   Scanner sc = new Scanner(System.in);
	   int cost = sc.nextInt();
	   if(cost>=0)
	   balanceFees -= cost;
	   viewBill();
   }
   
   //Output details
   private void showInfo() {
	   String pr = "Employee name: "+ this.firstName+" "+this.lastName+"\n"
	   		+ "Employee Id: "+this.employeeId+"\n Experience (years): "+ this.experienceYears+"\nTraining : "+this.course+"\nTraining cost: "+this.balanceFees;
	   System.out.println(pr); 
   }
}
