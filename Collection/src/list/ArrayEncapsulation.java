package list;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER SIZE");
int n=s.nextInt();
ArrayList list=new ArrayList();
Employee1[] emp=new Employee1[n];
int i;
for(i=0;i<n;i++)
{
	System.out.println("ENTER THE NAME");
	String name=s.next();
	System.out.println("ENTER THE AGE");
	int age=s.nextInt();
	//adding name and age to list
	emp[i]=new Employee1();
	 emp[i].setName(name);
	 emp[i].setAge(age);
	list.add(emp[i]);
}
Iterator<Employee1> itr=list.iterator();
while(itr.hasNext())//it traverse till last it always return 0 or 1
{
	Employee1 e=itr.next();
	System.out.println(e.getName()+" "+e.getAge());//return the nextElement
}
s.close();
	}

}
