# ☕ Desafio Java — Collections, Comparable e Listas

Este projeto contém exercícios práticos em **Java** para reforçar conhecimentos sobre **ordenação de coleções**, `ArrayList`, `LinkedList`, `List`, `Comparable`, `compareTo()` e `Collections.sort()`.

## 🎯 Objetivo

Praticar os seguintes conceitos:

- `ArrayList`
- `LinkedList`
- Interface `List`
- `Collections.sort()`
- Interface `Comparable`
- Método `compareTo()`
- Ordenação de objetos
- Polimorfismo
- Manipulação de coleções

---

## Exercício 1 — Ordenando números

Crie uma lista contendo números inteiros.

Utilize:

```java
Collections.sort();
```

para ordenar os números em **ordem crescente**.

Depois, imprima a lista já ordenada.

### Conceitos praticados

- `ArrayList`
- `Integer`
- `Collections`
- `Collections.sort()`
- Ordenação de dados

---

## Exercício 2 — Classe Titulo e Comparable

Crie uma classe chamada `Titulo`.

A classe deverá possuir o seguinte atributo:

```java
String nome;
```

Depois, faça a classe implementar a interface:

```java
Comparable<Titulo>
```

Implemente o método:

```java
compareTo()
```

para definir como objetos da classe `Titulo` serão comparados.

### Estrutura esperada

```text
Titulo
│
├── nome
│
└── compareTo()
```

### Conceitos praticados

- Classes e objetos
- Interface `Comparable`
- `compareTo()`
- Comparação entre objetos
- Ordenação personalizada

---

## Exercício 3 — Ordenando objetos Titulo

Utilizando a classe `Titulo` criada no exercício anterior:

1. Crie vários objetos `Titulo`.
2. Adicione os objetos a uma lista.
3. Utilize `Collections.sort()` para ordenar a lista.
4. Imprima os títulos depois da ordenação.

A ordenação deverá utilizar a implementação do método `compareTo()` criada no exercício anterior.

### Conceitos praticados

- `ArrayList<Titulo>`
- `Comparable`
- `compareTo()`
- `Collections.sort()`
- Ordenação de objetos

---

## Exercício 4 — ArrayList e LinkedList

Crie uma variável utilizando a interface:

```java
List<String>
```

Primeiro, utilize uma implementação com:

```java
ArrayList
```

Adicione alguns elementos e imprima a lista.

Depois, experimente utilizar:

```java
LinkedList
```

Adicione elementos novamente e imprima a lista.

Observe como as duas estruturas podem ser utilizadas através da interface `List`.

### Conceitos praticados

- `List`
- `ArrayList`
- `LinkedList`
- Interfaces
- Coleções

---

## Exercício 5 — List e Polimorfismo

Modifique o exercício anterior para trabalhar sempre com a variável declarada através da interface `List`.

A ideia é perceber que podemos ter:

```java
List<String>
```

e escolher diferentes implementações para essa variável.

Por exemplo:

```text
List
├── ArrayList
└── LinkedList
```

O restante do código pode continuar trabalhando com a interface `List`, sem precisar depender diretamente de uma implementação específica.

### Conceitos praticados

- Polimorfismo
- Interfaces
- `List`
- `ArrayList`
- `LinkedList`
- Programação orientada a interfaces

---

## 📁 Estrutura sugerida

```text
src/
│
├── exercicio1/
│   └── desafio8.Main.java
│
├── exercicio2/
│   ├── Titulo.java
│   └── desafio8.Main.java
│
├── exercicio3/
│   ├── Titulo.java
│   └── desafio8.Main.java
│
├── exercicio4/
│   └── desafio8.Main.java
│
└── exercicio5/
    └── desafio8.Main.java
```

---

## 📚 Conceitos importantes

### Collections.sort()

O método `Collections.sort()` pode ser utilizado para ordenar elementos de uma lista.

Para tipos que já possuem uma ordem natural, como `Integer` e `String`, essa ordenação já está definida.

Para objetos criados por nós, podemos definir essa ordem utilizando `Comparable`.

---

### Comparable

A interface `Comparable` permite definir uma **ordem natural** para objetos de uma classe.

```java
implements Comparable<Tipo>
```

Ao implementar essa interface, precisamos implementar o método:

```java
compareTo()
```

Esse método determina como dois objetos serão comparados.

---

### ArrayList

`ArrayList` é uma implementação da interface `List` baseada em uma estrutura de array dinâmico.

```java
List<String> lista = new ArrayList<>();
```

---

### LinkedList

`LinkedList` também implementa `List`, mas utiliza internamente uma estrutura de lista ligada.

```java
List<String> lista = new LinkedList<>();
```

---

### Polimorfismo com List

Em vez de declarar:

```java
ArrayList<String> lista = new ArrayList<>();
```

podemos programar utilizando a interface:

```java
List<String> lista = new ArrayList<>();
```

Assim, podemos posteriormente trocar a implementação:

```java
List<String> lista = new LinkedList<>();
```

sem alterar a forma principal de utilização da lista.

---

## 🚀 Ordem de aprendizado

```text
Exercício 1
    ↓
Collections.sort()
    ↓
Exercício 2
    ↓
Comparable + compareTo()
    ↓
Exercício 3
    ↓
Ordenação de objetos
    ↓
Exercício 4
    ↓
ArrayList + LinkedList
    ↓
Exercício 5
    ↓
List + Polimorfismo
```

O objetivo desses exercícios é compreender não apenas **como ordenar uma lista**, mas também como o Java permite definir **como seus próprios objetos serão comparados e ordenados**.

Além disso, os últimos exercícios ajudam a entender uma prática importante em Java: **programar utilizando interfaces**, permitindo trocar implementações como `ArrayList` e `LinkedList` com maior facilidade.