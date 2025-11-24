package poo.mapa;

public class EntryMapa<K, V> implements Entry<K, V> {
	private K chave;
	private V valor;

	public EntryMapa(K k, V v) {
		chave = k;
		valor = v;
	}

	public K getKey() {
		return chave;
	}

	public V getValue() {
		return valor;
	}

	public V setValor(V v) {
		V antigo = valor;
		valor = v;
		return antigo;
	}

	public String toString() {
		return "(" + chave + ", " + valor + ")";
	}
}

