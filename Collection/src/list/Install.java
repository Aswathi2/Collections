package list;
import java.util.*;
public class Install {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int flag=0;
ArrayList list=new ArrayList();
int i;
do {
	System.out.println("1.Display installed application\n2.Install an application\n3.Uninstall an application\n4.Quit");
	int n=s.nextInt();
	switch (n)
	{
	case 1:{
		Iterator itt=list.iterator();
		   if(list.isEmpty())
			   System.out.println("No application installed");
		   else
		   {
			   int j=0;
	    while(itt.hasNext())
	    {
	      System.out.println(j+" "+itt.next());
	      j++;//printing values
	    }
	}
	}  break;
	case 2:{
		Iterator it1=list.iterator();
		System.out.println("ENTER THE APPLICATION");
		String app=s.next();
		flag=0;
		while(it1.hasNext())
	    {
	      String st=(String) it1.next();
	      if(st.equals(app)) {
	    	  flag=1;
	    	  break;}
	    }
		if(flag==1)
			System.out.print("ALREADY INSTALLED\n");
	      else
		list.add(app);
	}break;
	case 3:{
		Iterator it=list.iterator();
		 if(list.isEmpty())
			   System.out.println("No application installed");
		 else {
		for(i=0;i<list.size();i++)
			
		{
			System.out.println(i+" "+it.next());
		}
		System.out.println("enter the index of application to be installed");
		int index=s.nextInt();
		list.remove(index);
		}}
		break;
	case 4:
	{
		System.exit(0);
	}break;
     default:{
    	 System.out.println("INVALID INPUT");
     }
	}
	}while(true);
	}

}
