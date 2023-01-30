package HelloWorld;
import java.util.*;

class Employee{
	private int eno;
	private String ename;
	private int salary;

	
	Employee(int salary, String ename, int eno){
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpno(){
		return eno;
	}
	public int getSalary(){
		return salary;
	}
	public String getEname(){
		return ename;
	}
	
	public String toString(){
		return eno+" "+ename+" "+salary;
	}
}

class CRUDDemo{
	public static void main(String[] args) {
		
		Collection<Employee> c = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Welcome to LockedMe (Developed by Phil)");
			System.out.println("1.Display Files");
			System.out.println("2.Add File");
			System.out.println("3.Delete File");
			System.out.println("4.Search Files");
			System.out.println("5.Exit");
			System.out.print("Enter your choice: ");
			ch = s.nextInt();
			
			switch(ch) {
				case 2:
					System.out.print("Enter Employee #: ");
					int eno = s.nextInt();
					System.out.print("Enter Employee Name : ");
					String ename = s1.nextLine();
					System.out.print("Enter Salary : ");
					int salary = s.nextInt();
					
					c.add(new Employee(eno,ename,salary));
				break;
				case 1:
					System.out.println("--------------------------------");
					Iterator<Employee> i = c.iterator();
					while(i.hasNext()) {
						Employee e = i.next();
						System.out.println(e);
					}
					System.out.println("--------------------------------");
				break;
				
				case 4:
					boolean found = false;
					System.out.println("Enter Employee # to Search :");
					eno = s.nextInt();
					System.out.println("--------------------------------");
					i = c.iterator();
					while(i.hasNext()) {
						Employee e = i.next();
						if(e.getEmpno() == eno)	{
							System.out.println(e);
							found = true;
						}
					}
			
					if(!found){
						System.out.println("Record Not Found");
					}
					System.out.println("--------------------------------");
				break;
			
				case 3:
					found = false;
					System.out.println("Enter Employee # to Delete :");
					eno = s.nextInt();
					System.out.println("--------------------------------");
					i = c.iterator();
					while(i.hasNext()) {
						Employee e = i.next();
						if(e.getEmpno() == eno)	{
							i.remove();
							found = true;
						}
					}
					
					if(!found){
						System.out.println("Record Not Found");
					}else{
						System.out.println("Record is Deleted Successfully!");
					}
					System.out.println("--------------------------------");
				break;
			}
		}while(ch!=5);
		{
		System.out.println("Thank you for using this program");
	}
}

}