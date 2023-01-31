package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Desempenho {
    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.03").setScale(2, RoundingMode.HALF_UP);
        }
    },
    BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.10").setScale(2, RoundingMode.HALF_UP);
        }
    },
    OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.3").setScale(2, RoundingMode.HALF_UP);
        }
    };

    public abstract BigDecimal percentualReajuste();

}
