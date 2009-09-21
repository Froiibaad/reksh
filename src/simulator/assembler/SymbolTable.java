package simulator.assembler;

import java.util.Hashtable;
import java.util.ArrayList;


class Address {
	public short val;
	public Address next;
	public Address(short val) {this.val = val; next = null;}
}


class Node {
	public static final int Const = 0, Label = 1;
	public int kind;  //Const, Label
	public String name;
	public short value;
	public boolean defined;
	public Address adr;

	public Node(int kind, String name, short value) {
		this.kind = kind;
		this.name = name;
		this.value = value;
		defined = true;
		adr = null;
	}
	public Node(int kind, String name) {
		this.kind = kind;
		this.name = name;
		this.value = 0;
		defined = false;
		adr = null;
	}

	public void addAddress(short val) {
		if (adr == null) {
			adr = new Address(val);
		} else {
			Address a = new Address(val);
			a.next =adr;
			adr = a;
		}
	}

	public String toString() {
		return "(" + kind + "," + name + "," + value + "," + defined + ")";
	}
}


public class SymbolTable {
	private Hashtable table;
	private ArrayList<String> keys;

	public SymbolTable() {
		table = new Hashtable();
		keys = new ArrayList<String>();
	}

	// Vraca kreirani Node
	public Node insert(int kind, String name, short val) {
		Node n = new Node(kind, name, val);
		table.put(name, n);
		keys.add(name);
		return n;
	}
	public Node insert(int kind, String name) {
		Node n = new Node(kind, name);
		table.put(name, n);
		keys.add(name);
		return n;
	}

	//Povratna vrednost je cvor za trazeno ime ili null ako cvor ne postoji
	public Node find(String name) {
		return (Node)table.get(name);
	}

	//Uklanja jedan cvor iz tabele
	public Node remove() {
		String name = null;
		if (!keys.isEmpty())
		  name = keys.remove(0);
		if (name == null) {
			return null;
		} else {
			return (Node)table.remove(name);
		}
	}

	//Povratna vrednost je true ako je umetanje uspelo, a false ako nije
	//sto se desava ako vec postoji cvor sa tim imenom
	/*
	public boolean insert(int kind, String name, Integer val) {
		if (find(name) != null) return false;
		Node n = new Node(kind, name, val);
		table.put(name, n);
		return true;
	}
	public boolean insert(int kind, String name) {
		if (find(name) != null) return false;
		Node n = new Node(kind, name);
		table.put(name, n);
		return true;
	}
	*/

	//Za potrebe testiranja
	public void dump() {
		System.out.println("-----------------------------------------------------");
		System.out.println("SYMBOL TABLE DUMP:\n" + table.toString());
		System.out.println("-----------------------------------------------------");
	}
}
