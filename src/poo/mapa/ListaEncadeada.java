 package poo.mapa;

import poo.excecoes.*;
import poo.lista.*;

public class ListaEncadeada<K, V> implements Map<K, V> {
	protected PositionList<Entry<K, V>> lista;

	public ListaEncadeada() {
		lista = new NodePositionList<Entry<K, V>>();
	}

	protected void verificaChave(K chave) throws InvalidKeyException {
		if (chave == null)
			throw new InvalidKeyException("Chave inválida: null");
	}

	public int size() {
		return lista.size();
	}

	public boolean isEmpty() {
		return lista.isEmpty();
	}


	public V put(K chave, V valor) throws InvalidKeyException {
		verificaChave(chave);

		for (Position<Entry<K, V>> p : lista.positions()) {
			Entry<K, V> entrada = p.element();
			if (entrada.getKey().equals(chave)) {
				// Encontrou uma entrada com a mesma chave
				// Substitui o valor e retorna o antigo
				V valorAntigo = entrada.getValue();
				lista.set(p, new EntryMapa<K, V>(chave, valor));
				return valorAntigo;
			}
		}

		lista.addLast(new EntryMapa<K, V>(chave, valor));
		return null;
	}

	public V get(K chave) throws InvalidKeyException {
		verificaChave(chave);

		// Percorre a lista procurando a entrada com a chave fornecida
		for (Position<Entry<K, V>> p : lista.positions()) {
			Entry<K, V> entrada = p.element();
			if (entrada.getKey().equals(chave)) {
				return entrada.getValue();
			}
		}

		return null;
	}

	public V remove(K chave) throws InvalidKeyException {
		verificaChave(chave);

		// Percorre a lista procurando a entrada com a chave fornecida
		for (Position<Entry<K, V>> p : lista.positions()) {
			Entry<K, V> entrada = p.element();
			if (entrada.getKey().equals(chave)) {
				// Encontrou a entrada, remove da lista
				V valorRemovido = entrada.getValue();
				lista.remove(p);
				return valorRemovido;
			}
		}
		// Nenhuma entrada com a chave fornecida foi encontrada
		return null;
	}

	public Iterable<K> keySet() {
		PositionList<K> chaves = new NodePositionList<K>();

		// Percorre todas as entradas e adiciona as chaves na lista
		for (Entry<K, V> entrada : lista) {
			chaves.addLast(entrada.getKey());
		}

		return chaves;
	}

	public Iterable<V> values() {
		PositionList<V> valores = new NodePositionList<V>();

		// Percorre todas as entradas e adiciona os valores na lista
		for (Entry<K, V> entrada : lista) {
			valores.addLast(entrada.getValue());
		}
		return valores;
	}

	public Iterable<Entry<K, V>> entrySet() {
		return lista;
	}
}

