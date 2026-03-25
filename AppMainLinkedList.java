 package com.Employees;
 import com.aman.LinkedList;
import com.aman.Node;
import com.calender.ConsoleInput;

public class AppMainLinkedList {
	static final int ADD_EMPLOYEE =1,
					 DISPLAY =2,
					 SORT =3,
					 SORT_EMPLOYEES =3,
					 ADD_MANAGER=1,
					 ADD_ENGINEER =2,
					 ADD_SALSEPERSON=3,
					 DISPLAY_LAST =3,
					 DISPLAY_FIRST =2,
					 DISPLAY_ALL =1,
					 BACK =4;

	// static{
	// 	ADD_MANAGER = ADD_EMPLOYEE =1;
	// 	ADD_ENGINEER = DISPLAY =2;
	// 	SORT_EMPLOYEES =ADD_SALSEPERSON =3;
	// 	BACK = 4;

	// }
	
	public static void main(String ... args) {
//	Employee [] empArr = new Employee[100];
	LinkedList empList = new LinkedList();
	int EmpCount = 0;
	int choice = 0;

	
	do{
		System.out.println("1. Add an Employee\r\n"
				+ "2. Display\r\n"
				+ "3. Sort Employees\r\n"
				+ "4.Exit\r\n");
		choice = ConsoleInput.getInt();
		
		switch(choice) {
			case ADD_EMPLOYEE:
				empList.add(makeEmployee());
				break;
			case DISPLAY:
				display(empList, EmpCount);
				break;
			case SORT:
			sortCase(empList, EmpCount);
				break;
			case BACK:
				System.err.println("Yoii-chini-chiwo");
				break;
			
		}
		
		
	}while(choice != 4);
	
	
}
	
static Employee makeEmployee() {
	
	int subChoice =0;
	String name;
	String address;
	String gender ;
	int age;
	float basicSalary;

	Employee e = null;
	
	
	System.out.print("1. Manager\n"
			+ "2. Engineer\n"
			+ "3. Sales Person\n"
			+ "4. BACK\r\n");
	
	subChoice = ConsoleInput.getInt();
	System.out.println("enter name");
	name = ConsoleInput.getString();
	System.out.println("enter Address");
	address = ConsoleInput.getString();
	System.out.println("enter age");
	age = ConsoleInput.getInt();
	System.out.println("enter gender (F/M) ");
	gender = ConsoleInput.getString();
	System.out.println("enter Salary");
	basicSalary = ConsoleInput.getFloat();

		switch(subChoice) {
		case 1:
			System.out.println("enter HRA");
			float hra = ConsoleInput.getFloat();
			e = new Manager(name,address,age,gender,basicSalary,hra);
			break;
		case 2:
			System.out.println("enter OverTime");
			float OT = ConsoleInput.getFloat();
			e = new Engineer(name,address,age,gender,basicSalary,OT);
			break;
		case 3:
			System.out.println("enter commission");
			float commission = ConsoleInput.getFloat();
			e = new SalesPerson(name,address,age,gender,basicSalary,commission);
			break;
		}
return e;
}
 


static void sortCase(LinkedList empList,int EmpCount){
		int subChoice =0;
	do{
		System.out.print("1. sort employees on salary\n"
			+ "2. Sort employees on name\n"
			+ "3. Sort employess on name desc\n"
			+ "4. BACK\r\n");

		subChoice = ConsoleInput.getInt();
	switch(subChoice) {
		case 1:
			sortAllEmployeesOnSalary(empList, EmpCount);
			display(empList, EmpCount);
			break;
		case 2:
			sortEmployeesOnName(empList, EmpCount);
			display(empList, EmpCount);
			break;
		case BACK:
			sortEmployeesOnNameDESC(empList, EmpCount);
			display(empList, EmpCount);
			break;
		}}while(subChoice != 4);

}
static void display(LinkedList empList,int EmpCount){
	int subChoice =0;
	do{
		System.out.print("1. Display All emp\n"
			+ "2. Display first emp\n"
			+ "3. Display last emp\n"
			+ "4. BACK\r\n");

		subChoice = ConsoleInput.getInt();
	switch(subChoice) {
		case DISPLAY_ALL:
			displayAll(empList,EmpCount);
			break;
		case DISPLAY_FIRST:
			displayFirst(empList,EmpCount);
			break;
		case DISPLAY_LAST:
			displayLast(empList,EmpCount);
			break;
		}}while(subChoice != 4);

}

static void displayFirst(LinkedList empList,int EmpCount) {
	Object Temp = empList.getFirst();
	if( Temp instanceof Manager) {
		System.out.println("\n Designation : manager \n");
		Manager m = (Manager) Temp;
		System.out.println(m.getInfo());
	}
	else if(Temp instanceof Engineer) {
		System.out.println("\n Designation :Engineer \n");
		Engineer e = (Engineer) Temp;
		System.out.println(e.getInfo());
	}
	else if(Temp instanceof SalesPerson) {
		System.out.println("\n Designation :SalesPerson \n");
		SalesPerson s = (SalesPerson) Temp;
		System.out.println(s.getInfo());}
			

}

static void displayAll(LinkedList empList,int EmpCount) {
	
	Object Temp = empList.getFirst();

	
		for(int i = 0 ;i<empList.getCount();i++) {
			if( Temp instanceof Manager) {
				System.out.println("\n Designation : manager \n");
				Manager m = (Manager) Temp;
				System.out.println(m.getInfo());
			}
			else if(Temp instanceof Engineer) {
				System.out.println("\n Designation :Engineer \n");
				Engineer e = (Engineer) Temp;
				System.out.println(e.getInfo());
			}
			else if(Temp instanceof SalesPerson) {
				System.out.println("\n Designation :SalesPerson \n");
				SalesPerson s = (SalesPerson) Temp;
				System.out.println(s.getInfo());
			}
			Temp = empList.getNext();
		}
}

static void displayLast(LinkedList empList,int EmpCount) {
	Object Temp = empList.getLast();
	if( Temp instanceof Manager) {
		System.out.println("\n Designation : manager \n");
		Manager m = (Manager) Temp;
		System.out.println(m.getInfo());
	}
	else if(Temp instanceof Engineer) {
		System.out.println("\n Designation :Engineer \n");
		Engineer e = (Engineer) Temp;
		System.out.println(e.getInfo());
	}
	else if(Temp instanceof SalesPerson) {
		System.out.println("\n Designation :SalesPerson \n");
		SalesPerson s = (SalesPerson) Temp;
		System.out.println(s.getInfo());

}
}

static void sortAllEmployeesOnSalary(LinkedList empList,int EmpCount){
	Object node1 = empList.getFirst();
	Employee e1 = (Employee) empList.getFirst();
	for(int i = 0; i< EmpCount;i++) {
		Object node2 = ((Node) node1).getNext();
		Employee e2 = (Employee) empList.getNext();
		for(int j = i+1 ; j < EmpCount ; j++) {
			if(e1.getTotalSalary()>e2.getTotalSalary()) {
				Object temp;
				temp = node1;
				node1 = node2;
				node2 = temp;
			}
		}
	}
	
}

static void sortAllEmployeesOnSalaryDESC(LinkedList empList,int EmpCount){
	Object node1 = empList.getFirst();
	Employee e1 = (Employee) empList.getFirst();
	for(int i = 0; i< EmpCount;i++) {
		Object node2 = ((Node) node1).getNext();
		Employee e2 = (Employee) empList.getNext();
		for(int j = i+1 ; j < EmpCount ; j++) {
			if(e1.getTotalSalary()< e2.getTotalSalary()) {
				Object temp;
				temp = node1;
				node1 = node2;
				node2 = temp;
			}
		}
	}
	
}

static void sortEmployeesOnName(LinkedList empList,int EmpCount){
	Object node1 = empList.getFirst();
	Employee e1 = (Employee) empList.getFirst();
	for(int i = 0; i< empList.getCount()-1;i++) {
		Object node2 = ((Node) node1).getNext();
		Employee e2 = (Employee) empList.getNext();
		for(int j = i+1 ; j < empList.getCount()-1 ; j++) {
			if(e1.getName().compareToIgnoreCase(e2.getName())>0) {
				Object temp;
				temp = node1;
				node1 = node2;
				node2 = temp;
			}
		}
	}
	
}
	

static void sortEmployeesOnNameDESC(LinkedList empList,int EmpCount){
	Object node1 = empList.getFirst();
	Employee e1 = (Employee) empList.getFirst();
	for(int i = 0; i< EmpCount;i++) {
		Object node2 = ((Node) node1).getNext();
		Employee e2 = (Employee) empList.getNext();
		for(int j = i+1 ; j < EmpCount ; j++) {
			if(e1.getName().compareToIgnoreCase(e2.getName())<0) {
				Object temp = node1;
				node1 = node2;
				node2 = temp;
			}
		}
	}
	
}



//to be implemented futher
static void sortAllManagers(Employee [] empArr,int EmpCount){
	for(int i = 0; i< EmpCount;i++) {
		for(int j = i+1 ; j < EmpCount ; j++) {
			if(empArr[i] instanceof Manager && empArr[j] instanceof Manager) {
			if(empArr[i].getTotalSalary()>empArr[j].getTotalSalary()) {
				Employee temp;
				temp = empArr[i];
				empArr[i] = empArr[j];
				empArr[j] = temp;
			}
		}
		}
	}
	
}	
}