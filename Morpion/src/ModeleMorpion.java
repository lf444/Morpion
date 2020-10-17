public class ModeleMorpion {
	

	private TypeCase[][] tab;

	public ModeleMorpion() {

		this.tab= new TypeCase[][] {{TypeCase.VIDE,TypeCase.VIDE,TypeCase.VIDE},
									{TypeCase.VIDE,TypeCase.VIDE,TypeCase.VIDE},
									{TypeCase.VIDE,TypeCase.VIDE,TypeCase.VIDE}};	
	}
	
	
	public TypeCase getValeurCase(int a ,int b) {
		
		return this.tab[a][b];
	}

	
	public String toString() {
		StringBuffer res = new StringBuffer();
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				res.append(this.tab[i][j]+" ") ;
			}
			res.append('\n');
		}
		
		
		return res.toString();
		
	}
	
	
	
	public void initialiser() {
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				this.tab[i][j]= TypeCase.VIDE;
			}
		}
	}
	
	
	public void setValeurCase(TypeCase t,int a,int b) {
		
		this.tab[a][b]=t;
	}
	

	
	public boolean partieFinie() {
		for(int i =0; i<3;i++) {
			
			if(ligneFinie(i)) {
				return true;
			}
			if(colonneFinie(i)) {
				return true;
			}
			if(diagoFini())
				return true;
			if (diago2Fini())
				return true;
		}
		return false;
	}
	
	public boolean ligneFinie(int i) {
		return (this.tab[i][0]==this.tab[i][1] &&this.tab[i][1]==this.tab[i][2] && this.tab[i][0]!=TypeCase.VIDE);
	}
	public boolean colonneFinie(int j) {
		return (this.tab[0][j]==this.tab[1][j] &&this.tab[1][j]==this.tab[2][j] && this.tab[0][j]!=TypeCase.VIDE);
	}
	
	public boolean diagoFini() {
		return (this.tab[0][0]==this.tab[1][1] &&this.tab[1][1]==this.tab[2][2] && this.tab[0][0]!=TypeCase.VIDE);
	}
	public boolean diago2Fini() {
		return (this.tab[0][2]==this.tab[1][1] &&this.tab[1][1]==this.tab[2][0] && this.tab[0][2]!=TypeCase.VIDE);
	}
	
}
