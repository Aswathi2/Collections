package list;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Set {

					public static void main(String[] args) {
						// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				System.out.println("ENTER THE SIZE");
				int size=s.nextInt();
				int i=0;
				//creating arrayList
				ArrayList list=new ArrayList();
				for(i=0;i<size;i++)
				{
					System.out.println("ENTER THE NAME");
					String name=s.next();
					System.out.println("ENTER THE AGE");
					int age=s.nextInt();
					//adding name and age to list
					list.add(name);
					list.add(age);
				}
				//setting new name at index 2
				System.out.println("ENTER THE NEW NAME");
				String name1=s.next();
				list.set(2,name1);//object.set(index,variable);
				list.clear();
				Iterator itr=list.iterator();
				while(itr.hasNext())//it traverse till last it always return 0 or 1
				{
					System.out.println(itr.next());//return the nextElement
				}
				s.close();



	}

}
