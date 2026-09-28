# ☕ Exercícios de ArrayList, Casting e instanceof em Java

Este projeto contém exercícios práticos em **Java** para aprimorar os conhecimentos em **ArrayList**, **casting de objetos**, **instanceof**, **herança**, **interfaces** e **loops**.

## 🎯 Objetivo

Praticar os seguintes conceitos:

- `ArrayList`
- Loop `foreach`
- Herança
- Casting de objetos
- `instanceof`
- Classes e objetos
- Interfaces
- Polimorfismo
- Cálculos utilizando listas
- Manipulação de objetos dentro de listas

---

## Exercício 1 — ArrayList e foreach

Crie um `ArrayList` de `String` contendo alguns elementos.

Depois, utilize um loop `foreach` para percorrer a lista e imprimir cada elemento.

### Conceitos praticados

- `ArrayList`
- `String`
- Método `add()`
- Loop `foreach`
- Percorrer listas

---

## Exercício 2 — Herança e Casting

Crie uma classe chamada `Animal`.

Depois, crie uma classe chamada `Cachorro` que herde de `Animal`.

```java
public class Cachorro extends Animal {
    
}
```

Em seguida:

1. Crie um objeto da classe `Cachorro`.
2. Faça o casting desse objeto para a classe `Animal`.
3. Armazene o resultado em uma variável do tipo `Animal`.

### Conceitos praticados

- Herança
- `extends`
- Classes e objetos
- Casting
- Conversão entre tipos relacionados

---

## Exercício 3 — Casting com instanceof

Modifique o exercício anterior adicionando uma verificação com `instanceof`.

Antes de realizar determinado casting, verifique se o objeto pertence ao tipo esperado.

Exemplo de estrutura:

```java
if (objeto instanceof Cachorro) {
    // Realizar o casting
}
```

### Conceitos praticados

- `instanceof`
- Casting de objetos
- Verificação de tipos
- Herança
- Segurança durante conversões

---

## Exercício 4 — Lista de Produtos

Crie uma classe chamada `Produto` com os seguintes atributos:

```java
String nome;
double preco;
```

Depois:

1. Crie um `ArrayList` de produtos.
2. Adicione diferentes produtos à lista.
3. Utilize um loop para percorrer os produtos.
4. Some os preços.
5. Calcule o preço médio.
6. Imprima o resultado.

A média pode ser calculada utilizando:

```text
media = soma dos preços / quantidade de produtos
```

### Conceitos praticados

- Classes e objetos
- `ArrayList<Produto>`
- Loops
- Acumuladores
- Cálculo de média

---

## Exercício 5 — Interface Forma

Crie uma interface chamada `Forma` contendo o método:

```java
double calcularArea();
```

Depois, crie duas classes que implementem essa interface:

```text
Forma
├── Circulo
└── Quadrado
```

As classes `Circulo` e `Quadrado` devem possuir suas próprias implementações do método `calcularArea()`.

Em seguida:

1. Crie diferentes objetos `Circulo` e `Quadrado`.
2. Crie um `ArrayList<Forma>`.
3. Adicione os objetos à lista.
4. Percorra a lista utilizando um loop.
5. Chame `calcularArea()` para cada objeto.
6. Imprima as áreas calculadas.

### Conceitos praticados

- Interfaces
- `implements`
- Polimorfismo
- `ArrayList` de interfaces
- Sobrescrita de métodos
- Loop `foreach`

---

## Exercício 6 — Conta Bancária com Maior Saldo

Crie uma classe chamada `ContaBancaria` com os seguintes atributos:

```java
String numeroConta;
double saldo;
```

Depois:

1. Crie um `ArrayList<ContaBancaria>`.
2. Adicione contas com diferentes saldos.
3. Percorra a lista utilizando um loop.
4. Compare os saldos das contas.
5. Encontre a conta que possui o maior saldo.
6. Imprima o número da conta e seu saldo.

### Conceitos praticados

- Classes e objetos
- `ArrayList<ContaBancaria>`
- Loops
- Comparação de valores
- Busca em listas
- Manipulação de objetos

---

## 📁 Estrutura sugerida

```text
src/
├── exercicio1/
│   └── desafio8.Main.java
│
├── exercicio2/
│   ├── Animal.java
│   ├── Cachorro.java
│   └── desafio8.Main.java
│
├── exercicio3/
│   ├── Animal.java
│   ├── Cachorro.java
│   └── desafio8.Main.java
│
├── exercicio4/
│   ├── Produto.java
│   └── desafio8.Main.java
│
├── exercicio5/
│   ├── Forma.java
│   ├── Circulo.java
│   ├── Quadrado.java
│   └── desafio8.Main.java
│
└── exercicio6/
    ├── ContaBancaria.java
    └── desafio8.Main.java
```

---

## 🚀 Ordem recomendada

Os exercícios foram organizados para aumentar gradualmente a dificuldade:

**Exercício 1** → `ArrayList` e `foreach`

**Exercício 2** → Herança e casting

**Exercício 3** → `instanceof` e casting

**Exercício 4** → Lista de objetos e cálculo de média

**Exercício 5** → Interfaces e polimorfismo

**Exercício 6** → Busca e comparação entre objetos

O objetivo é desenvolver cada exercício individualmente e compreender **como os objetos podem ser armazenados, percorridos, convertidos e manipulados dentro de coleções Java**.