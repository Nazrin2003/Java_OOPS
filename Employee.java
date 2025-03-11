import java.util.Scanner;
class Employee1{
	int eno;
	String ename;
	int esalary;
	
	Employee1(int eno,String ename,int esalary){
		this.eno=eno;
		this.ename=ename;
		this.esalary=esalary;
	}
	public void display(){
	System.out.println("EMPLOYEE NO:"+" "+this.eno+" "+"NAME:"+this.ename+" "+"SALARY:"+this.esalary);
	}
}	
class Employee{
	
	public static void main(String []args){
	int i,flag=1;
		Scanner sc=new Scanner(System.in);
		Employee1 emp[]=new Employee1[3];
		for(i=0;i<3;i++)
		{
			System.out.println("Enter the following details of employee:");
			System.out.print("EMPLOYEE NO: ");
			int r=sc.nextInt();
			sc.nextLine();
			System.out.print("NAME: ");
			String n=sc.nextLine();
			System.out.print("SALARY: ");
			int s=sc.nextInt();	
			emp[i]=new Employee1(r,n,s);
			
		}
		System.out.println("\nEMPLOYEE DETAILS :\n");
		for(i=0;i<3;i++)
		{
		emp[i].display();
		}
		System.out.print("\nEnter employee no to search :");
		int s_no=sc.nextInt();
		for(i=0;i<3;i++)
		{
			if(emp[i].eno==s_no)
			{
			System.out.println("Employee found !");
			emp[i].display();
			flag=0;
			break;
			}
		}
		if(flag==1)
		System.out.println("Employee not found!");
	}
}

