package producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;



public class IthreadImpl implements Ithread {
	ArrayList list = new ArrayList();
	IthreadImpl(){
		
	}
		public IthreadImpl(ArrayList linkedQueues, int i, BlockingQueue[] queue, Cashier[] consumer) { 


			Feeder producer = new Feeder(queue);
			Thread prodd=new Thread(producer);
	        
			Cashier cons1=new Cashier((BlockingQueue) linkedQueues.get(i),i);
			Thread conss1=new Thread(cons1);
	        i++;
	        
	        Cashier cons2= new Cashier((BlockingQueue) linkedQueues.get(i),i);
	        Thread conss2=new Thread(cons2);
	        i++;
	        
	        Cashier cons3= new Cashier((BlockingQueue) linkedQueues.get(i),i);
	        Thread conss3=new Thread(cons3);
	        i++;
	        
	        Cashier cons4= new Cashier((BlockingQueue) linkedQueues.get(i),i);
	        Thread conss4=new Thread(cons4);
	        i++;
	        
	        Cashier cons5= new Cashier((BlockingQueue) linkedQueues.get(i),i);
	        Thread conss5=new Thread(cons5);
	        i++;
	        
	        Cashier cons6= new Cashier((BlockingQueue) linkedQueues.get(i),i);
	        Thread conss6=new Thread(cons6);
	        i++;
	      
	        Cashier cons7= new Cashier((BlockingQueue) linkedQueues.get(i),i);
	        Thread conss7=new Thread(cons7);
	        i++;
	        
	        Cashier cons8= new Cashier((BlockingQueue) linkedQueues.get(i),i);
	        Thread conss8=new Thread(cons8);
	        i++;
	        
	        
	        list.add(conss1);
	        list.add(conss2);
	        list.add(conss3);
	        list.add(conss4);
	        list.add(conss5);
	        list.add(conss6);
	        list.add(conss7);
	        list.add(conss8);
//	        System.out.print(list);
	        
	        
	        CreateGUI graphicsObject = new CreateGUI(consumer, producer);
	        graphicsObject.setVisible(true);
	        
	        
	        prodd.start();
	        conss1.start();
	        conss2.start();
	        conss3.start();
	        conss4.start();
	        conss5.start();
	        conss6.start();
	        conss7.start();
	        conss8.start();
	        
	        try {
	            prodd.join();
	            conss1.join();
	            conss2.join();
	            conss3.join();
	            conss4.join();
	            conss5.join();
	            conss6.join();
	            conss7.join();
	            conss8.join();
	        } catch (InterruptedException ex) {
	            Logger.getLogger(IthreadImpl.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
		
		
		
			
		}
	public List startQueues() {
		return list;
	}

}
