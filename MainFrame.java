import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import org.mariuszgromada.math.*;
import org.mariuszgromada.math.mxparser.Expression;

public class MainFrame extends JFrame {
	MainPanel panel = new MainPanel();

	public MainFrame() {
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculator");
		add(panel);
		EventHandler handler = new EventHandler();
		panel.getBut0().addActionListener(handler);
		panel.getBut1().addActionListener(handler);
		panel.getBut2().addActionListener(handler);
		panel.getBut3().addActionListener(handler);
		panel.getBut4().addActionListener(handler);
		panel.getBut5().addActionListener(handler);
		panel.getBut6().addActionListener(handler);
		panel.getBut7().addActionListener(handler);
		panel.getBut8().addActionListener(handler);
		panel.getBut9().addActionListener(handler);
		panel.getButRes().addActionListener(handler);
		panel.getButDiv().addActionListener(handler);
		panel.getButMul().addActionListener(handler);
		panel.getButSub().addActionListener(handler);
		panel.getButAdi().addActionListener(handler);
		panel.getClear().addActionListener(handler);
		panel.getDec().addActionListener(handler);
		panel.tf.setText(null);
		setVisible(true);

	}

	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			
			
			if (actionEvent.getSource().equals(panel.getBut1())) {
				panel.tf.append("1");
			}
			if (actionEvent.getSource().equals(panel.getBut2())) {
				panel.tf.append("2");
			}
			if (actionEvent.getSource().equals(panel.getBut3())) {
				panel.tf.append("3");
			}
			if (actionEvent.getSource().equals(panel.getBut4())) {
				panel.tf.append("4");
			}
			if (actionEvent.getSource().equals(panel.getBut5())) {
				panel.tf.append("5");
			}
			if (actionEvent.getSource().equals(panel.getBut6())) {
				panel.tf.append("6");
			}
			if (actionEvent.getSource().equals(panel.getBut7())) {
				panel.tf.append("7");
			}
			if (actionEvent.getSource().equals(panel.getBut8())) {
				panel.tf.append("8");
			}
			if (actionEvent.getSource().equals(panel.getBut9())) {
				panel.tf.append("9");
			}
			if (actionEvent.getSource().equals(panel.getBut0())) {
				panel.tf.append("0");
			}
			if (actionEvent.getSource().equals(panel.getButAdi())) {
				panel.tf.append("+");
			}
			if (actionEvent.getSource().equals(panel.getButSub())) {
				panel.tf.append("-");
			}
			if (actionEvent.getSource().equals(panel.getButDiv())) {
				panel.tf.append("/");
			}
			if (actionEvent.getSource().equals(panel.getButMul())) {
				panel.tf.append("*");
			}
			if (actionEvent.getSource().equals(panel.getClear())) {
				panel.clear();
			}
			if (actionEvent.getSource().equals(panel.getDec())) {
				panel.tf.append(".");
			}
			if (actionEvent.getSource().equals(panel.getButRes())) {
					String entered = panel.tf.getText();
					
					Expression e = new Expression("" + entered +"");
					
					
					String result = String.valueOf(e.calculate());
					panel.tf.setText(result);
					
					
					
					
				
				}
			}

		}
	}
