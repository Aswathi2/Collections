package set;
import java.util.*;
public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet set=new HashSet();
set.add("ANU");
set.add("JINU");
set.add("SINU");
set.add("BINU");
set.add("ANU");
set.add("SANU");
set.add("TINU");
set.add("MINU");
set.add("BINU");
Iterator itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
