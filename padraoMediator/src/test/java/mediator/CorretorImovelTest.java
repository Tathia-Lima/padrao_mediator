package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorretorImovelTest {
    @Test
    public void testReceberPedidoDeLocacao() {
        CorretorImovel corretor = new CorretorImovel();
        corretor.setImobiliaria(Proprietario.getInstancia());
        assertEquals("O proprietário recebeu seu pedido de locação: Olá, gostaria de alugar o imóvel na rua X",
                corretor.receberPedidoDeLocacao("Olá, gostaria de alugar o imóvel na rua X"));
    }

    @Test
    public void testReceberPropostaDeAluguel() {
        CorretorImovel corretor = new CorretorImovel();
        corretor.setImobiliaria(Locador.getInstancia());
        assertEquals("O locador recebeu sua proposta de aluguel: Valor do aluguel: R$ 1.000,00",
                corretor.receberPropostaDeAluguel("Valor do aluguel: R$ 1.000,00"));
    }
}