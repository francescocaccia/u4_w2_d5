package u4_w2_d5;

public class Riviste extends CatalogoBibliotecario {

	private Periodicita periodicita;

	public Riviste(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);

		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

}
