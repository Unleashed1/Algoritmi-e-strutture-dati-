import java.util.LinkedList;
import java.util.ArrayList;

public class ChainHashTable extends AbstractHashTable {
	// Un array di LinkedList per le liste di trabocco
	private LinkedList<Entry> [] table;
	
	// Costruttori
	public ChainHashTable(int cap, int p, double lambda) {
		super(cap, p, lambda);
	}
	public ChainHashTable(int cap, int p) {
		super(cap, p); // massimo fattore di carico predefinito
	}
	public ChainHashTable(int cap) {
		super(cap); // primo predefinito
	}
	public ChainHashTable() {
		super(); // capacità predefinita
	}
	
	// Metodi non implementati in AbstractHashTable
	protected void createTable() {
		return;
	}
	public int get(String k) {
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


