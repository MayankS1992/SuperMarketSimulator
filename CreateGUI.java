package producerconsumer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateGUI extends JFrame {
	
		private static final long serialVersionUID = 1L;
		private static int clerkCount = 1;
		public final static int checkOuts = 8;
		public final static int maxQueueSize = 7;
		private JPanel queue[] = new JPanel[checkOuts];
		private JPanel queueLines[][] = new JPanel[checkOuts][maxQueueSize];
		private JPanel clerkPanel[];
		private JPanel checkOutsPanel;
		private JPanel infoPanel;
		private JLabel leftCustomerCountLabel = new JLabel();
		private JLabel totalCustomerCountLabel = new JLabel();

	public CreateGUI(Cashier[] consumer, Feeder producer) {
		// TODO Auto-generated constructor stub
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
