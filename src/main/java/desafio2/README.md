# Exercícios de Java — Herança e Polimorfismo

## Objetivo

Explorar na prática conceitos fundamentais de herança e polimorfismo em programação orientada a objetos:

- **`extends`:** indica que uma classe herda de outra.
- **Sobrescrita de métodos:** permite que uma subclasse redefina o comportamento de um método herdado, utilizando a anotação `@Override`.
- **Polimorfismo:** permite trabalhar com diferentes subclasses por meio de um tipo comum, aproveitando seus comportamentos específicos e evitando duplicação de código.

As atividades a seguir são **práticas e não obrigatórias**, propostas para consolidar a compreensão desses conceitos.

## 1. Carro e ModeloCarro

Crie uma classe `Carro` com métodos para representar um modelo específico ao longo de três anos.

### Requisitos

- Implemente um método para definir o nome do modelo.
- Implemente métodos para definir os preços médios de cada um dos três anos.
- Implemente métodos para calcular e exibir o menor e o maior preço.
- Crie uma subclasse `ModeloCarro` que herda de `Carro`, utilizando `extends`, para criar instâncias específicas.
- Na classe principal, utilize `ModeloCarro` para definir os preços e mostrar as informações.

## 2. Animal, Cachorro e Gato

Crie uma classe `Animal` com um método `emitirSom()`.

### Requisitos

- Crie as subclasses `Cachorro` e `Gato`, que herdam de `Animal`.
- Sobrescreva o método `emitirSom()` em cada subclasse.
- Utilize a anotação `@Override` para indicar a sobrescrita.
- Adicione o método específico `abanarRabo()` à classe `Cachorro`.
- Adicione o método específico `arranharMoveis()` à classe `Gato`.

## 3. ContaBancaria e ContaCorrente

Crie uma classe `ContaBancaria` com métodos para realizar operações bancárias.

### Requisitos

- Implemente os métodos `depositar()`, `sacar()` e `consultarSaldo()` na classe `ContaBancaria`.
- Crie uma subclasse `ContaCorrente` que herda de `ContaBancaria`.
- Adicione o método específico `cobrarTarifaMensal()` à classe `ContaCorrente`.
- O método `cobrarTarifaMensal()` deve descontar uma tarifa mensal do saldo da conta corrente.

## 4. NumerosPrimos, VerificadorPrimo e GeradorPrimo

Crie uma classe `NumerosPrimos` com métodos para trabalhar com números primos.

### Requisitos

- Implemente os métodos `verificarPrimalidade()` e `listarPrimos()` na classe `NumerosPrimos`.
- Crie as subclasses `VerificadorPrimo` e `GeradorPrimo`, que herdam de `NumerosPrimos`.
- Adicione o método específico `verificarSeEhPrimo()` à classe `VerificadorPrimo`.
- Adicione o método específico `gerarProximoPrimo()` à classe `GeradorPrimo`.

## Orientação geral

Aproveite a herança e o polimorfismo para compartilhar comportamentos e evitar duplicação de métodos. Utilize `@Override` ao sobrescrever métodos herdados.

Este README contém apenas os enunciados das atividades, sem soluções.
