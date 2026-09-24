# Desafio — Hora da prática: Interfaces no Java

## Objetivo

Explorar os fundamentos das interfaces em Java.

Em uma interface, todos os métodos são automaticamente públicos, eliminando a necessidade de utilizar a palavra reservada `public` em suas declarações. Assim como na herança, as interfaces também permitem aplicar polimorfismo, trazendo mais flexibilidade e coesão ao código.

As atividades a seguir são práticas e **não obrigatórias**.

## 1. Conversor de moeda

Crie uma interface `ConversaoFinanceira` com o método `converterDolarParaReal()`.

Em seguida, crie a classe `ConversorMoeda`, que implementa essa interface.

### Requisito

- O método deve receber um valor em dólar como parâmetro e convertê-lo para reais.

## 2. Cálculo de sala retangular

Crie uma interface `CalculoGeometrico` com os métodos:

- `calcularArea()`
- `calcularPerimetro()`

Em seguida, crie a classe `CalculadoraSalaRetangular`, que implementa essa interface.

### Requisito

- A classe deve receber a altura e a largura de uma sala retangular como parâmetros.
- Os métodos devem calcular a área e o perímetro da sala.

## 3. Tabuada de multiplicação

Crie uma interface `Tabuada` com o método `mostrarTabuada()`.

Em seguida, crie a classe `TabuadaMultiplicacao`, que implementa essa interface.

### Requisito

- A classe deve receber um número como parâmetro.
- O método deve exibir a tabuada desse número.

## 4. Conversor de temperatura

Crie uma interface `ConversorTemperatura` com os métodos:

- `celsiusParaFahrenheit()`
- `fahrenheitParaCelsius()`

Em seguida, implemente a classe `ConversorTemperaturaPadrao`.

### Requisito

- A classe deve aplicar as fórmulas de conversão de temperatura.
- A classe deve exibir os resultados das conversões.

## 5. Cálculo de preço final

Crie uma interface `Calculavel` com o método:

```java
double calcularPrecoFinal();
```

Implemente essa interface nas classes `Livro` e `ProdutoFisico`.

### Requisito

- Cada classe deve retornar o preço final considerando descontos ou taxas adicionais.
- A lógica de cálculo pode ser diferente para cada tipo de item.

## 6. Produtos e serviços vendáveis

Crie uma interface `Vendavel` com métodos para:

- Calcular o preço total de um produto com base na quantidade comprada.
- Aplicar descontos.

Implemente essa interface nas classes `Produto` e `Servico`.

### Requisito

- Cada classe deve fornecer sua própria lógica de cálculo do preço.
- Considere a quantidade comprada e os descontos aplicáveis.

## Orientação geral

Utilize `implements` para indicar que uma classe implementa uma interface. Aproveite o polimorfismo para trabalhar com objetos de classes diferentes por meio do tipo da interface, sem duplicar comportamentos comuns.

Este README contém apenas os enunciados das atividades, sem soluções.
