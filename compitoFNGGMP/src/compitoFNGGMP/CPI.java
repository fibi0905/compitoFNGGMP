package compitoFNGGMP;

public class CPI {
	BCWP bcwp ;
	ACWP acwp ;
	
	public CPI(BCWP bcwp, ACWP acwp) {
		this.bcwp = bcwp;
		this.acwp = acwp;
	}

	private int getBcwp() {
		return bcwp.getVal();
	}

	public void setBcwp(BCWP bcwp) {
		this.bcwp = bcwp;
	}

	private int getAcwp() {
		return acwp.getVal();
	}

	public void setAcwp(ACWP acwp) {
		this.acwp = acwp;
	}
	
	
	public int calcolateCPI() {
		return (this.getBcwp() / this.getAcwp());
	}
	
	
	
	
	
	
}
