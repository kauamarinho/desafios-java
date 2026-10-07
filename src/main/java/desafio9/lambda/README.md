# 🧩 Desafio: Expressões Lambda em Java

## 📌 Sobre o projeto

Este projeto tem como objetivo praticar o uso de **Expressões Lambda em Java**, aplicando conceitos como **interfaces funcionais**, manipulação de **Strings**, **Collections**, ordenação de dados e **tratamento de exceções**.

Os exercícios foram organizados de forma progressiva para reforçar os conceitos de programação funcional em Java.

---

## 🚀 Exercícios

### 1. Multiplicação com Lambda

Crie uma expressão lambda que multiplique dois números inteiros.

Utilize a interface funcional `IntBinaryOperator`, do pacote `java.util.function`:

```java
IntBinaryOperator multiplicar = ...;
multiplicar.applyAsInt(5, 3); // 15
```

---

### 2. Verificação de Número Primo

Implemente uma expressão lambda que receba um número inteiro e verifique se ele é **primo**.

Utilize a interface funcional `IntPredicate`, do pacote `java.util.function`.

---

### 3. Conversão para Letras Maiúsculas

Crie uma função lambda que receba uma `String` e converta seu conteúdo para **letras maiúsculas**.

Exemplo:

```text
Entrada: java
Saída: JAVA
```

---

### 4. Verificação de Palíndromo

Crie uma expressão lambda que verifique se uma `String` é um **palíndromo**.

Utilize a interface funcional `Predicate<String>`, do pacote `java.util.function`:

```java
Predicate<String> verificarPalindromo = ...;
verificarPalindromo.test("arara"); // true
```

**Dica:** utilize o método `reverse()` da classe `StringBuilder`.

Exemplo:

```text
Entrada: arara
Saída: true
```

---

### 5. Multiplicação dos Elementos de uma Lista

Implemente uma expressão lambda que receba uma lista de números inteiros e faça com que cada número seja **multiplicado por 3**.

Exemplo:

```text
Antes:  [1, 2, 3, 4, 5]
Depois: [3, 6, 9, 12, 15]
```

**Dica:** utilize o método `replaceAll()`, que recebe uma interface funcional como parâmetro.

---

### 6. Ordenação de Strings

Crie uma expressão lambda que ordene uma lista de `String` em **ordem alfabética**.

Exemplo:

```text
Antes:
[Java, Python, CSharp, JavaScript]

Depois:
[CSharp, Java, JavaScript, Python]
```

**Dica:** o método `sort()` pode receber uma expressão lambda para definir a comparação entre os elementos.

---

### 7. Divisão e Tratamento de Exceção

Crie uma função lambda que receba dois números e divida o primeiro pelo segundo.

Caso o segundo número seja `0`, a função deverá lançar uma exceção do tipo:

```java
ArithmeticException
```

Exemplo:

```text
10 / 2 = 5
```

Caso seja realizada uma divisão por zero:

```text
10 / 0
```

Resultado esperado:

```text
ArithmeticException
```

---

## 🛠️ Tecnologias e Conceitos

- Java
- Expressões Lambda
- Interfaces Funcionais
- Collections
- List
- `replaceAll()`
- `sort()`
- `StringBuilder`
- Tratamento de Exceções
- Programação Funcional

---

## 🎯 Objetivo

Ao concluir os exercícios, será possível compreender melhor como as **expressões lambda** simplificam a implementação de comportamentos em Java, principalmente ao trabalhar com interfaces funcionais e operações sobre coleções.