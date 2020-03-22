package clase;

public class FacturaCumparare implements IServicii{
	protected String furnizor;
	protected float valoareFactura;
	protected String numeServiciu;
	
	public FacturaCumparare(String furnizor, float valoareFactura,
			String numeServiciu) {
		super();
		this.furnizor = furnizor;
		this.valoareFactura = valoareFactura;
		this.numeServiciu = numeServiciu;
	}

	@Override
	public void achizitieServiciu() {
		System.out.println(numeServiciu);
		
	}

	@Override
	public void populareValoareServiciu() {
		if(numeServiciu == "Cathering")
			System.out.println("Valoare serviciu per ora: 50");
		else
			System.out.println("Acest serviciu nu exista");
		
	}	
}
