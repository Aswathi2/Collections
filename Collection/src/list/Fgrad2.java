package list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Fgrad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		   ArrayList list=new ArrayList();
		   
		      list.add("hii");
		      list.add("hello");
		      list.add("welcome");
		      list.add("to");
		     
		    ArrayList list1=new ArrayList();
		    Iterator it=list.iterator();
		    System.out.print("Original List :");
		    while(it.hasNext())
		    {
		      System.out.println(it.next());
		     

		}
		    list.clear();
		    Iterator itt=list.iterator();
		    System.out.print("Removed List :");
		    while(itt.hasNext())
		    {
		      System.out.println(itt.next());
		     

		}
	}

}
