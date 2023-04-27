package mediator;

public class Locador implements Imobiliaria {
    private static Locador instancia = new Locador();

    private Locador() {
    }

    public static Locador getInstancia() {
        return instancia;
    }

    public String receberPedidoDeLocacao(String mensagem) {
        return "O locador recebeu seu pedido de locação: " + mensagem;
    }

    public String receberPropostaDeAluguel(String mensagem) {
        return "O locador recebeu sua proposta de aluguel: " + mensagem;
    }
}
