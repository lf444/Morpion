
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControleurMorpion implements ActionListener {
	
	private TypeCase etat;
	private VueMorpion vue;
	private ModeleMorpion modele;
	
	
	
	public  ControleurMorpion(VueMorpion vue) {
		etat= TypeCase.Joueur1;
		this.vue = vue;
		this.modele= new ModeleMorpion();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JButton source  = (JButton) arg0.getSource();
		if(!source.getText().contentEquals("effacer")) {
			JButtonMorpion sourceG = (JButtonMorpion) source;	
			
			switch(etat) {
			
			case Joueur1:
				source.setText("X");
				source.setEnabled(false);
				etat=TypeCase.Joueur2;
				vue.getJoueurCourant().setText("Joueur 2");
				modele.setValeurCase(TypeCase.Joueur1,sourceG.getI(),sourceG.getJ());
				if(modele.partieFinie()) {
					vue.getEtatPartie().setText("Joueur 1 gagner");
					vue.BloquerGrille();
				}
			
				
				break;
			case Joueur2:
				source.setText("O");
				source.setEnabled(false);
				etat=TypeCase.Joueur1;
				vue.getJoueurCourant().setText("Joueur 1");
				modele.setValeurCase(TypeCase.Joueur2,sourceG.getI(),sourceG.getJ());
				if(modele.partieFinie()) {
					vue.getEtatPartie().setText("Joueur 2 gagner");
					vue.BloquerGrille();
				}
			
			
				break;
			
			
			}
			System.out.println(this.modele);
			
		}else {
			etat = TypeCase.Joueur1;
			vue.getJoueurCourant().setText("Joueur 1");
			vue.reset();
			modele.initialiser();
		}
		
	}

}
