

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueMorpion extends JPanel {
	
	
	private JLabel joueurCourant;
	private JButtonMorpion[][] grille;
	private JLabel etatPartie;



	public VueMorpion() {
		
		ControleurMorpion controleur = new ControleurMorpion(this);
		this.grille= new JButtonMorpion[3][3];
		
		this.setLayout(new BorderLayout());
		JPanel nord = new JPanel(new GridLayout(1,2));
		JButton effacer = new JButton("effacer");
		effacer.addActionListener(controleur);
		nord.add(effacer);
		joueurCourant = new JLabel("Joueur 1");
		nord.add(joueurCourant);
		this.add(nord,BorderLayout.NORTH);
		
		JPanel centre = new JPanel(new GridLayout(3,3));
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				this.grille[i][j] = new JButtonMorpion(i,j);
				this.grille[i][j].addActionListener(controleur);
				centre.add(this.grille[i][j] );
			}
		}
		
		this.add(centre,BorderLayout.CENTER);
		etatPartie = new JLabel(" ");
		this.add(etatPartie,BorderLayout.SOUTH);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public JLabel getJoueurCourant() {
		return joueurCourant;
	}

	public void setJoueurCourant(JLabel joueurCourant) {
		this.joueurCourant = joueurCourant;
	}

	public void reset() {	
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				this.grille[i][j].setEnabled(true);
				this.grille[i][j].setText("");
			}
		}
				
	}
	

	public JLabel getEtatPartie() {
		return etatPartie;
	}
	
	public void BloquerGrille() {
	for(int i=0; i<3;i++) {
		for(int j=0;j<3;j++) {
			this.grille[i][j].setEnabled(false);}
			}
	}
}
