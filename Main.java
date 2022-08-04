import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee1 implements Comparable<Employee1>{
int cid;
String name;
int salary;
int age;

Employee1(int cid,String name,int salary,int age){
this.cid=cid;
this.name=name;
this.salary=salary;
this.age=age;
}

public void setsalary(int cid) {
this.salary = cid;
}


public int compareTo(Employee1 st){
if(name==st.name)
return 0;
else if(name.compareTo(st.name)<0)
return 1;
else
return -1;
}
}

public class Main {
	public static void main(String args[]){
		ArrayList<Employee1> al=new ArrayList<Employee1>();

		al.add(new Employee1(101,"kareeshma",5000,23));
		al.add(new Employee1(106,"Yamini",6000,27));
		al.add(new Employee1(105,"monica",7000,21));
		al.add(new Employee1(102,"yuvaa",8000,23));
		al.add(new Employee1(103,"swathy",9000,27));
		al.add(new Employee1(104,"pragathi",2200,21));
		al.add(new Employee1(107,"shiva",6600,23));
		al.add(new Employee1(108,"Gowtham",8900,27));
		al.add(new Employee1(109,"sorna",9000,21));
		al.add(new Employee1(110,"nandhini",8700,23));


		int len=al.size();
		Scanner sc= new Scanner(System.in);


		String whilechoice="go";
		while (whilechoice=="go"){

		String avail="False";
		System.out.print("Enter Your Choice ");
		System.out.print("1-->Employee Data 2-> Employee Data in Descending Order. 3-->Update Employee Salary. 4--> Exit " );
		System.out.print(" ");
		int a= sc.nextInt();

		switch (a) {

		case 1:
		System.out.println("");
		System.out.println("Employee Data .. ");

		System.out.println("EmployeeId Name Salary Age");

		for(Employee1 st:al){
		System.out.println(st.cid+" "+st.name+" "+st.salary+" "+st.age);
		}
		break;


		case 2:
		System.out.println("");
		System.out.println("Employee Data in Descending Order.. ");

		System.out.println("EmployeeId Name Salary Age");

		Collections.sort(al);
		for(Employee1 st:al){
		System.out.println(st.cid+" "+st.name+" "+st.salary+" "+st.age);
		}
		break;
		case 3:

		System.out.println("");
		System.out.println("Enter Employee id to update Salary.. ");

		int b= sc.nextInt();
		System.out.println("Enter the new Salary ");
		int c= sc.nextInt();


		for(int i=0; i<len;i++){
		if (al.get(i).cid==b){
		al.get(i).setsalary(c);
		avail="True";
		System.out.println("Updated Salary.." + al.get(i).cid+" "+al.get(i).name+" "+al.get(i).salary+" "+al.get(i).age);
		}}
		if("False".equals(avail)){
		System.out.println("Invalid Employee ID");
		}

		break;


		case 4:
		System.out.println("");
		whilechoice="stop";
		System.out.println("Exit Done ");
		break;
		}
		}
		}
}

