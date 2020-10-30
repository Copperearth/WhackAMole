
public class Wettlauf
{
	private Laeufer[] laeuferfeld;
	private int anzahlBahnen;
	private int anzahlLaeufer;
	public Wettlauf(int i)
	{
		this.laeuferfeld = new Laeufer[i];
		this.anzahlBahnen = i;
		this.anzahlLaeufer = 0;
	}
	public boolean bahnBelegt(int i)
	{
		return laeuferfeld[i-1] != null;
	}
	public void anDenStart(int i, Laeufer n)
	{
		if(laeuferfeld[i-1] == null && i <= this.anzahlBahnen && i > 0)
		{
			laeuferfeld[i-1] = n;
			this.anzahlLaeufer++;
		}
	}
	public double zeitMessen()
	{
		return Math.random() * 10 + 10;
	}
	public void rennenLaufen()
	{
		if(anzahlLaeufer>1)
		{
			for(int i = 0; i< laeuferfeld.length; i++)
			{
				if(laeuferfeld[i] != null)
				{
					laeuferfeld[i].setZeit(zeitMessen());
				}
			}
		}
	}
	public void auswertung()
	{
		double schnellsteZeit = laeuferfeld[0].getZeit();
		double langsamsteZeit = laeuferfeld[0].getZeit();
		int posSchnellster = 0;
		int posZweitschnellster = 0;
		int posLangsamster = 0;
		for(int i = 1; i < laeuferfeld.length; i++)
		{
			if(laeuferfeld[i] != null)
			{
				if(laeuferfeld[i].getZeit() < schnellsteZeit)
				{
					schnellsteZeit = laeuferfeld[i].getZeit();
					posZweitschnellster = posSchnellster;
					posSchnellster = i;
				}
				if(laeuferfeld[i].getZeit() > langsamsteZeit)
				{
					langsamsteZeit = laeuferfeld[i].getZeit();
					posLangsamster = i;
				}
			}
		}
		System.out.println("Sieger: " + laeuferfeld[posSchnellster].getName() + " Zeit: " + laeuferfeld[posSchnellster].getZeit()
				+ " \nZweiter Platy: " + laeuferfeld[posZweitschnellster].getName() + " Zeit: " + laeuferfeld[posZweitschnellster].getZeit()
				+ "\n Letzter: " + laeuferfeld[posLangsamster].getName() + " Zeit: " + laeuferfeld[posLangsamster].getZeit());
	}
}
