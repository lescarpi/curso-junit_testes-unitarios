package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    ReajusteService service;
    Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void reajusteDeveriaSerTresPorCentoQuandoDesempenhoADesejar() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDezPorCentoQuandoDesempenhoBom() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerTrintaPorCentoQuandoDesempenhoOtimo() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1300.00"), funcionario.getSalario());
    }

}
