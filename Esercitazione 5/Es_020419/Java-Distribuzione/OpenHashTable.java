import java.util.LinkedList;

public class OpenHashTable extends AbstractHashTable {
	// Un array di Entry per la tabella
	private Entry[] table;
	// marcatore di cella vuota ma da esaminare durante probing
	private final Entry DEFUNCT = new Entry(null, 0); 
	
	// Costruttori
	public OpenHashTable(int cap, int p, double lambda) {
		super(cap, p, lambda);
	}
	public OpenHashTable(int cap, int p) {
		super(cap, p); // massimo fattore di carico predefinito
	}
	public OpenHashTable(int cap) {
		super(cap); // primo predefinito
	}
	public OpenHashTable() {
		super(); // capacità predefinita
	}
		
	// Metodi non implementati in AbstractHashTable
	protected void createTable() {
		return;
	}
	
	public int get(String k) { // restituisce -1 se chiave non trovata
		return -1;
	}
	
	public int put(String k, int value) {
		return -1;
	}
	
	public void remove(String k) {
		return;
	}
	
	public Iterable<Entry> entrySet() {
		return null;
	}
	
}


