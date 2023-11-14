package compitoFNGGMP;

public class ACWP {
	private int nAttivitaSvolte;
	private int costo_X_Attivita;
	
	
	
	public ACWP(int nAttivitaSvolte, int costo_X_Attivita) {
	
		this.nAttivitaSvolte = nAttivitaSvolte;
		this.costo_X_Attivita = costo_X_Attivita;
	}

	public int getnAttivitaSvolte() {
		return nAttivitaSvolte;
	}
	
	public void setnAttivitaSvolte(int nAttivitaSvolte) {
		this.nAttivitaSvolte = nAttivitaSvolte;
	}
	
	public int getCosto_X_Attivita() {
		return costo_X_Attivita;
	}
	
	public void setCosto_X_Attivita(int costo_X_Attivita) {
		this.costo_X_Attivita = costo_X_Attivita;
	}
	
	public int getVal() {
		return (this.getnAttivitaSvolte() * this.getCosto_X_Attivita());
	}
	
}
