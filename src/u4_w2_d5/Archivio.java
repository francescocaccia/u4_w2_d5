package u4_w2_d5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Archivio {

	private List<CatalogoBibliotecario> myListCatalogo = new ArrayList();

	public void aggiungiElemento(CatalogoBibliotecario catalogo) {
		myListCatalogo.add(catalogo);
	}

	public void rimozioneElemento(String codiceISBN) {

		myListCatalogo.stream().filter(elemento -> elemento.getCodiceISBN().equals(codiceISBN))
				.map(elementoFiltrato -> myListCatalogo.remove(elementoFiltrato));

	}

	public CatalogoBibliotecario ricercaPerISBN(String codiceISBN) {
		List<CatalogoBibliotecario> myList = myListCatalogo.stream()
				.filter(elemento -> elemento.getCodiceISBN().equals(codiceISBN)).toList();
		if (myList.isEmpty() == false) {
			return myList.get(0);
		} else {

			throw new RuntimeException("libro non trovato");
		}
	}

	public CatalogoBibliotecario ricercaPerAnno(int anno) {
		List<CatalogoBibliotecario> myList = myListCatalogo.stream()
				.filter(elemento -> elemento.getAnnoPubblicazione() == anno).toList();
		if (myList.isEmpty() == false) {
			return myList.get(0);
		} else {

			throw new RuntimeException("libro non trovato");
		}
	}

	public List<Libro> ricercaPerAutore(String autore) {

		List<Libro> myList = myListCatalogo.stream().filter(elemento -> elemento instanceof Libro)
				.map(book -> (Libro) book).filter(libro -> libro.getAutore().equals(autore)).toList();
		return myList;
	}

	public void saveOnDisk() {

		File file = new File("C:\\Users\\cacci\\eclipse-workspace\\Back-End\\u4_w2_d5/file.txt");
		if (!file.exists()) {

			try {
				file.createNewFile();
				FileUtils.writeLines(file, myListCatalogo);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
