package mediator;

public class Proprietario implements Imobiliaria {
    private static Proprietario instancia = new Proprietario();

    private Proprietario() {
    }

    public static Proprietario getInstancia() {
        return instancia;
    }

    public String receberPedidoDeLocacao(String mensagem) {
        return "O proprietário recebeu seu pedido de locação: " + mensagem;
    }

    public String receberPropostaDeAluguel(String mensagem) {
        return "O proprietário recebeu sua proposta de aluguel: " + mensagem;
    }
}
