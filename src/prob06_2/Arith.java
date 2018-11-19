package prob06_2;

public abstract class Arith {
	protected int lValue;
	protected int rValue;
	
	public int getlValue() {
		return lValue;
	}
	public void setlValue(int lValue) {
		this.lValue = lValue;
	}
	public int getrValue() {
		return rValue;
	}
	public void setrValue(int rValue) {
		this.rValue = rValue;
	}
	
	public abstract int calc();
}
