package list;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENTER NUMBER OF STUDENT");
int n=s.nextInt();
LinkedList list=new LinkedList();
int i=0;
for(i=0;i<n;i++)
{
	System.out.println("enter name");
	String name=s.next();
	System.out.println("enter age");
	int age=s.nextInt();
	System.out.println("enter id");
	int id=s.nextInt();
	System.out.println("enter mark");
	int mark=s.nextInt();
	System.out.println("Enter rank");
	int rank=s.nextInt();
	list.add(name);
	list.add(age);
	list.add(id);
	list.add(mark);
	list.add(rank);
	}
System.out.println("SIZE OF LIST "+list.size());
System.out.println(list);
System.out.println("LIST IS EMPTY OR NOT"+list.isEmpty());
	}

}
