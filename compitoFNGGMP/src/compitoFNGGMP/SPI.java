package compitoFNGGMP;

public class SPI {
	BCWP bcwp = new BCWP();
	BCWS bcws = new BCWS();
	
	public SPI(BCWP bcwp, BCWS bcws) {
		this.bcwp = bcwp;
		this.bcws = bcws;
	}

	private int getBcwp() {
		return bcwp.getVal();
	}

	public void setBcwp(BCWP bcwp) {
		this.bcwp = bcwp;
	}

	private int getBcws() {
		return bcws.getVal();
	}

	public void setBcws(BCWS bcws) {
		this.bcws = bcws;
	}
	
	public int calcolateSPI() {
		return (this.getBcwp()/this.getBcws());
	}
	
	
}
