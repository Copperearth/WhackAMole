
public class Laeufer {
	private double zeit;
	private String 	name;
	private boolean qualifiziert;
	public Laeufer(String a)
	{
		this.setName(a);
	}
	public double getZeit() {
		return zeit;
	}
	public void setZeit(double zeit) {
		this.zeit = zeit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isQualifiziert() {
		return qualifiziert;
	}
	public void setQualifiziert(boolean qualifiziert) {
		this.qualifiziert = qualifiziert;
	}
}
