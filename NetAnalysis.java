package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class NetAnalysis {
	
	NetAnalysis()
	{
		Calculator c=new Calculator();
	    System.out.println("no of customers:"+c.getIncrement1());
	    System.out.println("no of products:"+c.getIncrement2());
	    System.out.println("lost customers:"+c.getLoss());
	    System.out.println("total wait time for customer:"+c.getTime());
	    System.out.println("utilization of each queue: ");
	    c.getUtilization();
	    c.average();
	}
    
    

}
