import javax.swing.JFrame;

public class dick {
	public static void main(String agrs[]){
		reader r = new reader("Counter");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(200,300);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		
	}

}
