package exemplo01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aluno {

    private String nome;

    private BigDecimal nota1;

    private BigDecimal nota2;

    public Aluno(String nome, BigDecimal nota1, BigDecimal nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota1;
    }

    public BigDecimal getMedia() {
        return this.nota1.add(nota2).divide(new BigDecimal(2), RoundingMode.HALF_EVEN);
    }
}
