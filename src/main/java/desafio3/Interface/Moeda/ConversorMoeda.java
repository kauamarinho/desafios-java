package desafio3.Interface.Moeda;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5;
    }
}