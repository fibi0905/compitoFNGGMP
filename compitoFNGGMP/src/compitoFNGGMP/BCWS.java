package compitoFNGGMP;

public class BCWS {
	
	private int nAttivitaPianificateSvolte;
	private int costoPianificate_X_Attivita;
	
	
	
	
	public BCWS(int nAttivitaPianificateSvolte, int costoPianificate_X_Attivita) {
		super();
		this.nAttivitaPianificateSvolte = nAttivitaPianificateSvolte;
		this.costoPianificate_X_Attivita = costoPianificate_X_Attivita;
	}


	
	


	public int getnAttivitaPianificateSvolte() {
		return nAttivitaPianificateSvolte;
	}






	public void setnAttivitaPianificateSvolte(int nAttivitaPianificateSvolte) {
		this.nAttivitaPianificateSvolte = nAttivitaPianificateSvolte;
	}






	public int getCostoPianificate_X_Attivita() {
		return costoPianificate_X_Attivita;
	}






	public void setCostoPianificate_X_Attivita(int costoPianificate_X_Attivita) {
		this.costoPianificate_X_Attivita = costoPianificate_X_Attivita;
	}






	public int getVal() {
		return (this.getnAttivitaPianificateSvolte()*this.getCostoPianificate_X_Attivita());
	}

}
