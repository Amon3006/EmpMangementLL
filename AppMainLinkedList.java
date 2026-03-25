//  package com.Employees;
//  import com.aman.LinkedList;
// import com.aman.Node;
// import com.calender.ConsoleInput;

public class AppMainLinkedList {
	static final int ADD_EMPLOYEE =1,
					 DISPLAY =2,
					 SORT =3,
					 BACK =4,

					 ADD_MANAGER=1,
					 ADD_ENGINEER =2,
					 ADD_SALSEPERSON=3,


					 DISPLAY_ALL =1,
					 DISPLAY_FIRST =2,
					 DISPLAY_LAST =3,
					 DISPLAY_NEXT =4,
					 DISPLAY_PREVIOUS =5,
					 BACK_DISPLAY =6,


					 SORT_BY_SALARY =1,
					 SORT_BY_NAME = 2,
					 SORT_BY_NAME_DESC = 3,
					 SORT_ALL_MANAGERS = 4,
					 SORT_ALL_ENGINEERS = 5,
					 SORT_ALL_SALESPERSONS = 6,
					 BACK_SORT =7;
					 

	// static{
	// 	ADD_MANAGER = ADD_EMPLOYEE =1;
	// 	ADD_ENGINEER = DISPLAY =2;
	// 	SORT_EMPLOYEES =ADD_SALSEPERSON =3;
	// 	BACK = 4;

	// }
	
	public static void main(String ... args) {
//	Employee [] empArr = new Employee[100];
	LinkedList empList = new LinkedList();
	// int EmpCount = 0;
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
				display(empList);
				break;
			case SORT:
			sortCase(empList);
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
 


static void sortCase(LinkedList empList){
		int subChoice =0;
	do{
		System.out.print("1. sort employees on salary\n"
			+ "2. Sort employees on name\n"
			+ "3. Sort employess on name desc\n"
			+ "4. Sort all managers\n"
			+ "5. Sort all engineers\n"
			+ "6. Sort all Sales Persons\n"
			+ "7. BACK\r\n");

		subChoice = ConsoleInput.getInt();
	switch(subChoice) {
		case SORT_BY_SALARY:
			sortAllEmployeesOnSalary(empList);
			displayAll(empList);
			break;
		case SORT_BY_NAME:
			sortEmployeesOnName(empList);
			displayAll(empList);
			break;
		case SORT_BY_NAME_DESC:
			 sortEmployeesOnNameDESC(empList);
			 displayAll(empList);
		     break;
		case SORT_ALL_MANAGERS:
			sortAllManagers(empList);
			break;
		case SORT_ALL_ENGINEERS:
			sortAllEngineers(empList);
			break;
		case SORT_ALL_SALESPERSONS:
			sortAllSalesPersons(empList);
			break;
			
		case BACK_SORT:
			break;
		}}while(subChoice != 4);

}




static void display(LinkedList empList){
	int subChoice =0;
	do{
		System.out.print("1. Display All emp\n"
			+ "2. Display first emp\n"
			+ "3. Display last emp\n"
			+ "4.Display next \n"
			+ "5.Display previous \n"
			+ "6. BACK\r\n");

		subChoice = ConsoleInput.getInt();
	switch(subChoice) {
		case DISPLAY_ALL:
			displayAll(empList);
			break;
		case DISPLAY_FIRST:
			displayFirst(empList);
			break;
		case DISPLAY_LAST:
			displayLast(empList);
			break;
		case DISPLAY_NEXT:
			displayNext(empList);
			break;
		case DISPLAY_PREVIOUS:
			displayPrevious(empList);
			break;
		case BACK_DISPLAY:
			break;
		}}while(subChoice != 6);

}

static void displayFirst(LinkedList empList) {
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

static void displayNext(LinkedList empList){

	if(empList.getNextNode() == null){
		System.out.println("that was the last employee");
		return;
	}
	Object Temp = empList.getNext();


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


static void displayPrevious(LinkedList empList){

	if(empList.getPreviousNode() == null){
		System.out.println("this is the first employee");
		return;
	}
	Object Temp = empList.getNext();


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

static void displayAll(LinkedList empList) {
	
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

static void displayLast(LinkedList empList) {
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

static void sortAllEmployeesOnSalary(LinkedList empList)
	{
	LinkedList l1 = empList;

	for(int i = 0; i< empList.getCount()-1;i++)
		{
		l1.getFirst();
		for(int j = i ; j <  empList.getCount()-1 ; j++)
			{

			if(((Employee)l1.getCurrent()).getTotalSalary()>((Employee)l1.getNext()).getTotalSalary()) 
				{
				Employee Temp = (Employee)l1.getCurrent();
				l1.getCurrentNode().nodeSetData(l1.getPreviousNode().getData());
				l1.getPreviousNode().nodeSetData(Temp);
				}
			}
		}
				
	}

static void sortAllEmployeesOnSalaryDESC(LinkedList empList)	{
	LinkedList l1 = empList;

	for(int i = 0; i< empList.getCount()-1;i++)
		{
		l1.getFirst();
		for(int j = i ; j <  empList.getCount()-1 ; j++)
			{

			if(((Employee)l1.getCurrent()).getTotalSalary()<((Employee)l1.getNext()).getTotalSalary()) 
				{
				Employee Temp = (Employee)l1.getCurrent();
				l1.getCurrentNode().nodeSetData(l1.getPreviousNode().getData());
				l1.getPreviousNode().nodeSetData(Temp);
				}
			}
		}
				
	}

static void sortEmployeesOnName(LinkedList empList){
	LinkedList l1 = empList;

	for(int i = 0; i< empList.getCount()-1;i++)
		{
		l1.getFirst();
		for(int j = i ; j <  empList.getCount()-1 ; j++)
			{

			if(((Employee)l1.getCurrent()).getName().compareTo(((Employee)l1.getNext()).getName())>0) 
				{
				Employee Temp = (Employee)l1.getCurrent();
				l1.getCurrentNode().nodeSetData(l1.getPreviousNode().getData());
				l1.getPreviousNode().nodeSetData(Temp);
				}
			}
		}
				
	}
	
static void sortEmployeesOnNameDESC(LinkedList empList){
	LinkedList l1 = empList;

	for(int i = 0; i< empList.getCount()-1;i++)
		{
		l1.getFirst();
		for(int j = i ; j <  empList.getCount()-1 ; j++)
			{

			if(((Employee)l1.getCurrent()).getName().compareTo(((Employee)l1.getNext()).getName())<0)
				{
				Employee Temp = (Employee)l1.getCurrent();
				l1.getCurrentNode().nodeSetData(l1.getPreviousNode().getData());
				l1.getPreviousNode().nodeSetData(Temp);
				}
			}
		}
				
	}

static void sortAllManagers(LinkedList empList) {
	
	Object Temp = empList.getFirst();

	
		for(int i = 0 ;i<empList.getCount();i++) {
			if( Temp instanceof Manager) {
				System.out.println("\n Designation : manager \n");
				Manager m = (Manager) Temp;
				System.out.println(m.getInfo());
			}
			Temp = empList.getNext();
		}
}

static void sortAllEngineers(LinkedList empList) {
	
	Object Temp = empList.getFirst();

	
		for(int i = 0 ;i<empList.getCount();i++) {
			if(Temp instanceof Engineer) {
				System.out.println("\n Designation :Engineer \n");
				Engineer e = (Engineer) Temp;
				System.out.println(e.getInfo());
			}
			Temp = empList.getNext();
		}
}

static void sortAllSalesPersons(LinkedList empList) {
	
	Object Temp = empList.getFirst();

	
		for(int i = 0 ;i<empList.getCount();i++) {
			if(Temp instanceof SalesPerson) {
				System.out.println("\n Designation :SalesPerson \n");
				SalesPerson s = (SalesPerson) Temp;
				System.out.println(s.getInfo());
			}
			Temp = empList.getNext();
		}
}




}