import javax.swing.JFrame;

public class Main extends JFrame{
	
	public Main() {
		add(new Gui());
	}

	public static void main(String[] args) {
		Main pacman1 = new Main();
		pacman1.setVisible(true);
		pacman1.setTitle("Pacman");
		pacman1.setSize(505, 560);
		pacman1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pacman1.setLocationRelativeTo(null);
	}

}
