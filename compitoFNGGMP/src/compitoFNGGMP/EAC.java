package compitoFNGGMP;

public class EAC {
	private int bac;
	private ACWP acwp;
	private BCWP bcwp;
	private SPI spi;
	private CPI cpi;
	
	public EAC(int bac, ACWP acwp, BCWP bcwp, SPI spi, CPI cpi) {
		super();
		this.bac = bac;
		this.acwp = acwp;
		this.bcwp = bcwp;
		this.spi = spi;
		this.cpi = cpi;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public void setAcwp(ACWP acwp) {
		this.acwp = acwp;
	}

	public void setBcwp(BCWP bcwp) {
		this.bcwp = bcwp;
	}

	public void setSpi(SPI spi) {
		this.spi = spi;
	}

	public void setCpi(CPI cpi) {
		this.cpi = cpi;
	}

	
	
	
	
	public int getVal_Futuro() {
		return this.acwp.getVal()+(this.bac + this.bcwp.getVal());
	}
	
	public int getVal_FuturoConPrestazioniATT() {
		return this.acwp.getVal()+ ((this.bac + this.bcwp.getVal())- this.cpi.calcolateCPI());
	}

	public int getVal_FuturoConPrestazioniPiuRitardo() {
		return  this.acwp.getVal()+((this.bac + this.bcwp.getVal()) + (this.cpi.calcolateCPI() * this.spi.calcolateSPI()) );
	}
	
}

