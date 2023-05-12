package u4_w2_d5;

public class Catalogo {

	public static void main(String[] args) {

		Archivio myArchivio = new Archivio();
		CatalogoBibliotecario libro1 = new Libro("ES-6473", "Il selvaggio", 2003, 582, "Marriagas", "Romanzo");
		CatalogoBibliotecario libro2 = new Libro("ES-342", "titolo", 2022, 452, "autore", "Romanzo");
		CatalogoBibliotecario rivista1 = new Riviste("is-543", "title", 2011, 32, Periodicita.MENSILE);
		CatalogoBibliotecario rivista2 = new Riviste("es-32", "topolino", 1945, 100, Periodicita.SETTIMANALE);
		myArchivio.aggiungiElemento(libro1);
		myArchivio.aggiungiElemento(libro2);
		myArchivio.aggiungiElemento(rivista1);
		myArchivio.aggiungiElemento(rivista2);
		myArchivio.saveOnDisk();
	}

}
