package producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Cashier implements Runnable {
	private BlockingQueue queue;
    Calculator c=new Calculator();
    private long start = System.nanoTime(); 
    private long sim = 1; 
    public int value;
    public int time;
    public int index;
    Random random=new Random();
    int rand,times;
	
    public Cashier(BlockingQueue q,int index){
    
        this.queue=q;
        this.index=index;
    
    }

	@Override
	public void run() {
		while((System.nanoTime()-start)<=(sim*60000000000L))
			
			try
		{
		           
	            rand=random.nextInt(5)+1;
	            value=(int)((BlockingQueue) queue).take();
	            time=value*rand;
	            c.setIncrement1();
	            c.setIncrement2(value);
	            System.out.println("customer waiting for "+time);
	            c.setTime(time);
	            c.setUtilization(index);
	            System.out.println("took: "+ value+ " " + Thread.currentThread().getName());
	            Thread.sleep(time*10+50);
				
		}
		catch (InterruptedException ex) {
            Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
	public Object[] queueReturn(){
	      
	     Object [] arr = queue.toArray();
	         return arr;
	     }

}
