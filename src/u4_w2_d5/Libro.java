package u4_w2_d5;

public class Libro extends CatalogoBibliotecario {

	private String autore;
	private String genere;

	public Libro(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore,
			String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}

}
