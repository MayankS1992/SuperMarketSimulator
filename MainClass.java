package producerconsumer;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainClass extends Applet {

	private static final long serialVersionUID = 1L;
	
	int NumOfCashiers = 8;
	Ithread threadss;
	public void init()
	{
		Cashier[] consumer=new Cashier[8];
		BlockingQueue[] queue=new BlockingQueue[NumOfCashiers];
		ArrayList linkedQueues = new ArrayList();
		
		for(int i=0; i<NumOfCashiers; i++)
			{
				queue[i]= new LinkedBlockingQueue();
				linkedQueues.add(queue[i]);
			}		
		System.out.print(linkedQueues);		
		int i=0;
		System.out.print(linkedQueues);
		IthreadImpl list = new IthreadImpl(linkedQueues,i, queue, consumer);
		
		
//		NetAnalysis analysis = new NetAnalysis();
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
