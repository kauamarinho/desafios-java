package desafio3.TabuadaMultiplicacao;

class TabuadaMultiplicacao implements Tabuada {
    double numeroTabuada;

    public TabuadaMultiplicacao(double numeroTabuada) {
        this.numeroTabuada = numeroTabuada;
    }

    public double getNumeroTabuada() {
        return numeroTabuada;
    }

    public void setNumeroTabuada(double numeroTabuada) {
        this.numeroTabuada = numeroTabuada;
    }

    @Override
    public double mostraTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }
        return numeroTabuada;
    }
}
