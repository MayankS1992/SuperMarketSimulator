import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel 
{
	public void paint(Graphics g)
	{
		g.drawString("Cashier 1",25,50);
		g.drawString("Cashier 2",25,150);
    		g.drawString("Cashier 3",25,250);
    		g.drawString("Cashier 4",25,350);
    		g.drawString("Cashier 5",25,450);
    		g.drawString("Cashier 6",25,550);
    		g.drawString("Cashier 7",25,650);
    		g.drawString("Cashier 8",25,750);
    		
		g.fillOval(100,25,50,50);
    		g.fillOval(100,125,50,50);
		g.fillOval(100,225,50,50);
    		g.fillOval(100,325,50,50);
    		g.fillOval(100,425,50,50);
    		g.fillOval(100,525,50,50);
    		g.fillOval(100,625,50,50);
    		g.fillOval(100,725,50,50);
	}

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
    		frame.getContentPane().add(new Main());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setSize(200,200);
    		frame.setVisible(true);
  	}

}