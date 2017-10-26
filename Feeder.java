package producerconsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Feeder implements Runnable {
	private final BlockingQueue []queue;
    Calculator calculations=new Calculator();
    int MaxNumOfProducts = 200;
    BlockingQueue qu;
    Random random=new Random();
    static int  productsInCart,index=0;   
	private int i;
	private static int lost;
	private long start = System.nanoTime(); 
	private long sim = 1; 

         Feeder(BlockingQueue[] queue)
	{
        	 this.queue=queue;										//Constructor
	}

	public void run() {
		 
		while((System.nanoTime()-start)<=(sim*60000000000L))
             
        try
         {
             productsInCart = (int)(Math.random() * MaxNumOfProducts); 
             qu=minimum(queue);  //Sabse Chota Queue
             if(qu.size()==6)
             {
            	 calculations.setLoss();                
             }
             else
             {                 
                 if(qu==queue[0])
                 {
                     if (productsInCart<10)
                     {                                                                                       
                             minimum(queue).put(productsInCart);
                             calculations.waitTime();
                             System.out.println("put: "+productsInCart);                     
                     }                     
                     else{                         
                         System.out.println("10 or less queue");
                     }
                 }
                 else
                 {                                          
                         minimum(queue).put(productsInCart);
                         System.out.println("put: "+productsInCart);
                         calculations.waitTime();                   
                 }
             }
         }            
         catch(InterruptedException ex)
         {
             Logger.getLogger(Feeder.class.getName()).log(Level.SEVERE, null, ex);
         }
		
	}

	private BlockingQueue minimum(BlockingQueue[] queue2) 
	{
        int min=queue[0].size();
        for(int count=0;count<queue.length;count++)
        {
            if(queue[count].size()<=min)
            {
                min=queue[count].size();
                index=count;    
            }
            System.out.println("index inside"+index);  
        }
        return queue[index];
	}
}