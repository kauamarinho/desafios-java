# 📦 Exercícios de Construtores em Java

Este projeto contém exercícios práticos em **Java** para reforçar conceitos de **Programação Orientada a Objetos (POO)**, principalmente o uso de **construtores**, além de trabalhar com listas, herança e sobrescrita de métodos.

## 🎯 Objetivo

Praticar os seguintes conceitos:

- Classes e objetos
- Atributos
- Construtores
- `ArrayList`
- Método `toString()`
- Herança
- Uso do `super`
- Sobrescrita de métodos

---

## Exercício 1 — Classe Produto e ArrayList

Crie uma classe chamada `Produto` com os seguintes atributos:

```java
String nome;
double preco;
int quantidade;
```

Depois:

1. Crie uma `ArrayList` de objetos `Produto`.
2. Adicione alguns produtos à lista.
3. Imprima o tamanho da lista.
4. Recupere e exiba um produto utilizando seu índice.

Exemplo de estrutura:

```java
ArrayList<Produto> produtos = new ArrayList<>();
```

### Conceitos praticados

- Criação de objetos
- Listas de objetos
- `ArrayList`
- `add()`
- `get()`
- `size()`

---

## Exercício 2 — Método toString()

Implemente o método `toString()` na classe `Produto`.

O método deverá retornar uma representação em texto contendo as informações do produto.

Depois, imprima a lista utilizando:

```java
System.out.println(produtos);
```

### Conceitos praticados

- Sobrescrita de métodos
- `@Override`
- Método `toString()`
- Representação textual de objetos

---

## Exercício 3 — Construtor da classe Produto

Modifique a classe `Produto` adicionando um construtor que receba os valores necessários para inicializar seus atributos.

Estrutura esperada:

```java
public Produto(String nome, double preco, int quantidade) {
    // Inicialização dos atributos
}
```

Depois, utilize o construtor para criar novos objetos.

Exemplo:

```java
Produto produto = new Produto("Notebook", 3500.00, 5);
```

### Conceitos praticados

- Construtores
- Parâmetros
- Palavra-chave `this`
- Inicialização de objetos

---

## Exercício 4 — Produto Perecível

Crie uma classe chamada `ProdutoPerecivel` que herde da classe `Produto`.

Adicione o atributo:

```java
String dataValidade;
```

Crie um construtor que inicialize tanto os atributos próprios quanto os atributos herdados da classe `Produto`.

Utilize:

```java
super(...);
```

para chamar o construtor da classe mãe.

Depois:

1. Crie um objeto `ProdutoPerecivel`.
2. Informe nome, preço, quantidade e data de validade.
3. Imprima as informações do objeto.

### Conceitos praticados

- Herança
- `extends`
- Construtores em classes filhas
- `super`
- Reutilização de código

---

## 📁 Estrutura sugerida

```text
src/
├── Produto.java
├── ProdutoPerecivel.java
└── desafio8.Main.java
```

---

## 🚀 Desafio

Tente desenvolver os exercícios gradualmente.

Comece apenas criando a classe `Produto`. Depois trabalhe com `ArrayList`, implemente o `toString()`, adicione o construtor e, por último, implemente a herança com `ProdutoPerecivel`.

A ideia é entender **por que cada recurso é utilizado**, em vez de apenas chegar ao código final.