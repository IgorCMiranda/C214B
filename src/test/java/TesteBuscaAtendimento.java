import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TesteBuscaAtendimento {

    AtendimentoSerivce service;

    BuscaAtendimento buscaAtendimento;

    @Before
    public void setup() {
        service = new MockAtendimentoService();
        buscaAtendimento = new BuscaAtendimento(service);
    }

    //Teste de sucesso
    @Test
    public void testeBuscaAtendimentoPedro(){

        Atendimento pedro = buscaAtendimento.buscaAtendimento("Pedro");

        assertEquals("Pedro", pedro.getNome());
        assertEquals(18, pedro.getHoraAtendimento(), 0.1);
        assertEquals("noturno", pedro.getPeriodo());
    }

    @Test
    public void testeValidaHoraPedro(){
        Atendimento pedro1 = buscaAtendimento.buscaAtendimento("Pedro");
        boolean pedro = buscaAtendimento.validationTime(pedro1.getHoraAtendimento());

        assertTrue(pedro);
    }

    @Test
    public void testeValidaPeriodoPedro(){
        Atendimento pedro1 = buscaAtendimento.buscaAtendimento("Pedro");
        boolean pedro = buscaAtendimento.validationPeriodo(pedro1.getPeriodo());

        assertTrue(pedro);
    }

    //Testes de falhas
    @Test
    public void testeBuscaAtendimentoAmanda(){
        Atendimento amanda = buscaAtendimento.buscaAtendimento("Amanda");

        assertNotEquals("Amanda", amanda.getNome());
        assertNotEquals(12, amanda.getHoraAtendimento(), 0.1);
        assertNotEquals("integral", amanda.getPeriodo());
    }


    @Test
    public void testeValidaHoraAmanda(){
        Atendimento amanda1 = buscaAtendimento.buscaAtendimento("amanda");
        boolean amanda = buscaAtendimento.validationTime(amanda1.getHoraAtendimento());

        assertFalse(amanda);
    }


    @Test
    public void testeValidaPeriodoAmanda(){
        Atendimento amanda1 = buscaAtendimento.buscaAtendimento("pedro");
        boolean amanda = buscaAtendimento.validationPeriodo(amanda1.getPeriodo());

        assertFalse(amanda);
    }


}
