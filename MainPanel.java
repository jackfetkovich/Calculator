import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
     JTextArea tf;
	
	private JButton but0;
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton but4;
	private JButton but5;
	private JButton but6;
	private JButton but7;
	private JButton but8;
	private JButton but9;
	
	
	private JButton div;
	private JButton mul;
	private JButton adi;
	private JButton sub;
	
	private JButton res;
	private JButton clear;
	private JButton dec;
	
	public MainPanel() {
		tf = new JTextArea("");
		 
		but0 = new JButton("0");
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5"); 
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		
		div = new JButton("/");
		mul = new JButton("*");
		adi = new JButton("+");
		sub = new JButton("-");
		
		res = new JButton("=");
		clear = new JButton("clr");
		dec = new JButton(".");
	
	setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	
	c.gridx = 0;
	c.gridy = 0;
	add(tf, c);
	
	
	
	c.gridx = 0;
	c.gridy = 1;
	add(but1,c);
	
	c.gridx = 1;
	c.gridy = 1;
	add(but2, c);
	
	c.gridx = 2;
	c.gridy = 1;
	add(but3, c);
	
	c.gridx = 4;
	c.gridy = 1;
	add(adi,c);
	
	
	
	c.gridx = 0;
	c.gridy = 2;
	add(but4,c);
	
	c.gridx = 1;
	c.gridy = 2;
	add(but5, c);
	
	c.gridx = 2;
	c.gridy = 2;
	add(but6, c);
	

	c.gridx = 4;
	c.gridy = 2;
	add(sub,c);
	
	
	
	c.gridx = 0;
	c.gridy = 3;
	add(but7,c);
	
	c.gridx = 1;
	c.gridy = 3;
	add(but8, c);
	
	c.gridx = 2;
	c.gridy = 3;
	add(but9, c);
	

	c.gridx = 4;
	c.gridy = 3;
	add(mul,c);
	
	c.gridx = 0;
	c.gridy = 4;
	add(dec, c);
	
	c.gridx = 2;
	c.gridy = 4;
	add(clear, c);


	
	c.gridx = 1;
	c.gridy = 4;
	add(but0, c);
	
	c.gridx = 4;
	c.gridy = 4;
	add(div, c);
	
	c.gridx = 6;
	c.gridy = 4;
	add(res, c);

	
	}
	

	public JButton getBut0() {
		return but0;
	}
	public JButton getBut1() {
		return but1;
	}
	public JButton getBut2() {
		return but2;
	}
	public JButton getBut3() {
		return but3;
	}
	public JButton getBut4() {
		return but4;
	}
	public JButton getBut5() {
		return but5;
	}
	public JButton getBut6() {
		return but6;
	}
	public JButton getBut7() {
		return but7;
	}
	public JButton getBut8() {
		return but8;
	}
	public JButton getBut9() {
		return but9;
	}
	public JButton getButRes() {
		return res;
	}
	public JButton getButAdi() {
		return adi;
	}
	public JButton getButMul() {
		return mul;
	}
	public JButton getButDiv() {
		return div;
	}
	public JButton getButSub() {
		return sub;
	}
	public String getTf() {
		return tf.getText();
	}
	public void setTf(String result) {
		tf.setText(result);
	}
	public JButton getClear() {
		return clear;
	}
	public JButton getDec() {
		return dec;
	}
	public void clear() {
		tf.setText("");
	}
	
	
}
