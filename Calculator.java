package producerconsumer;

import java.util.Random;

public class Calculator {
	
float time = 0;
static int lost,total,products;
static int a[]=new int[8];
int checkout=8,sum;

	public synchronized void setLoss() {
		// TODO Auto-generated method stub
		
	}
	 public int getLoss(){
         
	        return lost;
	             
	    }

	public void waitTime() 
	{		
		 try{			    
			    double waitTime = myRandom(0.5, 6.0);
			    double wait=waitTime;
			    double waitInMS = wait*1000;
		        Thread.sleep((long) (waitInMS+100));
		    }		    
		 catch(InterruptedException ex)
		 {
			 
		 }		
	}
	
	public void getUtilization()
	{
	    for(int i=0;i<checkout;i++)
	    {
	    System.out.println("utilization of queue"+i+1 +": " +a[i]);
	}
	}
	public void average()
	{
	    for(int i=0;i<checkout;i++)
	    {
	     sum=sum+a[i];
	    }
	    sum=sum/checkout;
	        System.out.println("average utilization:"+sum);
	}
	
	public synchronized void setIncrement1(){
	    
        total++;
       // System.out.println("total customers served: "+total);
    
    }
	public int getIncrement1(){
	 
	        return total;
	 }
    
    public synchronized void setIncrement2(int a){
    
        products+=a;
        //System.out.println("total products: "+products);
    
    }
    
	public int getIncrement2()
	{
	    return products;
	}
	
	public synchronized void setTime(int tim)
	{
	    time+=tim;
	}


	
	double myRandom(double min, double max) 
	{
	    Random r = new Random();
	    return (r.nextInt((int)((max-min)*10+1))+min*10) / 10.0;	    
	}

	public void setUtilization(int index) {
		// TODO Auto-generated method stub
		
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public static int getLost() {
		return lost;
	}

	public static void setLost(int lost) {
		Calculator.lost = lost;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Calculator.total = total;
	}

	public static int getProducts() {
		return products;
	}

	public static void setProducts(int products) {
		Calculator.products = products;
	}

	public static int[] getA() {
		return a;
	}

	public static void setA(int[] a) {
		Calculator.a = a;
	}

	public int getCheckout() {
		return checkout;
	}

	public void setCheckout(int checkout) {
		this.checkout = checkout;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
