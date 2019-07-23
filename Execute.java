import javax.swing.UIManager;

public class Execute {

	public static void main(String[] args) {
		MainFrame window = new MainFrame();
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

}
