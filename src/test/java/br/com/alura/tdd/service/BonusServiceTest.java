package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void funcionarioComSalarioMuitoAltoNaoPodeReceberBonus() {
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class,() -> service.calcularBonus(new Funcionario("Marlos", LocalDate.now(), new BigDecimal("12000"))));
    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario() {
        BonusService service = new BonusService();
        assertEquals(new BigDecimal("100.00"), service.calcularBonus(new Funcionario("Marlos", LocalDate.now(), new BigDecimal("1000"))));
    }

}