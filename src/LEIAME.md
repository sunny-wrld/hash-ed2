# Implementação do TAD Mapa usando Lista Duplamente Encadeada

## Classes Criadas

### 1. MapaLista.java
Implementação concreta da interface Map<K,V> usando uma lista duplamente encadeada (NodePositionList) para armazenar as entradas do mapa.

**Estrutura:**
- `protected PositionList<Entry<K, V>> lista` - Lista que armazena os pares chave-valor

**Métodos Principais:**
- `size()` - Retorna o número de elementos no mapa
- `isEmpty()` - Verifica se o mapa está vazio
- `put(K chave, V valor)` - Insere ou atualiza um par chave-valor
- `get(K chave)` - Retorna o valor associado a uma chave
- `remove(K chave)` - Remove e retorna o valor de uma chave
- `keySet()` - Retorna iterável com todas as chaves
- `values()` - Retorna iterável com todos os valores
- `entrySet()` - Retorna iterável com todas as entradas

**Classe Interna:**
- `EntradaMapa<K,V>` - Implementa Entry<K,V>, armazena pares chave-valor

**Funcionamento:**
A implementação usa busca sequencial na lista para todas as operações. Quando uma chave já existe em put(), o valor é atualizado. Chaves nulas geram InvalidKeyException.

**Complexidade:**
- put(): O(n) - precisa percorrer a lista para verificar duplicatas
- get(): O(n) - busca sequencial
- remove(): O(n) - busca sequencial
- keySet(), values(), entrySet(): O(n) - percorre toda a lista

### 2. TesteMapaLista.java
Programa de teste completo que demonstra todas as funcionalidades do MapaLista.

**Testes Realizados:**
1. Verificação de mapa vazio
2. Inserção de múltiplas entradas
3. Recuperação de valores (get)
4. Atualização de valores existentes
5. Iteração sobre chaves, valores e entradas
6. Remoção de entradas
7. Tratamento de chaves não existentes
8. Teste com diferentes tipos (Integer e String)
9. Validação de exceções (chave nula)

## Diagrama da Estrutura (conforme imagem fornecida)

```
header -> [9|nove] -> [6|seis] -> [5|cinco] -> [8|oito] -> trailer
          ↑                                                  ↑
     nodes/positions                                    entries
```

Cada nó da lista duplamente encadeada contém:
- Referência ao nó anterior
- Referência ao próximo nó
- Objeto Entry<K,V> com a chave e valor

## Uso dos Métodos do TAD Lista

A implementação utiliza os seguintes métodos da PositionList:
- `size()` - Para retornar tamanho do mapa
- `isEmpty()` - Para verificar se mapa está vazio
- `positions()` - Para iterar sobre as posições e buscar chaves
- `set(p, e)` - Para atualizar valor de uma entrada existente
- `addLast(e)` - Para adicionar nova entrada no final
- `remove(p)` - Para remover uma entrada

## Como Executar

1. Compilar:
```bash
cd "C:\Users\asmag\Downloads\Mapa hash\Mapa\src"
javac poo/mapa/*.java poo/lista/*.java poo/excecoes/*.java
```

2. Executar:
```bash
java poo.mapa.TesteMapaLista
```

## Observações Importantes

- Nenhuma classe existente foi alterada
- Todas as classes e comentários estão em português
- A implementação segue a interface Map fornecida
- Usa a lista duplamente encadeada fornecida (NodePositionList)
- Todas as exceções são tratadas adequadamente
- O código foi testado e compila sem erros

