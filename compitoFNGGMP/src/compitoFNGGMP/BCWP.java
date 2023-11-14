package compitoFNGGMP;

public class BCWP {
	private int nAttivitaSvolte;
	private int costoPianificato_X_Attivita;
	
	
	
	
	public BCWP(int nAttivitaSvolte, int costoPianificato_X_Attivita) {
		super();
		this.nAttivitaSvolte = nAttivitaSvolte;
		this.costoPianificato_X_Attivita = costoPianificato_X_Attivita;
	}

	



	public int getnAttivitaSvolte() {
		return nAttivitaSvolte;
	}





	public void setnAttivitaSvolte(int nAttivitaSvolte) {
		this.nAttivitaSvolte = nAttivitaSvolte;
	}





	public int getCostoPianificato_X_Attivita() {
		return costoPianificato_X_Attivita;
	}





	public void setCostoPianificato_X_Attivita(int costoPianificato_X_Attivita) {
		this.costoPianificato_X_Attivita = costoPianificato_X_Attivita;
	}





	public int getVal() {
		return (this.getnAttivitaSvolte()*this.getnAttivitaSvolte());
	}
}

