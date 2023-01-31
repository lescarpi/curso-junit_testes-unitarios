package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto() {

        BonusService service = new BonusService();
        assertAll(
                () -> assertEquals(new BigDecimal("0.00"), service.calcularBonus(new Funcionario("Marlos", LocalDate.now(), new BigDecimal("12000")))),
                () -> assertEquals(new BigDecimal("1000.00"), service.calcularBonus(new Funcionario("Marlos", LocalDate.now(), new BigDecimal("10000")))),
                () -> assertEquals(new BigDecimal("200.00"), service.calcularBonus(new Funcionario("Marlos", LocalDate.now(), new BigDecimal("2000"))))
        );

    }
}