
import java.awt.GridLayout;

import javax.swing.JFrame;

public class TestMorpion {

	public static void main(String[] args) {
		
		
		
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new GridLayout(1,1));
		jFrame.add(new VueMorpion());
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setSize(300,500);
		jFrame.setTitle("Jeu Morpion");
	}

}
