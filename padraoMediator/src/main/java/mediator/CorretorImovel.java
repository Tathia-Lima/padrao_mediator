package mediator;

public class CorretorImovel {
    private Imobiliaria imobiliaria;

    public void setImobiliaria(Imobiliaria imobiliaria) {
        this.imobiliaria = imobiliaria;
    }

    public String receberPedidoDeLocacao(String mensagem) {
        return imobiliaria.receberPedidoDeLocacao(mensagem);
    }

    public String receberPropostaDeAluguel(String mensagem) {
        return imobiliaria.receberPropostaDeAluguel(mensagem);
    }
}
