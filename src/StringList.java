
public class StringList {

	String[] elements;
	int amount;

	public StringList(int n) {
		if (n < 0) {
			n = 0;
		}
		this.elements = new String[n];
		this.amount = 0;
	}

	public void add(String el) {
		int n = this.elements.length;
		if (amount >= n) {
			throw new IllegalArgumentException();
		}
		this.elements[this.amount] = el;
		this.amount++;
	}

	public String get(int i) {
		return (i >= 0 && i < this.amount) ? this.elements[i] : null;
	}

	public void set(int i, String el) {
		if (i < 0 || i >= this.amount) {
			throw new IllegalArgumentException();
		}
		this.elements[i] = el;
	}

	public int index(String el) {
		for (int i = 0; i < this.elements.length; i++) {
			if (equalsWithNullCheck(this.elements[i], el)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(String el) {
		for (int i = 0; i < this.elements.length; i++) {
			if (equalsWithNullCheck(this.elements[i], el)) {
				return true;
			}
		}
		return false;
	}

	public int getSize() {
		return amount;
	}

	public String toString() {
		String result = "<Stringlist[";
		for (int i = 0; i < this.elements.length; i++) {
			if (i == (this.elements.length - 1)) {
				result += this.elements[i] + "]>";
				return result;
			}
			result += this.elements[i] + ", ";
		}
		return result + "]>";
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof StringList) {
			StringList that = (StringList) other;
			//test if amount attribute is the same
			if (this.getSize() != that.getSize()) {
				return false;
			}
			//test if length is the same
			if (this.elements.length != that.elements.length) {
				return false;
			}
			//test all strings in the array
			for (int i = 0; i < this.elements.length; i++) {
				if (!equalsWithNullCheck(this.get(i), that.get(i))) {
					return false;	
				}
			}
			return true;
		}
		return false;
	}
	
	private static boolean equalsWithNullCheck(String string1, String string2) {
		if ((string1 == null) && (string2 == null)) {
			return true;
		}
		if ((string1 == null) ^ (string2 == null)) {
			return false;
		}
		return (string1.equals(string2));
	}

}
