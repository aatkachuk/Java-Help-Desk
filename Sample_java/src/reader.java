import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class reader extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1,b2;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	int i,k;
	String a,b;
	eHandler handler = new eHandler();
	
	
	public reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b1=new JButton("Clear");
		b2=new JButton("Count");
		l1= new JLabel("First nummber   ");
		l2 = new JLabel("Second number  ");
		l3= new JLabel("   ");
		l4= new JLabel("   ");
		t1= new JTextField(10);
		t2= new JTextField(10);
		
		add(t1);
		add(l1);
		add(t2);
		add(l2);
		add(l3);
		add(l4);
		add(b2);
		add(b1);
		b2.addActionListener(handler);
		b1.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			try{
			if(e.getSource()==b2){
				i =Integer.parseInt(t1.getText());
				k =Integer.parseInt(t2.getText());
				i++;k++;
				a="First:" +i;
				b="Seconf" +k;
				l3.setText(a); 
				l4.setText(b);
			}
			else if(e.getSource()==b1){
				t1.setText("");
				t2.setText("");
				l3.setText("");
				l4.setText("");
				
			}
			}catch(Exception ex){ JOptionPane.showMessageDialog(null, "Insert Number");
				
			}
		}
		
	}
}
